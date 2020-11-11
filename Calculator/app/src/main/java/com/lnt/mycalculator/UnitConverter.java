package com.lnt.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UnitConverter extends AppCompatActivity {

    TextView head;
    Button length;
    Button weight;
    Button temperature;
    Button currency;
    Button bmi;
    Button area;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);

        length = (Button)findViewById(R.id.length);
        weight = (Button)findViewById(R.id.weight);
        temperature = (Button)findViewById(R.id.temp);
        currency = (Button)findViewById(R.id.currency);
        bmi = (Button)findViewById(R.id.bmi);
        area = (Button)findViewById(R.id.area);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
            }
        });
        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity3();
            }
        });
        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity4();
            }
        });
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity5();
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity6();
            }
        });
    }



    public void openNewActivity() {
        Intent intent = new Intent(this, LengthConverter.class);
        startActivity(intent);
    }
    private void openNewActivity2() {
        Intent intent = new Intent(this, WeightConverter.class);
        startActivity(intent);
    }
    public void openNewActivity3() {
        Intent intent = new Intent(this, TemperatureConverter.class);
        startActivity(intent);
    }
    public void openNewActivity4() {
        Intent intent = new Intent(this, CurrencyConverter.class);
        startActivity(intent);
    }
    public void openNewActivity5() {
        Intent intent = new Intent(this, bmi.class);
        startActivity(intent);
    }
    public void openNewActivity6() {
        Intent intent = new Intent(this, area_converter.class);
        startActivity(intent);
    }
}