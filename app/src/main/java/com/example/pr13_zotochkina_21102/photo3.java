package com.example.pr13_zotochkina_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class photo3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo3);

        ((Button) findViewById(R.id.zak2)).setOnClickListener(view -> {
            Intent intent = new Intent(photo3.this, profile.class);
            startActivity(intent);
        });
    }
}