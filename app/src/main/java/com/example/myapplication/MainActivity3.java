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
public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button screen2;
    Button add_button;
    Button minus_button;
    TextView count_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        screen2 = findViewById(R.id.button3);
        screen2.setOnClickListener(this);
        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        add_button = findViewById(R.id.add_button);
        minus_button = findViewById(R.id.minus_button);
        count_val = findViewById(R.id.count_val);
        add_button.setOnClickListener(this);
        minus_button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int current_val = Integer.parseInt(count_val.getText().toString());
        int new_val = current_val;
        if (v.getId() == R.id.add_button) {
            new_val = current_val + 1;
        }
        else if (v.getId() == R.id.minus_button) {
            new_val = current_val - 1;
        }
        else if (v.getId() == R.id.button3) {
            finish();
        }
        count_val.setText(String.valueOf(new_val));
    }
}
