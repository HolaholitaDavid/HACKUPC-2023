package com.example.demo.Repository;

import com.example.demo.Models.QualityImage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static com.example.demo.Utils.ConstURLS.base_url;

public class RestbaiRepository {
    private final RestTemplate restTemplate  = new RestTemplate();
    private final String apiKey = "de16fead467ec83f535085d69472c4e77e3ba8edf6f7b43f994c70cd3ceb9571";
    private final String baseUrl = "https://api-us.restb.ai/vision/v2/multipredict";

    public QualityImage basicGet(String imageUrl){
        String finalUrl = base_url.replace("{REMAINING}",
                "?model_id=re_condition_r1r6_international&image_url="+ imageUrl);
        ResponseEntity<QualityImage> response = restTemplate.getForEntity(finalUrl, QualityImage.class);
        return response.getBody();
    }

}
