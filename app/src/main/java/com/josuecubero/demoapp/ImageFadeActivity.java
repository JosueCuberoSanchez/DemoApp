
package com.josuecubero.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageFadeActivity extends AppCompatActivity {

    private ImageView luffy, zoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_fade);
        this.luffy = findViewById(R.id.luffy);
        this.zoro = findViewById(R.id.zoro);
        /*this.luffy.animate().translationYBy(-1000f).translationXBy(-1000f);
        this.zoro.setVisibility(View.VISIBLE);*/
        /*this.luffy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageFadeActivity.zoro.setClickable(true);
                ImageFadeActivity.luffy.animate().alpha(0f).setDuration(2000);
                ImageFadeActivity.zoro.animate().alpha(1f).setDuration(2000);
                ImageFadeActivity.luffy.setClickable(false);
            }
        });
        this.zoro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageFadeActivity.luffy.setClickable(true);
                ImageFadeActivity.zoro.animate().alpha(0f).setDuration(2000);
                ImageFadeActivity.luffy.animate().alpha(1f).setDuration(2000);
                ImageFadeActivity.zoro.setClickable(false);
            }
        });*/
    }

    public void fade(View view) {
        if (view == this.luffy) {
            this.zoro.setClickable(true);
            this.luffy.animate().alpha(0f).setDuration(2000);
            //this.luffy.animate().translationYBy(1000f);
            this.zoro.animate().alpha(1f).setDuration(2000);
            this.luffy.setClickable(false);
        } else {
            /*this.zoro.setVisibility(View.INVISIBLE);
            this.luffy.animate().translationYBy(1000f).translationXBy(1000f).rotationBy(720f).setDuration(4000);*/
            this.luffy.setClickable(true);
            this.zoro.animate().alpha(0f).setDuration(2000);
            //this.zoro.animate().translationXBy(-1000f);
            this.luffy.animate().alpha(1f).setDuration(2000);
            this.zoro.setClickable(false);
        }
    }
    //alpha receives a float, the f indicates that the number is going to be passed as a float. In the editor it should go
    //without the f...
    //fade duration (not comming back atm!) is in miliseconds.. so.. 2000ms = 2 sec

    public void back(View view){
        Intent intent = new Intent(ImageFadeActivity.this, FirstMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
