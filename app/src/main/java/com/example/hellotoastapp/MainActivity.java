package com.example.hellotoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button toastB;
    private Button countB;
    private TextView numberA;
    private int contador;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberA = (TextView) findViewById(R.id.number_count);

        toastB = (Button) findViewById(R.id.button_toast);
        toastB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, String.valueOf(contador), Toast.LENGTH_SHORT).show();
            }
        });

        countB = (Button) findViewById(R.id.button_count);
        countB.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View view) {
                contador++;
                numberA.setText(String.valueOf(contador));
        }
        });

    }

    @Override
    public void onClick(View view) {

    }
}