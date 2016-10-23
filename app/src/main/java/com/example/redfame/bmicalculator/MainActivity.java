package com.example.redfame.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.EditText;


import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner in = new Scanner(toString());
        String Height = in.toString();
        String Weight = in.toString();

        EditText input1 = (EditText) findViewById(R.id.input_Height);
        input1.setText(Height);

        EditText input2 = (EditText) findViewById(R.id.input_Weight);
        input2.setText(Weight);

        int new_Height = Integer.parseInt(Height);
        int new_Weihgt = Integer.parseInt(Weight);















    }
}
