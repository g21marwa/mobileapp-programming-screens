package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeLayout(View v){
// Create the text message with a string
        Intent sendIntent = new Intent(this, SecondaryActivity.class);
        EditText et = findViewById(R.id.textInput);
        String getText = et.getText().toString();
        sendIntent.putExtra("inputText", getText);
        startActivity(sendIntent);
    }
}
