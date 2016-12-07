package com.example.miggle.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WomenFragment extends ListFragment {
    private Points[] points;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Points first = new Points();
        first.setBoutique("Aimee");
        first.setImg(R.drawable.aimee);
        first.setDescription("Women's Clothing. Shoes. Accessories. We are a charming lifestyle boutique with a little something for everyone! Over 50 different unique lines from around the world.");

        Points second = new Points();
        second.setBoutique("Blond Genius");
        second.setImg(R.drawable.blondgenius);
        second.setDescription("Blond Genius has jeans for every body. Our denim bar stocks over 150 styles of jeans for women and over 50 styles for men, all the jeans come in a wide variety of sizes and lengths. Pair your new jeans with our clothing, accessories and shoes, chosen from the trendiest fashions from New York to Los Angeles. ");

        Points third = new Points();
        third.setBoutique("Fun on 5th");
        third.setImg(R.drawable.fun);
        third.setDescription("An exceptional main street women's boutique shopping experience.");

        Points fourth = new Points();
        fourth.setBoutique("Mint L.A.");
        fourth.setImg(R.drawable.mint);
        fourth.setDescription("Mint L.A. is a trendy and affordable boutique catering to young female professionals who embrace their social life. Created for women on a budget who still want classic, timeless pieces, as well as affordable of-the-moment styles; every item is hand-selected in our Los Angeles showrooms for our amazing customers!");

        Points fifth = new Points();
        fifth.setBoutique("Repeat Boutique");
        fifth.setImg(R.drawable.repeat);
        fifth.setDescription("Insert description here");

        points = new Points[]{first, second,third,fourth,fifth};
//        if (points == null)
//            return inflater.inflate(R.layout.points_fragment, container,false);

        View myView = inflater.inflate(R.layout.activity_women_fragment, container,false);



        MenWomenHomeAdapter pAdapter = new MenWomenHomeAdapter(getActivity(), points);
        setListAdapter(pAdapter);

        return myView;

    }
}
