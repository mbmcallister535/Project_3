package com.example.miggle.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import com.google.android.gms.ads.formats.NativeAd;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PlaceActivity extends AppCompatActivity {
    ImageView bannerView;
    static final int REQUEST_IMAGE_CAPUTRE = 1;
    ImageView checkIn;
    ImageView scanReceipt;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    private static boolean timeEval(int year, int month, int day)
    {


        Date curDate = new Date();

        if(curDate.getYear() > year)
        {
            return true;
        }
        else if(curDate.getMonth() > month)
        {
            return true;
        }
        else if(curDate.getDay() > day)
        {
            return true;
        }
        return false;
    }
    private void dispatchTakePictureIntent(){
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePictureIntent.resolveActivity(getPackageManager()) != null){
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPUTRE);
        }
    }
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
        bannerView = (ImageView) findViewById(R.id.bannerView);
        scanReceipt = (ImageView) findViewById((R.id.postReceipt));
        checkIn = (ImageView) findViewById(R.id.checkinView);
        bannerView.setImageResource(place.getImg());
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        scanReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count =  sharedPreferences.getInt(place.getBoutique(),0);
                dispatchTakePictureIntent();
                count += 10;
                editor.putInt(place.getBoutique(), count);

            }
        });
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
                Date d = new Date();
//                editor.putInt(place.getBoutique()+"year",0);
//                editor.putInt(place.getBoutique()+"month",0);
//                editor.putInt(place.getBoutique()+"day",0);
//                editor.commit();
                int year = sharedPreferences.getInt(place.getBoutique()+"year",0);
                int month = sharedPreferences.getInt(place.getBoutique()+"month",0);
                int day = sharedPreferences.getInt(place.getBoutique()+"day",0);
                if(dist < 1 && (timeEval(year,month,day) || (year == 0 && month == 0 && day == 0)))
                {
                    int count =  sharedPreferences.getInt(place.getBoutique(),0);
                    if(count == 0)
                    {
                        editor.putInt(place.getBoutique(),10);
                    }
                    else {
                        count += 10;
                        editor.putInt(place.getBoutique(), count);
                    }
                    editor.putInt(place.getBoutique()+"year",d.getYear());
                    editor.putInt(place.getBoutique()+"month",d.getMonth());
                    editor.putInt(place.getBoutique()+"day",d.getDay());
                    editor.commit();

                    Toast toast = Toast.makeText(getApplicationContext(),"You have been awarded 10 points", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(dist > 1.0)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"You are to far away to check in",Toast.LENGTH_SHORT);
                    toast.show();

                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"You have already checked in today, try again tomorrow",Toast.LENGTH_SHORT);
                    toast.show();

                }


            }
        });

    }
}
