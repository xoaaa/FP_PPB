package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WeightActivity extends AppCompatActivity {

    EditText inputWeight;
    Button btnSubmitWeight, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        inputWeight = findViewById(R.id.inputWeight);
        btnSubmitWeight = findViewById(R.id.btnSubmitWeight);
        btnBack = findViewById(R.id.btnBack);

        btnSubmitWeight.setOnClickListener(v -> {
            String weightText = inputWeight.getText().toString().trim();
            if (weightText.isEmpty()) {
                Toast.makeText(this, "Please enter your weight", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(WeightActivity.this, DietActivity.class);
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(v -> finish());
    }
}
