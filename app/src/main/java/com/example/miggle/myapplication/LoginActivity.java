package com.example.miggle.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        loginButton = (Button) findViewById(R.id.loginButton);
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        final String user =  sharedPreferences.getString("USERNAME",null);
        editor = sharedPreferences.edit();
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(user == null)
                {
                    editor.putString("USERNAME","User");
                    editor.commit();
                    Intent intent = new Intent(v.getContext(),MainActivity.class);
                    v.getContext().startActivity(intent);
                }
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }
}
