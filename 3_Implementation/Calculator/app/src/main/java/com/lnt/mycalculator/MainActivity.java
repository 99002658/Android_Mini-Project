package com.lnt.mycalculator;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button  button1, button2, button3, button4, button5, button6,
            button7, button8,button9,button10,button11,button12,button13,
            button14,button15,button16, button17, unitconverter;

    EditText viewanswer;

    float v1,v2;
    boolean add, sub, mult, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        viewanswer = (EditText) findViewById(R.id.edittext1);
        unitconverter = (Button) findViewById(R.id.unitconvert);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "9");
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + "0");
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (viewanswer == null) {
                    viewanswer.setText("");
                } else {
                    v1 = Float.parseFloat(viewanswer.getText() + "");
                    add = true;
                    viewanswer.setText(null);
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(viewanswer.getText() + "");
                sub = true;
                viewanswer.setText(null);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(viewanswer.getText() + "");
                mult = true;
                viewanswer.setText(null);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(viewanswer.getText() + "");
                div = true;
                viewanswer.setText(null);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Float.parseFloat(viewanswer.getText() + "");

                if (add == true) {
                    viewanswer.setText(v1 + v2 + "");
                    add = false;
                }

                if (sub == true) {
                    viewanswer.setText(v1 - v2 + "");
                    sub = false;
                }

                if (mult == true) {
                    viewanswer.setText(v1 * v2 + "");
                    mult = false;
                }

                if (div == true) {
                    if(v2==0)
                    {
                        viewanswer.setText("Can't divide by 0");
                    }
                    else{
                        viewanswer.setText(v1 / v2 + "");
                        div = false;
                    }


                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewanswer.setText(viewanswer.getText() + ".");
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            viewanswer.setShowSoftInputOnFocus(false);
        } else { // API 11-20
            viewanswer.setTextIsSelectable(true);
        }

        unitconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }

    public void openNewActivity() {
        Intent intent = new Intent(this, UnitConverter.class);
        startActivity(intent);
    }
}