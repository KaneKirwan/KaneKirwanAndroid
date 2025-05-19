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
public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    Button screen3;
    Button add_button;
    Button minus_button;
    TextView count_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        screen3 = findViewById(R.id.button4);
        screen3.setOnClickListener(this);
        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        add_button = findViewById(R.id.add_button1);
        minus_button = findViewById(R.id.minus_button1);
        count_val = findViewById(R.id.count_val1);
        add_button.setOnClickListener(this);
        minus_button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int current_val = Integer.parseInt(count_val.getText().toString());
        int new_val = current_val;
        if (v.getId() == R.id.add_button1) {
            new_val = current_val + 1;
        }
        else if (v.getId() == R.id.minus_button1) {
            new_val = current_val - 1;
        }
        else if (v.getId() == R.id.button4) {
            finish();
        }
        count_val.setText(String.valueOf(new_val));
    }
}
