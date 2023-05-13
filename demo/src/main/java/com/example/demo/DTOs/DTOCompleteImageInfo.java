package com.example.demo.DTOs;

import com.example.demo.Models.Caption;
import com.example.demo.Models.Detections;
import com.example.demo.Models.Top_Prediction;

import java.util.List;

public class DTOCompleteImageInfo {
    private DTOEnhancedImage enhancingDetails;
    private List<Detections> detections;
    private Top_Prediction room_type_prediction;
    private Caption caption;

    public DTOCompleteImageInfo(DTOEnhancedImage enhancedImageInfo, List<Detections> detections, Top_Prediction room_type_prediction, Caption caption) {
        this.detections = detections;
        enhancingDetails = enhancedImageInfo;
        this.room_type_prediction = room_type_prediction;
        this.caption = caption;
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

    public Top_Prediction getRoom_type_prediction() {
        return room_type_prediction;
    }

    public void setRoom_type_prediction(Top_Prediction room_type_prediction) {
        this.room_type_prediction = room_type_prediction;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }
}
