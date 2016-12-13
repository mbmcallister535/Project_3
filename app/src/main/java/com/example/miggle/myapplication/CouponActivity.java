package com.example.miggle.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class CouponActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        String activityPlaces = getIntent().getStringExtra("Place");
        final Points place = new Gson().fromJson(activityPlaces,Points.class);
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        int coupon = sharedPreferences.getInt(place.getBoutique()+"10",0);
        editor.putInt(place.getBoutique()+"10",coupon-1);
        editor.commit();
    }
}
