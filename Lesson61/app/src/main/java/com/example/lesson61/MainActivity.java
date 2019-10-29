package com.example.lesson61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private final static String TEXT_KEY = "MainActivity.TEXT_KEY";

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_view_main);
        button = findViewById(R.id.button_view_main);
    }

    public void acceptInput(View view) {
        Intent intent = new Intent(this, OutputActivity.class);
        if (editText.getText().length() > 0)
            intent.putExtra("enteredText", editText.getText().toString());
        else intent.putExtra("enteredText", "Текст не введён!");
        startActivity(intent);
    }
}
