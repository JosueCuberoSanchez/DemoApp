package com.josuecubero.demoapp;

import android.support.v7.app.AppCompatActivity; //compatibility for other Android versions.
import android.os.Bundle; //makes possible the interaction with the Android OS.
import android.util.Log;
import android.view.View;

/**
 * This class controls what the application does.
 */

public class MainActivity extends AppCompatActivity { //this code is run when then activity is created.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //savedInstanceState is the state of the application that the phone stored, used to restore it when app is opened again.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R = res folder, layout = layout folder, activity_main = activity_main.xml.
        //This setContentView links the .java activity with its layout XML.
    }

    /**
     * Function that does some stuff when a button is clicked.
     * @param view is necessary to indicate that this method is called by a view element (the button).
     */
    public void clickFunction(View view){ //on click methods should be public, otherwise they'll throw method not found.
        Log.i("Info","Button pressed");
    }

    public void practiceOnClick(View view){
        Log.i("Info2","Button2 pressed");
    }

}
