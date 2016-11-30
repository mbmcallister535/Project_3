package com.example.miggle.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;



public class PointsActivity extends ListActivity {

    private Points[] points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        Points first = new Points();
        first.setBoutique("Aimee");
        first.setImg("/Users/truewheeldon/Desktop/Project_3/app/src/main/res/drawable/aimee.png");
        first.setDescription("A cute little boutique selling women's clothing!");

        Points second = new Points();
        second.setBoutique("Zombie Burger");
        second.setImg("/Users/truewheeldon/Desktop/Project_3/app/src/main/res/drawable/aimee.png");
        second.setDescription("A place to get zombie related burgers in the east village!");

        points = new Points[]{first, second};

        PointsAdapter adapter = new PointsAdapter(this, points);

        setListAdapter(adapter);

        }
    }

