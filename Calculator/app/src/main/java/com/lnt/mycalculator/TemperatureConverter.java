package com.lnt.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class TemperatureConverter extends AppCompatActivity {


    public ArrayAdapter<CharSequence> adapter;
    Spinner fromSpinner, toSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        // An adapter to convert the String[] into something that can go in the Spinner
        //ArrayAdapter&lt;CharSequence&gt;
        adapter = ArrayAdapter.createFromResource(this, R.array.tunits, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromSpinner = (Spinner) findViewById(R.id.spinner_from);
        toSpinner = (Spinner) findViewById(R.id.spinner_to);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
    }

    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText;

        fromSpinner = (Spinner) findViewById(R.id.spinner_from);
        toSpinner = (Spinner) findViewById(R.id.spinner_to);
        fromEditText = (EditText) findViewById(R.id.editText_from);
        toEditText = (EditText) findViewById(R.id.editText_to);

        // Get the string from the Spinners and number from the EditText
        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());

        // Convert the strings to something in our Unit enu,
        Tconverter.Unit fromUnit = Tconverter.Unit.fromString(fromString);
        Tconverter.Unit toUnit = Tconverter.Unit.fromString(toString);

        // Create a converter object and convert!
        Tconverter converter = new Tconverter(fromUnit, toUnit, input);
        double result = converter.convert();
        toEditText.setText(String.valueOf(result));
    }
}