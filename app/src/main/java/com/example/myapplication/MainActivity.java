package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button screen2;
    Button screen3;
    Button screen4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        screen2 = findViewById(R.id.button);
        screen2.setOnClickListener(this);
        screen3 = findViewById(R.id.button5);
        screen3.setOnClickListener(this);
        screen4 = findViewById(R.id.button6);
        screen4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            switchActivity1();
        }

        if(v.getId() == R.id.button5){
            switchActivity2();
        }

        if(v.getId() == R.id.button6){
            switchActivity3();
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

    private void switchActivity3(){
        Intent switchActivityIntent3 = new Intent(this, MainActivity4.class);
        startActivity(switchActivityIntent3);
    }
}