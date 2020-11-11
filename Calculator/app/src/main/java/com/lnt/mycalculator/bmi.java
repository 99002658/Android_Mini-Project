package com.lnt.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class bmi extends AppCompatActivity {
    Button button_convert;
    TextView output;
    EditText height, weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        button_convert = (Button) findViewById(R.id.button_convert);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        output = (TextView) findViewById(R.id.output);
    }

    public void calculateBMI(View view){
        String hgtStr = height.getText().toString();
        String wgtStr = weight.getText().toString();
        if (hgtStr != null && !"".equals(hgtStr) && wgtStr != null && !"".equals(wgtStr)){
            float hgtval = Float.parseFloat(hgtStr)/100;
            float wgtval = Float.parseFloat(wgtStr);
            float bmi = wgtval/(hgtval*hgtval);
            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi){
        String bmiLabel = "";
        if (Float.compare(bmi,15f) <= 0){
            bmiLabel = "Very Severely Underweight";
        } else if (Float.compare(bmi,15f) > 0 && Float.compare(bmi,16f) <= 0){
            bmiLabel = "Severely Underweight";
        } else if (Float.compare(bmi,16f) > 0 && Float.compare(bmi,18.5f) <= 0){
            bmiLabel = "Underweight";
        } else if (Float.compare(bmi,18.5f) > 0 && Float.compare(bmi,25f) <= 0){
            bmiLabel = "Normal";
        }
    }
}