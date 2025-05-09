package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class InterestsActivity extends AppCompatActivity {
    Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        continueBtn = findViewById(R.id.buttonContinue);
        continueBtn.setOnClickListener(v -> {
            Intent intent = new Intent(InterestsActivity.this, DashboardActivity.class);
            startActivity(intent);
        });
    }
}