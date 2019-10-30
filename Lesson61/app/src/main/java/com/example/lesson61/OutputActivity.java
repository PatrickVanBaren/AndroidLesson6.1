package com.example.lesson61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        textView = findViewById(R.id.full_name_view);
        button = findViewById(R.id.button_view_other);
        button.setOnClickListener(this);

        Intent intent = getIntent();
        String enteredFirstName = intent.getStringExtra("firstName");
        String enteredName = intent.getStringExtra("name");
        String enteredLastName = intent.getStringExtra("lastName");

        textView.setText(enteredFirstName + " " + enteredName + " " + enteredLastName);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        String[] fullName = textView.getText().toString().split("\\s");
        intent.putExtra("firstNameOther", fullName[0].trim());
        intent.putExtra("nameOther", fullName[1].trim());
        intent.putExtra("lastNameOther", fullName[2].trim());
        setResult(RESULT_OK, intent);
        finish();
    }
}
