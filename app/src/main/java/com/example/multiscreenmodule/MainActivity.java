package com.example.multiscreenmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String MSG ="com.multiScreen.com.MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Redirect(View view) {
//        Build Intent to open another activity
        Intent intent = new Intent(this, orderActivity.class);
        EditText text0= findViewById(R.id.editTextText);
        EditText text1= findViewById(R.id.editTextText2);
        String message =text0.getText().toString()+","+text1.getText().toString();
        intent.putExtra(MSG,message);
        startActivity(intent);

    }
}