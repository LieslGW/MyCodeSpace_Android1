package com.example.lieslgoundenwentzeldevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculation extends AppCompatActivity {

    Button back, calculateBtn;
    EditText base1,base2,height;
    TextView result, error;
    String text;

    int a, b,h,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        back = findViewById(R.id.backBtn);
        base1 = findViewById(R.id.measureATB);
        base2 = findViewById(R.id.measureBTB);
        height = findViewById(R.id.measureHTB);
        calculateBtn =findViewById(R.id.doCalcBtn);
        result = findViewById(R.id.calcResult);
        error = findViewById(R.id.errorMessage);

        Intent intent = getIntent();
        text = intent.getStringExtra("visName");

        back.setOnClickListener((v)->{

            Intent intent1 = new Intent(Calculation.this, Menu.class);
            intent1.putExtra("visName", text);
            startActivity(intent1);
        });




        calculateBtn.setOnClickListener((v)->{
                //getNumbers();

            String b1=base1.getText().toString();
            String b2=base2.getText().toString();
            String ht=height.getText().toString();

            if (b1.isEmpty()|| b2.isEmpty()|| ht.isEmpty()) {
                String err = "MISSING VALUES\nPlease enter all values";
                result.setText("");
                error.setText(err);

            }
            else {

                a = Integer.parseInt(b1);
                b = Integer.parseInt(b2);
                h = Integer.parseInt(ht);


                if (a <= 0 || b <= 0 || h <= 0) {
                    String err = "Values must be greater than 0";
                    result.setText("");
                    error.setText(err);
                } else {
                    sum = (h * (a + b) / 2);
                    error.setText("");
                    result.setText("Area = " +sum+"mm");
                }
            }
        });
    }


}



