package com.example.demo.DTOs;

public class DTOEnhancedImage {
    private String baseImage;
    private String enhancedImage;
    private double baseScoreImage;
    private double enhancedScoreImage;

    public DTOEnhancedImage(String baseImage, String enhancedImage, double baseScoreImage, double enhancedScoreImage) {
        this.baseImage = baseImage;
        this.enhancedImage = enhancedImage;
        this.baseScoreImage = baseScoreImage;
        this.enhancedScoreImage = enhancedScoreImage;
    }

    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    public String getEnhancedImage() {
        return enhancedImage;
    }

    public void setEnhancedImage(String enhancedImage) {
        this.enhancedImage = enhancedImage;
    }

    public double getBaseScoreImage() {
        return baseScoreImage;
    }

    public void setBaseScoreImage(double baseScoreImage) {
        this.baseScoreImage = baseScoreImage;
    }

    public double getEnhancedScoreImage() {
        return enhancedScoreImage;
    }

    public void setEnhancedScoreImage(double enhancedScoreImage) {
        this.enhancedScoreImage = enhancedScoreImage;
    }
}
