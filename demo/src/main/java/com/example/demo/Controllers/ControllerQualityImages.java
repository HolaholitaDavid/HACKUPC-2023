package com.example.demo.Controllers;

import com.example.demo.Models.QualityImage;
import com.example.demo.Repository.RestbaiRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerQualityImages {

    RestbaiRepository restbaiRepository = new RestbaiRepository();
    @GetMapping("/cositas")
    public double getImageQuality(@RequestParam(name = "imageUrl") String imageUrl){
        QualityImage qualityImage = restbaiRepository.basicGet(imageUrl);
        return qualityImage.getResponse().getSolutions().getRe_condition_r1r6_international().getScore();
    }
}
