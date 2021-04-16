package com.example.lieslgoundenwentzeldevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText visitorName;
    Button nextBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visitorName = findViewById(R.id.visNameTB);
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener((v)->{
            String text = visitorName.getText().toString();
            Intent intent = new Intent(MainActivity.this, Menu.class);
            intent.putExtra("visName", text);
            startActivity(intent);

        });
    }
}
