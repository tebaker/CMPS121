package com.example.talon.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding button for constant 2
        Button equalsVal2 = (Button) findViewById(R.id.equalsVal2);
        equalsVal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getting exponent for constant 2
                EditText exp2 = (EditText) findViewById(R.id.exp2EditText);
                TextView exp2Result = (TextView) findViewById(R.id.result2);

                // calculating result
                int num = Integer.parseInt(exp2.getText().toString());

                // testing
                System.out.println(num);

//                double calculationResult = Math.pow(2,num);

                // setting result of calculation
//                exp2Result.setText(calculationResult + "");
            }
        });

        // adding button for constant 3
        Button equalsVal3 = (Button) findViewById(R.id.equalsVal3);
        equalsVal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getting exponent for constant 3
                EditText exp3 = (EditText) findViewById(R.id.exp3EditText);
                TextView exp3Result = (TextView) findViewById(R.id.result3);

                // calculating result
                int num = Integer.parseInt(exp3.getText().toString());
                double calculationResult = Math.pow(3,num);

                // setting result of calculation
                exp3Result.setText(calculationResult + "");
            }
        });

        // adding button for constant 4
        Button equalsVal4 = (Button) findViewById(R.id.equalsVal4);
        equalsVal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getting exponent for constant 4
                EditText exp4 = (EditText) findViewById(R.id.exp4EditText);
                TextView exp4Result = (TextView) findViewById(R.id.result4);

                // calculating result
                int num = Integer.parseInt(exp4.getText().toString());
                double calculationResult = Math.pow(4,num);

                // setting result of calculation
                exp4Result.setText(calculationResult + "");
            }
        });

        // adding button for constant 5
        Button equalsVal5 = (Button) findViewById(R.id.equalsVal5);
        equalsVal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getting exponent for constant 5
                EditText exp5 = (EditText) findViewById(R.id.exp5EditText);
                TextView exp5Result = (TextView) findViewById(R.id.result5);

                // calculating result
                int num = Integer.parseInt(exp5.getText().toString());
                double calculationResult = Math.pow(5,num);

                // setting result of calculation
                exp5Result.setText(calculationResult + "");
            }
        });

    }// end - onCreate
}// end - MainActivity
