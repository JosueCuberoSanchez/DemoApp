package com.josuecubero.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        VideoView videoView = findViewById(R.id.saurom_paz);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }

    public void back(View view){
        Intent intent = new Intent(VideoViewActivity.this, FirstMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
