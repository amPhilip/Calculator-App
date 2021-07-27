package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /*private variable for the calculation and the result*/
    private EditText calculation, result;

    /*private Variable for the current inputs and the results*/
    /*The type is of string*/
    private String curr, res;

    /*private variable for the buttons*/
    private Button bu0, bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, buAC,buBackspace, buDivide, buMultiply, buDot, buEqual, buPlus, buMinus;

    /*Add a boolean function to the dot button*/
    private boolean dot_inserted, operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation = (EditText) findViewById(R.id.calculation);
        result = (EditText) findViewById(R.id.result);

        curr ="";
        res ="";

        dot_inserted = false;
        operator_inserted = false;


        bu0 = (Button) findViewById(R.id.bu0);
        bu1 = (Button) findViewById(R.id.bu1);
        bu2 = (Button) findViewById(R.id.bu2);
        bu3 = (Button) findViewById(R.id.bu3);
        bu4 = (Button) findViewById(R.id.bu4);
        bu5 = (Button) findViewById(R.id.bu5);
        bu6 = (Button) findViewById(R.id.bu6);
        bu7 = (Button) findViewById(R.id.bu7);
        bu8 = (Button) findViewById(R.id.bu8);
        bu9 = (Button) findViewById(R.id.bu9);
        buDot = (Button) findViewById(R.id.buDot);
        buMultiply = (Button) findViewById(R.id.buMultiply);
        buDivide = (Button) findViewById(R.id.buDivide);
        buPlus = (Button) findViewById(R.id.buPlus);
        buMinus = (Button) findViewById(R.id.buMinus);
        buAC = (Button) findViewById(R.id.buAC);
        buBackspace = (Button) findViewById(R.id.buBackspace);
        buEqual = (Button) findViewById(R.id.buEqual);

        /*set onclick listeners to the buttons*/
        bu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               curr = curr + "0";
               displayNum();
            }
        });

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "1";
                displayNum();
            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "2";
                displayNum();
            }
        });

        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "3";
                displayNum();
            }
        });

        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "4";
                displayNum();
            }
        });

        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "5";
                displayNum();
            }
        });

        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "6";
                displayNum();
            }
        });

        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "7";
                displayNum();
            }
        });

        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "8";
                displayNum();
            }
        });

        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "9";
                displayNum();
            }
        });

        buDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*check for validation if it's empty append "0." and set dot_inserted variable to true*/
                if(curr.isEmpty()){
                curr = "0.";
                dot_inserted=true;
            }
                /*check fr validation if dot_inserted is equals to false append "."*/
                /*Add it to the string*/
                if(dot_inserted == false){
                    curr = curr + ".";
                    dot_inserted = true;
                }
                displayNum();
            }


        });

        buAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayNum();
                resNum();
            }
        });

        buBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                del();
                displayNum();
            }
        });

        /*Add operators onclick event listeners*/
        buDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*set dot_inserted to false*/
                dot_inserted = false;

                /*check for validation if curr is empty*/
                if(curr.isEmpty()){
                    /*check if the last digit is a dot and remove it*/
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        del();
                    }
                }

                /*check fr validation if operator is inserted is equal to false then append the operator to curr*/
                if(operator_inserted == false){
                    curr = curr + "/";
                    operator_inserted = true;
                }
                displayNum();
            }


        });

        buMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*set dot_inserted to false*/
                dot_inserted = false;

                /*check for validation if curr is empty*/
                if(curr.isEmpty()){
                    /*check if the last digit is a dot and remove it*/
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        del();
                    }
                }

                /*check fr validation if operator is inserted is equal to false then append the operator to curr*/
                if(operator_inserted == false){
                    curr = curr + "*";
                    operator_inserted = true;
                }
                displayNum();
            }


        });

        buPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*set dot_inserted to false*/
                dot_inserted = false;

                /*check for validation if curr is empty*/
                if(curr.isEmpty()){
                    /*check if the last digit is a dot and remove it*/
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        del();
                    }
                }

                /*check fr validation if operator is inserted is equal to false then append the operator to curr*/
                if(operator_inserted == false){
                    curr = curr + "+";
                    operator_inserted = true;
                }
                displayNum();
            }


        });

        buMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*set dot_inserted to false*/
                dot_inserted = false;

                /*check for validation if curr is empty*/
                if(curr.isEmpty()){
                    /*check if the last digit is a dot and remove it*/
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        del();
                    }
                }

                /*check fr validation if operator is inserted is equal to false then append the operator to curr*/
                if(operator_inserted == false){
                    curr = curr + "-";
                    operator_inserted = true;
                }
                displayNum();
            }


        });

        buEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*check if the last digit is an operator*/
                if(operator_inserted==true && !curr.substring(curr.length()-1,curr.length()).equals(" ")){


                    String [] tokens = curr.split(" ");
                    switch(tokens[1].charAt(0)){

                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case '/':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                        case '*':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;

                    }
                    resNum();
                }
            }


        });


    }

    public void displayNum(){
        calculation.setText(curr);
    }

    public void resNum(){
        result.setText(res);
    }

    public void clear(){
        curr = "";
        res = "";
        dot_inserted= false;
        operator_inserted = false;
    }

    /*This function will remove a number which has been typed and it's wrong Basically a backspace*/
    public void del(){
        /*use an if statement to check if the curr is not empty remove the last number*/
        if(!curr.isEmpty()){

            /*check if the dot is the last char in the curr then set dot_inserted to false*/
            if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                dot_inserted = false;
            }

            /*Check validation for the operator*/
            /*if operator is detected delete 3 digits or chars from the curr and
             set operator inserted to false*/
            /*The 3digits or number include the default spaces*/
            if(curr.substring(curr.length()-1, curr.length()).equals(" ")){
                curr = curr.substring(0, curr.length()-3);
                operator_inserted = false;
            }else{
                curr = curr.substring(0, curr.length()-1);
            }
        }
    }
}

