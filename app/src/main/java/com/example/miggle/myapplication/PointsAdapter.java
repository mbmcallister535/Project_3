package com.example.miggle.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.gson.Gson;


/**
 * Created by truewheeldon on 11/27/16.
 */

public class PointsAdapter extends BaseAdapter {
    private Context myContext;
    private Points[] myPoints;

    public PointsAdapter(Context context, Points[] points){
        myContext = context;
        myPoints = points;
    }

    @Override
    public int getCount(){
        return myPoints.length;
    }

    @Override
    public Object getItem(int position){
        return myPoints[position];
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;

        if (convertView == null){
            convertView = LayoutInflater.from(myContext).inflate(R.layout.points_list, null);

            holder = new ViewHolder();
            holder.boutique = (TextView) convertView.findViewById(R.id.boutique);
            holder.description = (TextView) convertView.findViewById(R.id.description);
            holder.cell = (LinearLayout) convertView.findViewById(R.id.cell);
            holder.img = (ImageView) convertView.findViewById((R.id.img));

            holder.rl1 = (RelativeLayout) convertView.findViewById((R.id.rl1));

            convertView.setTag(holder);
        }

        else{
            holder = (ViewHolder) convertView.getTag();
        }

        final Points points = myPoints[position];

        holder.boutique.setText(points.getBoutique());
        holder.description.setText(points.getDescription());
        holder.img.setImageResource(points.getImg());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),RedeemActivity.class);
                intent.putExtra("Place", new Gson().toJson(points));
                v.getContext().startActivity(intent);
            }
        });

        return convertView;
    }

    public static class ViewHolder{
        TextView boutique;
        TextView description;
        ImageView img;
        LinearLayout cell;
        RelativeLayout rl1;
    }
}
