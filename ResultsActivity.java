package com.example.learningapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity {
    TextView resultText1, resultText2, resultText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultText1 = findViewById(R.id.textResult1);
        resultText2 = findViewById(R.id.textResult2);
        resultText3 = findViewById(R.id.textResult3);

        resultText1.setText("Task 1 - Score: 85% - Topic: Math");
        resultText2.setText("Task 2 - Score: 92% - Topic: Science");
        resultText3.setText("Task 3 - Score: 76% - Topic: History");
    }
}
