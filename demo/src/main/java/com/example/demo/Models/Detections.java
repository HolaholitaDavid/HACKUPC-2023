package com.example.demo.Models;

import java.util.List;

public class Detections {
    //private CenterPoint center_point;
    private String label;
    private List<Detail> details;
/*
    public CenterPoint getCenter_point() {
        return center_point;
    }

    public void setCenter_point(CenterPoint center_point) {
        this.center_point = center_point;
    }
*/
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}
