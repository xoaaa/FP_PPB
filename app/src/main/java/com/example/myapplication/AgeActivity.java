package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class AgeActivity extends AppCompatActivity {
    Button btnAge1, btnAge2, btnAge3, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        btnAge1 = findViewById(R.id.btnAge1);
        btnAge2 = findViewById(R.id.btnAge2);
        btnAge3 = findViewById(R.id.btnAge3);
        btnBack = findViewById(R.id.btnBack);

        View.OnClickListener goNext = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AgeActivity.this, HeightActivity.class));
            }
        };

        btnAge1.setOnClickListener(goNext);
        btnAge2.setOnClickListener(goNext);
        btnAge3.setOnClickListener(goNext);

        btnBack.setOnClickListener(v -> finish());
    }
}
