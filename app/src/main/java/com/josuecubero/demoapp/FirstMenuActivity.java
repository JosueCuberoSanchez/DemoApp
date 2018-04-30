package com.josuecubero.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);
    }

    public void goToImagesTest(View view){
        Intent intent = new Intent(FirstMenuActivity.this, ImageTestActivity.class);
        startActivity(intent);
        finish();
    }

    public void goToCurrencyConverter(View view){
        Intent intent = new Intent(FirstMenuActivity.this, CurrencyConverterActivity.class);
        startActivity(intent);
        finish();
    }

    public void goToHigherOrLower(View view){
        Intent intent = new Intent(FirstMenuActivity.this, LowerOrHigherActivity.class);
        startActivity(intent);
        finish();
    }

    public void back(View view){
        Intent intent = new Intent(FirstMenuActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
