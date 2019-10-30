package com.example.lesson61;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText firstName;
    EditText name;
    EditText lastName;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.first_name_view);
        name = findViewById(R.id.name_view);
        lastName = findViewById(R.id.last_name_view);

        button = findViewById(R.id.button_view_main);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, OutputActivity.class);
        intent.putExtra("firstName", firstName.getText().toString());
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("lastName", lastName.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        String firstNameOther = data.getStringExtra("firstNameOther");
        firstName.setText(firstNameOther);
        String nameOther = data.getStringExtra("nameOther");
        firstName.setText(nameOther);
        String lastNameOther = data.getStringExtra("lastNameOther");
        firstName.setText(lastNameOther);
    }
}
