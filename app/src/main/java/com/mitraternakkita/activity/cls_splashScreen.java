package com.mitraternakkita.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mitraternakkita.R;

public class cls_splashScreen extends AppCompatActivity {

    private int interval=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_splashScreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(cls_splashScreen.this, cls_login.class);
                startActivity(login);
                finish();

            }
        },interval);
    }
}
