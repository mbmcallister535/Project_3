package com.example.miggle.myapplication;

/**
 * Created by truewheeldon on 11/27/16.
 */

public class Points {
    private String boutique;
    private String description;
    private int img;
    private double latitude;
    private double longitude;

    public String getBoutique() {
        return boutique;
    }
    public void setLocation(double latitude, double longitude) {this.latitude = latitude; this.longitude = longitude;}
    public void setBoutique(String boutique) {
        this.boutique = boutique;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
    public double getLatitude() {return latitude; }
    public double getLongitude() {return longitude; }

}
