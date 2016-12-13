package com.example.miggle.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PointsFragment extends ListFragment {
    private Points[] points;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PlaceList p = new PlaceList(getContext());
        points = p.getAll();
//        if (points == null)
//            return inflater.inflate(R.layout.points_fragment, container,false);

        View myView = inflater.inflate(R.layout.points_fragment, container,false);



        PointsAdapter pAdapter = new PointsAdapter(getActivity(), points);
        setListAdapter(pAdapter);

        return myView;

    }
}
