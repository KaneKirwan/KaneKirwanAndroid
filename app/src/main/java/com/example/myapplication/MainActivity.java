package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button screen2;
    Button screen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        screen2 = findViewById(R.id.button);
        screen2.setOnClickListener(this);
        screen3 = findViewById(R.id.button);
        screen3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switchActivity();
    }

    private void switchActivity(){
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        Intent switchActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(switchActivityIntent);
        startActivity(switchActivityIntent);
    }
}