package com.example.miggle.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RedeemActivity extends ListActivity {

    private Redeem[] redeem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);

        Redeem first = new Redeem();
        first.setPercentage("25");
        first.setOffer("Save 25% on all menswear!");

        redeem = new Redeem[] {first};
        RedeemAdapter adapter = new RedeemAdapter(this, redeem);

        setListAdapter(adapter);
    }
}
