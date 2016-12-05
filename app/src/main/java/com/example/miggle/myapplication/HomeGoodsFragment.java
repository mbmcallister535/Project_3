package com.example.miggle.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeGoodsFragment extends ListFragment {
    private Points[] points;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Points first = new Points();
        first.setBoutique("Aimee");
        first.setImg("/Users/truewheeldon/Desktop/Project_3/app/src/main/res/drawable/aimee.png");
        first.setDescription("A cute little boutique selling women's clothing!");

        Points second = new Points();
        second.setBoutique("Zombie Burger");
        second.setImg("/Users/truewheeldon/Desktop/Project_3/app/src/main/res/drawable/aimee.png");
        second.setDescription("A place to get zombie related burgers in the east village!");

        points = new Points[]{first, second};
//        if (points == null)
//            return inflater.inflate(R.layout.points_fragment, container,false);

        View myView = inflater.inflate(R.layout.home_goods_fragment, container,false);



        PointsAdapter pAdapter = new PointsAdapter(getActivity(), points);
        setListAdapter(pAdapter);

        return myView;

    }
}

