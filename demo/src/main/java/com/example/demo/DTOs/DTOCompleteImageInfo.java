package com.example.demo.DTOs;

import com.example.demo.Models.Detections;
import com.example.demo.Models.Re_features_v4;

import java.util.List;

public class DTOCompleteImageInfo {
    private DTOEnhancedImage enhancingDetails;
    private List<Detections> detections;

    public DTOCompleteImageInfo(com.example.demo.DTOs.DTOEnhancedImage enhancedImageInfo, List<Detections> detections) {
        this.detections = detections;
        enhancingDetails = enhancedImageInfo;
    }

    public com.example.demo.DTOs.DTOEnhancedImage getEnhancingDetails() {
        return enhancingDetails;
    }

    public void setEnhancingDetails(com.example.demo.DTOs.DTOEnhancedImage enhancingDetails) {
        this.enhancingDetails = enhancingDetails;
    }

    public List<Detections> getDetections() {
        return detections;
    }

    public void setDetections(List<Detections> detections) {
        this.detections = detections;
    }
}
