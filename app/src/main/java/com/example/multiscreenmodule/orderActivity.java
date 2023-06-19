package com.example.multiscreenmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent2=getIntent();
        String string = intent2.getStringExtra(MainActivity.MSG);
        TextView text = findViewById(R.id.id2);
        text.setText("you name and username is"+string);
    }
}