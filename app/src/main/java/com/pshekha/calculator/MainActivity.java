package com.pshekha.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText etvNumber;
    Button  btnAdd;
    Button  btnSub;
    Button  btnMul;
    Button  btnDiv;
    Button  btnCal;
    String sOperator = null;
    int  Number1;
    Calculate mCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etvNumber= findViewById(R.id.etxtNumber);
        btnAdd= findViewById(R.id.bAdd);
        btnSub= findViewById(R.id.bSub);
        btnMul= findViewById(R.id.bMul);
        btnDiv= findViewById(R.id.bDiv);
        btnCal= findViewById(R.id.bCal);

        mCalculate= new Calculate();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                saveNumberOperator("+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumberOperator("-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumberOperator("*");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumberOperator("/");
            }
        });


        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               calculateResult();

            }
        });

    }

    private void saveNumberOperator(String Operator){
        if(etvNumber.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter some number",Toast.LENGTH_LONG).show();
        }else{
        sOperator=Operator;
        Number1 = Integer.parseInt(etvNumber.getText().toString());
        etvNumber.getText().clear();
        }
    }

    private void calculateResult(){
        System.out.println("MainActivity:" + Number1);
        System.out.println("MainActivity:" + sOperator);

        if(etvNumber.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter some number",Toast.LENGTH_LONG).show();
        }else{
            int Number2= Integer.parseInt(etvNumber.getText().toString());
            System.out.println("MainActivity:" + Number2);
            int value=mCalculate.calculateValue(Number1 ,Number2,sOperator);

            if(value== Integer.MIN_VALUE)
                etvNumber.setText("Error");
            else
                etvNumber.setText(String.valueOf(value));
        }


    }
}
