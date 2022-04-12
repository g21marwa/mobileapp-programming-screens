package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
    private TextView recieve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        recieve = (TextView) findViewById(R.id.recieveText);
        Intent getIntent = getIntent();
        String getMessage = getIntent.getStringExtra(MainActivity.message);
        recieve.setText(getMessage);
    }
}