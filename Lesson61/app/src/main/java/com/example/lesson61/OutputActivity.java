package com.example.lesson61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        textView = findViewById(R.id.text_view);

        Intent intent = getIntent();
        String enteredText = intent.getStringExtra("enteredText");

        textView.setText(enteredText);
    }
}
