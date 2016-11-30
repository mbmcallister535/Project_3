package com.example.miggle.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Created by miggle on 11/29/16.
 */

public class PagerAdapter extends FragmentStatePagerAdapter
{
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                WomenFragment w = new WomenFragment();
                Log.v("Fragment","here");
                return w;
            case 1:
                MenFragment m = new MenFragment();
                Log.v("Fragment", "here");
                return m;
            case 2:
                HomeGoodsFragment h = new HomeGoodsFragment();
                return h;
            case 3:
                PointsFragment p = new PointsFragment();
                Log.v("Fragment","here");
                return p;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
