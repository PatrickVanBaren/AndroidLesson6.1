package com.example.lesson61bonus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShortActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short);

        textView = findViewById(R.id.full_name_view);

        Intent intent = getIntent();
        String enteredFirstName = intent.getStringExtra("firstName");
        String enteredName = intent.getStringExtra("name");
        String enteredLastName = intent.getStringExtra("lastName");

        textView.setText(enteredFirstName + " " + enteredName + " " + enteredLastName);
    }
}
