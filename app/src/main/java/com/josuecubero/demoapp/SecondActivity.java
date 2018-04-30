package com.josuecubero.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void changeSource(View view){
        ImageView imageView = findViewById(R.id.imgView);
        imageView.setImageResource(R.drawable.h2);
    }
}
