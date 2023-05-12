package com.example.demo.Repository;

import org.springframework.web.client.RestTemplate;

public class RestbaiRepository {
    private final RestTemplate restTemplate  = new RestTemplate();
    private final String apiKey = "de16fead467ec83f535085d69472c4e77e3ba8edf6f7b43f994c70cd3ceb9571";

    private final String baseUrl = "https://api-us.restb.ai/vision/v2/multipredict";
    
}
