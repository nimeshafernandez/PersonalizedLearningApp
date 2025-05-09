package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    Button openTaskBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        openTaskBtn = findViewById(R.id.buttonOpenTask);
        openTaskBtn.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, TaskActivity.class);
            startActivity(intent);
        });
    }
}
