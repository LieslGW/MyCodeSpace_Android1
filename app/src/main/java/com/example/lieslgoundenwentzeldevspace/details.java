package com.example.lieslgoundenwentzeldevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class details extends AppCompatActivity {

    Button back;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        back = findViewById(R.id.detailsBackBtn);

        Intent intent = getIntent();
        text = intent.getStringExtra("visName");


        back.setOnClickListener((v)->{
            Intent intent1 = new Intent(details.this, Menu.class);
            intent1.putExtra("visName", text);
            startActivity(intent1);
        });
    }
}
