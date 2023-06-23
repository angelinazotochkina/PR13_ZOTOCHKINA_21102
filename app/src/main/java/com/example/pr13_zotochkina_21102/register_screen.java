package com.example.pr13_zotochkina_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register_screen extends AppCompatActivity {
    EditText email;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        email=findViewById(R.id.editTextTextEmailAddress);
        password=findViewById(R.id.editTextTextPassword);
        Button buttonsign = findViewById(R.id.button2);
        buttonsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.button2){
                if (email.getText().toString().isEmpty()) {
                    email.setError("Email is required!");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("Password is required!");
                } else {
                    Intent intent = new Intent(register_screen.this, MainScreen.class);
                    startActivity(intent);
                }}
                if(v.getId()==R.id.buttonsign){
                    if (email.getText().toString().isEmpty()) {
                        email.setError("Email is required!");
                    } else if (password.getText().toString().isEmpty()) {
                        password.setError("Password is required!");
                    } else {
                        Intent intent = new Intent(register_screen.this, MainScreen.class);
                        startActivity(intent);
                    }}
            }
        });
    }
    public void onClick(View v) {

    }
}