package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Mainscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
    }
    /** Called when the user taps the Accelerometer button */
    public void accelerometer(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    /** Called when the user taps the Compass button */
    public void compass(View view) {
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);

    }
}
