package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button screen1;
    TextView timer_text ;
    Button timer_button;
    Boolean pause = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        screen1 = findViewById(R.id.button2);
        screen1.setOnClickListener(this);
        timer_text = findViewById(R.id.timer_text);
        timer_button = findViewById(R.id.timer_button);
        timer_button.setOnClickListener(this);
        start_timer();
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.timer_button ){
            if (pause){
                pause = false;
            }
            else {
                pause = true;
            }
        } else if (view.getId() == R.id.button2) {
            finish();
        }
    }

    public void start_timer(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int count = 0;
            public void run() {
                runOnUiThread(new Runnable(){
                    @Override
                    public void run() {
                        if (!pause){
                            count = count+1;
                            timer_text.setText(Integer.toString(count));
                        }

                    }
                });
            }
        },0,1000);
    }
}