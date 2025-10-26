package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DietActivity extends AppCompatActivity {
    Button btnOption1, btnOption2, btnOption3, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        btnOption1 = findViewById(R.id.btnOption1);
        btnOption2 = findViewById(R.id.btnOption2);
        btnOption3 = findViewById(R.id.btnOption3);
        btnBack = findViewById(R.id.btnBack);

        // Listener buat tombol opsi (langsung lanjut ke FinishActivity)
        View.OnClickListener goNext = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietActivity.this, FinishActivity.class));
            }
        };

        btnOption1.setOnClickListener(goNext);
        btnOption2.setOnClickListener(goNext);
        btnOption3.setOnClickListener(goNext);

        // Tombol Back buat kembali ke WeightActivity
        btnBack.setOnClickListener(v -> finish());
    }
}
