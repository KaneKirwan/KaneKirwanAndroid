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
        screen3 = findViewById(R.id.button4);
        screen3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            switchActivity1();
        }

        if(v.getId() == R.id.button4){
            switchActivity2();
        }
    }

    private void switchActivity1(){
        Intent switchActivityIntent1 = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent1);
    }

    private void switchActivity2(){
        Intent switchActivityIntent2 = new Intent(this, MainActivity3.class);
        startActivity(switchActivityIntent2);
    }
}