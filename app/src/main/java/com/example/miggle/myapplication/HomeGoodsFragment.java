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
        first.setBoutique("Back Alley Bargains");
        first.setImg(R.drawable.backalletbargain);
        first.setDescription("Insert Description Here");
        first.setLocation(41.5815043,-93.7168694);

        Points second = new Points();
        second.setBoutique("Funky Find");
        second.setImg(R.drawable.funkyfind);
        second.setDescription("Insert Description Here");
        second.setLocation(42.9892343,-81.3006206);

        Points third = new Points();
        third.setBoutique(("Hinge"));
        third.setImg(R.drawable.hinge);
        third.setDescription("Insert Description Here");
        third.setLocation(41.5731856,-93.7785209);

        Points fourth = new Points();
        fourth.setBoutique("byDesign");
        fourth.setImg(R.drawable.bydesign);
        fourth.setDescription("Insert Description Here");
        fourth.setLocation(41.6044827,-93.8070129);

        PlaceList p = new PlaceList();
        points = p.getHomeGoods();
//        if (points == null)
//            return inflater.inflate(R.layout.points_fragment, container,false);
        View myView = inflater.inflate(R.layout.home_goods_fragment, container,false);



        MenWomenHomeAdapter pAdapter = new MenWomenHomeAdapter(getActivity(), points);
        setListAdapter(pAdapter);

        return myView;

    }
}

