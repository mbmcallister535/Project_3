package com.example.miggle.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.formats.NativeAd;
import com.google.gson.Gson;

public class PlaceActivity extends AppCompatActivity {
    ImageView bannerView;
    ImageView checkIn;
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        String activityPlaces = getIntent().getStringExtra("Place");
        final Points place = new Gson().fromJson(activityPlaces,Points.class);
        PlaceList p = new PlaceList();
        bannerView = (ImageView) findViewById(R.id.bannerView);
        checkIn = (ImageView) findViewById(R.id.checkinView);
        bannerView.setImageResource(place.getImg());
        checkIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double user_latitude= 41.58979;
                double user_longitude = -93.6815206;
                double theta = user_longitude - place.getLongitude();
                double dist = Math.sin(deg2rad(user_latitude)) * Math.sin(deg2rad(place.getLatitude())) + Math.cos(deg2rad(user_latitude)) * Math.cos(deg2rad(place.getLatitude())) * Math.cos(deg2rad(theta));
                dist = Math.acos(dist);
                dist = rad2deg(dist);
                dist = dist * 60 * 1.1515;
                if(dist < 1 )
                {
                    Log.v("here","here");
                }


            }
        });

    }
}
