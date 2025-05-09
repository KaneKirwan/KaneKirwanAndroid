package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    Button screen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        screen3 = findViewById(R.id.button4);
        screen3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}