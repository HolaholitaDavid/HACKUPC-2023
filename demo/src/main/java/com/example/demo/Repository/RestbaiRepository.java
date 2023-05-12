package com.example.demo.Repository;

import com.example.demo.Models.QualityImage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.example.demo.Utils.ConstURLS.*;
public class RestbaiRepository {
    private final RestTemplate restTemplate  = new RestTemplate();

    public QualityImage getQualityImageFromUrl(String imageUrl){
        String finalUrl = formatURL(SCORE, imageUrl);
        ResponseEntity<QualityImage> response = restTemplate.getForEntity(finalUrl, QualityImage.class);
        return response.getBody();
    }

    public QualityImage enhanceImage(String imageUrl) {
        String finalUrl = formatURL(ENHANCE, imageUrl);
        ResponseEntity<QualityImage> response = restTemplate.getForEntity(finalUrl, QualityImage.class);
        return response.getBody();
    }

    public QualityImage getModelInformation(String imageUrl, List<String> models){
        String finalUrl = formatMultiURL(models, imageUrl);
        ResponseEntity<QualityImage> response = restTemplate.getForEntity(finalUrl, QualityImage.class);
        return response.getBody();
    }
}
