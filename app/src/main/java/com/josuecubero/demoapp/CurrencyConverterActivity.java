package com.josuecubero.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CurrencyConverterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
    }

    public void back(View view){
        Intent intent = new Intent(CurrencyConverterActivity.this, FirstMenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void convert(View view){
        EditText currencyText = findViewById(R.id.currencyText);
        String userInput = currencyText.getText().toString();
        double currentCurrency = Double.parseDouble(userInput);
        double convertedCurrency = currentCurrency * 566.03;
        Toast.makeText(this, "The dollars entered are equivalent to " + convertedCurrency + " colones", Toast.LENGTH_LONG).show();
    }
}
