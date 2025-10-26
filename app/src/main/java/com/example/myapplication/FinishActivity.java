package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class FinishActivity extends AppCompatActivity {

    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        btnFinish = findViewById(R.id.btnFinish);

        btnFinish.setOnClickListener(v ->
                Toast.makeText(this, "Welcome to Equalife!", Toast.LENGTH_SHORT).show()
        );
    }
}
