package com.example.demo.Services;

import com.example.demo.Models.QualityImage;
import com.example.demo.Repository.RestbaiRepository;
import org.springframework.stereotype.Service;

@Service
public class QualityImageService {
    private final RestbaiRepository restbaiRepository = new RestbaiRepository();

    public double getQualityIamge(String imageUrl){
        QualityImage qualityImage = restbaiRepository.getQualityImageFromUrl(imageUrl);
        Double score = qualityImage.getResponse().getSolutions().getRe_condition_r1r6_international().getScore();
        Double scoreOverTen = (6-score)/5*10;
        return scoreOverTen;
    }
}
