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
        first.setBoutique("Back Allet Bargain");
        first.setImg(R.drawable.backalletbargain);
        first.setDescription("Back Allet Bargain is a one-stop shop for all the strange and wondrous knick-knacks you could ever want.");

        Points second = new Points();
        second.setBoutique("Funky Find");
        second.setImg(R.drawable.funkyfind);
        second.setDescription("Funky Find is a fresh take on home goods, offering a playful, whimsical assortment of products.");

        Points third = new Points();
        third.setBoutique(("Hinge"));
        third.setImg(R.drawable.hinge);
        third.setDescription("Here at Hinge, we sell only locally crafted furniture. #buylocal");

        Points fourth = new Points();
        fourth.setBoutique("byDesign");
        fourth.setImg(R.drawable.bydesign);
        fourth.setDescription("Shop at byDesign for all of your modern, sleek furniture needs!");

        points = new Points[]{first, second,third,fourth};
//        if (points == null)
//            return inflater.inflate(R.layout.points_fragment, container,false);
        View myView = inflater.inflate(R.layout.home_goods_fragment, container,false);



        MenWomenHomeAdapter pAdapter = new MenWomenHomeAdapter(getActivity(), points);
        setListAdapter(pAdapter);

        return myView;

    }
}

