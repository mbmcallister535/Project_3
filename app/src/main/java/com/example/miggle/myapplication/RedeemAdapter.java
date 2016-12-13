package com.example.miggle.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by truewheeldon on 12/6/16.
 */

public class RedeemAdapter extends BaseAdapter {

    private Context myContext;
    private Redeem[] myRedeem;

    public RedeemAdapter(Context context, Redeem[] redeem){
        myContext = context;
        myRedeem = redeem;
    }

    @Override
    public int getCount(){
        return myRedeem.length;
    }

    @Override
    public Object getItem(int position){
        return myRedeem[position];
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        RedeemAdapter.ViewHolder holder;

        if (convertView == null){
            convertView = LayoutInflater.from(myContext).inflate(R.layout.redeem_list, null);

           holder = new RedeemAdapter.ViewHolder();
           holder.percentage = (TextView) convertView.findViewById(R.id.percentAmount);
            holder.offer = (TextView) convertView.findViewById(R.id.offer);


            convertView.setTag(holder);
        }

        else{
            holder = (RedeemAdapter.ViewHolder) convertView.getTag();
        }

        Redeem redeem = myRedeem[position];

        holder.percentage.setText(redeem.getPercentage());
        holder.offer.setText(redeem.getOffer());


        return convertView;
    }

    public static class ViewHolder{
        TextView percentage;
        TextView offer;
    }
}
