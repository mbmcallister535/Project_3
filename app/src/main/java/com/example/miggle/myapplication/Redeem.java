package com.example.miggle.myapplication;

/**
 * Created by truewheeldon on 12/6/16.
 */

public class Redeem {
    private String percentage;
    private String offer;
    private int points_required;

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
    public void setPointsRequired(int points)
    {
        this.points_required = points;
    }
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
    public boolean enoughPoints(int points)
    {
        if(points_required >= points)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
