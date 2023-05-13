package com.example.demo.Controllers;

import com.example.demo.DTOs.DTOCompleteImageInfo;
import com.example.demo.DTOs.DTOEnhancedImage;
import com.example.demo.Services.QualityImageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControllerQualityImages {

    private final QualityImageService qualityImageService;

    public ControllerQualityImages(QualityImageService qualityImageService) {
        this.qualityImageService = qualityImageService;
    }

    @GetMapping("/quality")
    public double getImageQuality(@RequestParam(name = "imageUrl") String imageUrl){
        return qualityImageService.getQualityIamge(imageUrl);
    }
    @GetMapping("/quality/enhance")
    public String getImageEnhanced(@RequestParam(name = "imageUrl") String imageUrl){
        return qualityImageService.enhanceImage(imageUrl);
    }

    @GetMapping("/quality/enhance/information")
    public DTOCompleteImageInfo getInfoEnhancedImage(@RequestParam(name = "imageUrl") String imageUrl){
        return qualityImageService.enhanceImageInformation(imageUrl);
    }

    @GetMapping("/quality/enhance/informationBase64")
    public DTOCompleteImageInfo getInfoEnhancedImage64(@RequestParam(name = "imageBase64") String imageBase64){
        return qualityImageService.enhanceImageInformation64(imageBase64);
    }
}
