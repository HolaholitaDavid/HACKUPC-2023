package com.example.demo.Services;

import com.example.demo.DTOs.DTOEnhancedImage;
import com.example.demo.Models.QualityImage;
import com.example.demo.Repository.RestbaiRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.demo.Utils.ConstURLS.ENHANCE;
import static com.example.demo.Utils.ConstURLS.SCORE;

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

    public DTOEnhancedImage enhanceImageInformation(String imageUrl) {
        List<String> models = new ArrayList<String>(Arrays.asList(ENHANCE, SCORE));
        QualityImage qualityImage = restbaiRepository.getModelInformation(imageUrl, models);
        String enhancedImage = qualityImage.getResponse().getSolutions().getAuto_enhancement().getImage_url();
        double enhancedImageScore = getQualityIamge(enhancedImage);
        double baseImageScore = qualityImage.getResponse().getSolutions().getRe_condition_r1r6_international().getScore();
        return new DTOEnhancedImage(imageUrl, enhancedImage, baseImageScore, enhancedImageScore);

    }
}
