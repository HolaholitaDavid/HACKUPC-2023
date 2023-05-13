package com.example.demo.Services;

import com.example.demo.DTOs.DTOCompleteImageInfo;
import com.example.demo.DTOs.DTOEnhancedImage;
import com.example.demo.Models.*;
import com.example.demo.Repository.RestbaiRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.demo.Utils.ConstURLS.*;

@Service
public class QualityImageService {
    private final RestbaiRepository restbaiRepository = new RestbaiRepository();

    public double getQualityIamge(String imageUrl){
        QualityImage qualityImage = restbaiRepository.getQualityImageFromUrl(imageUrl);
        Double score = qualityImage.getResponse().getSolutions().getRe_condition_r1r6_international().getScore();
        Double scoreOverTen = (6-score)/5*10;
        return scoreOverTen;
    }

    public String enhanceImage(String imageUrl) {
        QualityImage qualityImage = restbaiRepository.enhanceImage(imageUrl);
        String enhancedImageUrl = qualityImage.getResponse().getSolutions().getAuto_enhancement().getImage_url();
        return enhancedImageUrl;
    }

    public DTOCompleteImageInfo enhanceImageInformation(String imageUrl) {
        List<String> models = new ArrayList<String>(Arrays.asList(ENHANCE, SCORE, FEATURES, ROOMTYPE, CAPTION));
        QualityImage qualityImage = restbaiRepository.getModelInformation(imageUrl, models);
        return createDTO(qualityImage, imageUrl);
    }

    public DTOCompleteImageInfo enhanceImageInformation64(String imageBase64) {
        List<String> models = new ArrayList<String>(Arrays.asList(ENHANCE, SCORE, FEATURES, ROOMTYPE, CAPTION));
        QualityImage qualityImage = restbaiRepository.getModelInformation64(imageBase64, models);
        return createDTO(qualityImage, imageBase64);
    }
    private DTOCompleteImageInfo createDTO(QualityImage qualityImage, String image) {
        Solutions solutions = qualityImage.getResponse().getSolutions();
        String enhancedImage = solutions.getAuto_enhancement().getImage_url();
        double enhancedImageScore = getQualityIamge(enhancedImage);
        double baseImageScore = solutions.getRe_condition_r1r6_international().getScore();
        double scoreOverTen = (6-baseImageScore)/5*10;
        DTOEnhancedImage enhancedImageInfo = new DTOEnhancedImage(image, enhancedImage, scoreOverTen, enhancedImageScore);
        List<Detections> detections = solutions.getRe_features_v4().getDetections();
        Top_Prediction room_type_prediction = qualityImage.getResponse().getSolutions().getRe_roomtype_international().getTop_prediction();
        Caption caption = solutions.getCaption();
        return (new DTOCompleteImageInfo(enhancedImageInfo, detections, room_type_prediction, caption));
    }
}
