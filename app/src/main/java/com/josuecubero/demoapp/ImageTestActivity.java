package com.josuecubero.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_test);
    }

    public void changeSource(View view){
        ImageView imageView = findViewById(R.id.imgView);
        imageView.setImageResource(R.drawable.h2);
    }

    public void back(View view){
        Intent intent = new Intent(ImageTestActivity.this, FirstMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
