package com.example.miggle.myapplication;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

public class RedeemActivity extends Activity {
    private Redeem[] redeem;
    private ListView listView;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);
        String activityPlaces = getIntent().getStringExtra("Place");
        final Points place = new Gson().fromJson(activityPlaces,Points.class);
        listView = (ListView) findViewById(R.id.list);
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        Redeem first = new Redeem();
        first.setPointsRequired(10);
        first.setPercentage("25");
        first.setOffer("Save 25% on all menswear!");

        redeem = new Redeem[] {first};
        RedeemAdapter adapter = new RedeemAdapter(this, redeem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int count = sharedPreferences.getInt(place.getBoutique(), 0);
                int coupon = sharedPreferences.getInt(place.getBoutique()+"10",0);
                if(position == 0) {
                    if(coupon == 0) {
                        if (count >= 20) {
                            editor.putInt(place.getBoutique(), count - 10);
                            editor.putInt(place.getBoutique() + "10", coupon + 1);
                            editor.commit();
                            Toast toast = Toast.makeText(getApplicationContext(), "You just recieved a coupon", Toast.LENGTH_SHORT);
                            toast.show();
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "You don't have enough points", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                    else
                    {

                        Intent intent = new Intent(view.getContext(),CouponActivity.class);
                        intent.putExtra("Place", new Gson().toJson(place));
                        view.getContext().startActivity(intent);

                    }
                }
            }
        });
        editor.commit();
        int test =  sharedPreferences.getInt(place.getBoutique(),0);
        String tester = Integer.toString(test);
        Log.v("Hello",tester);
//        setListAdapter(adapter);

    }
}
