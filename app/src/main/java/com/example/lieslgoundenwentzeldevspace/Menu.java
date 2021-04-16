package com.example.lieslgoundenwentzeldevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    TextView dearVis;
    Button homeBtn, calcBtn, aboutBtn,profileBtn;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        dearVis = findViewById(R.id.dearText);
        homeBtn = findViewById(R.id.HomeBtn);
        calcBtn = findViewById(R.id.CalcBtn);
        aboutBtn = findViewById(R.id.AboutBtn);
        profileBtn = findViewById(R.id.ProfileBtn);

        Intent intent = getIntent();
         text = intent.getStringExtra("visName");
        dearVis.setText("Dear: "+ text);

        homeBtn.setOnClickListener((v)-> {
            Intent intent1 = new Intent(Menu.this,MainActivity.class);
            intent1.putExtra("visName", text);
            startActivity(intent1);

        });

        calcBtn.setOnClickListener((v)-> {

            Intent intent1 = new Intent(Menu.this,Calculation.class);
            intent1.putExtra("visName", text);
            startActivity(intent1);

        });

        aboutBtn.setOnClickListener((v)-> {

            Intent intent1 = new Intent(Menu.this,profile.class);
            intent1.putExtra("visName", text);
            startActivity(intent1);

        });

        profileBtn.setOnClickListener((v)-> {

            Intent intent1 = new Intent(Menu.this,details.class);
            intent1.putExtra("visName", text);
            startActivity(intent1);

        });

    }
}
