package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TaskActivity extends AppCompatActivity {
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        submitBtn = findViewById(R.id.buttonSubmit);
        submitBtn.setOnClickListener(v -> {
            Intent intent = new Intent(TaskActivity.this, ResultsActivity.class);
            startActivity(intent);
        });
    }
}
