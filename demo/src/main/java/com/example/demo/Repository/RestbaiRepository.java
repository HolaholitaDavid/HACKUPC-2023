package com.example.demo.Repository;

import com.example.demo.Models.QualityImage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static com.example.demo.Utils.ConstURLS.base_url;
import static com.example.demo.Utils.ConstURLS.formatURL;

public class RestbaiRepository {
    private final RestTemplate restTemplate  = new RestTemplate();

    public QualityImage getQualityImageFromUrl(String imageUrl){
        String finalUrl = formatURL("re_condition_r1r6_international", imageUrl);
        ResponseEntity<QualityImage> response = restTemplate.getForEntity(finalUrl, QualityImage.class);
        return response.getBody();
    }

    public QualityImage enhanceImage(String imageUrl) {
        String finalUrl = base_url.replace("{REMAINING}", "?model_id=auto_enhancement&image_url="+imageUrl);
        ResponseEntity<QualityImage> response = restTemplate.getForEntity(finalUrl, QualityImage.class);
        return response.getBody();
    }
}
