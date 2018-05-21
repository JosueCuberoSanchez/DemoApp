package com.josuecubero.demoapp;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class AudioTestActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_test);
        this.mediaPlayer = MediaPlayer.create(this, R.raw.waterfall); //media player for the sound.
        SeekBar volumeBar = findViewById(R.id.volumeBar); //the volume bar.
        final SeekBar lengthBar = findViewById(R.id.lengthBar); //the progress bar.

        int maxLength = this.mediaPlayer.getDuration();
        lengthBar.setMax(maxLength);
        new Timer().scheduleAtFixedRate(new TimerTask() { //this will update the bar according to the audio progress.
            @Override
            public void run() {
                lengthBar.setProgress(mediaPlayer.getCurrentPosition());
            }
        },0,10); //0 delay and 10 ms between successful calls.

        //next lines will set max volume and current volume.
        this.audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE); //get music service from Android.
        int maxVolume = this.audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int currentVolume = this.audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        volumeBar.setMax(maxVolume);
        volumeBar.setProgress(currentVolume);

        volumeBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //progress is how far the indicator is, fromUser is whether the bar changed by an user action or by the system
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0); //set current volume.
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        lengthBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser) {
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void back(View view){
        Intent intent = new Intent(AudioTestActivity.this, FirstMenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void play(View view){
        this.mediaPlayer.start();
    }

    public void pause(View view){
        this.mediaPlayer.pause();
    }
}
