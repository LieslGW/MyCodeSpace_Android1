package com.example.lieslgoundenwentzeldevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class profile extends AppCompatActivity {

    Button back;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = findViewById(R.id.profileBackBtn);

        Intent intent = getIntent();
        text = intent.getStringExtra("visName");


        back.setOnClickListener((v)->{

            Intent intent1 = new Intent(profile.this, Menu.class);
            intent1.putExtra("visName", text);
            startActivity(intent1);
        });
    }
}
