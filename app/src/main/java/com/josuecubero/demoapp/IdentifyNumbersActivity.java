package com.josuecubero.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IdentifyNumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_numbers);
    }

    public void back(){
        Intent intent = new Intent(IdentifyNumbersActivity.this, FirstMenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void identify(View view){
        EditText numberText = findViewById(R.id.numberText);
        int userInput = Integer.parseInt(numberText.getText().toString());
        boolean isSquare = false;
        boolean isTriangle = false;
        if(Math.sqrt(userInput) == Math.floor(Math.sqrt(userInput))){
            isSquare = true;
        }
        if(this.isTriangle(userInput)){
            isTriangle = true;
        }
        String message;
        if(isTriangle && isSquare) {
            message = "Both!";
        } else if(isSquare) {
            message = "is square!";
        } else if(isTriangle){
            message = "Is triangle!";
        } else {
            message = "None...";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public boolean isTriangle(int dots){
        int counter = 1;
        int cont = 0;
        int casee;
        boolean isTriangle;
        while(cont == 0){
            casee = ((counter*(counter-1))/2);
            if(casee == dots){
                cont = 1;
            } else if(casee > dots){
                cont = -1;
            }
            counter++;
        }
        isTriangle = cont == 1;
        return isTriangle;
    }

}


