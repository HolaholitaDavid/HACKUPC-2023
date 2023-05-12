package com.example.demo.Controllers;

import com.example.demo.Services.QualityImageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerQualityImages {

    private final QualityImageService qualityImageService;

    public ControllerQualityImages(QualityImageService qualityImageService) {
        this.qualityImageService = qualityImageService;
    }

    @GetMapping("/cositas")
    public double getImageQuality(@RequestParam(name = "imageUrl") String imageUrl){
        return qualityImageService.getQualityIamge(imageUrl);
    }
}
