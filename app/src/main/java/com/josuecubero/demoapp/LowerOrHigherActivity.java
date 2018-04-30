package com.josuecubero.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LowerOrHigherActivity extends AppCompatActivity {

    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.randomNumber = 1 + (int)(Math.random() * ((20 - 1) + 1));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_or_higher);
    }

    public void guess(View view){
        EditText guessText = findViewById(R.id.guessText);
        int userInput = Integer.parseInt(guessText.getText().toString());
        String response;
        if(userInput < this.randomNumber){
            response = "Higher!";
        } else if (userInput > this.randomNumber){
            response = "Lower!";
        } else {
            response = "Ding ding!!!";
        }
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show();
    }

    public void back(View view){
        Intent intent = new Intent(LowerOrHigherActivity.this, FirstMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
