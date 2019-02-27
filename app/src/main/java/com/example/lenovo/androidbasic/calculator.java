package com.example.lenovo.androidbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class calculator extends AppCompatActivity implements View.OnClickListener{

    Button one, two, plus, sub, multiple, equal, clear;
    ImageButton divide;
    EditText editText;
    String temp, number1, number2;
    int symbol;

    MathOperation mathOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        one=findViewById(R.id.btnOne);
        two=findViewById(R.id.btnTwo);
        plus=findViewById(R.id.Plus);
        sub=findViewById(R.id.sub);
        multiple=findViewById(R.id.multiple);
        divide=findViewById(R.id.divide);


        equal=findViewById(R.id.Equal);
        editText=findViewById(R.id.Etnumber);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        plus.setOnClickListener(this);
        sub.setOnClickListener(this);
        multiple.setOnClickListener(this);
        divide.setOnClickListener(this);
        equal.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("##", "On Start");
    }

    @Override
    public void onClick(View v) {



        switch (v.getId())
        {

            case R.id.btnOne:
                temp=editText.getText().toString();
                editText.setText(temp+"1");
                 break;

            case R.id.btnTwo:
                temp=editText.getText().toString();
                editText.setText(temp+"2");
                break;

            case R.id.Plus:
               symbol=1;
               number1=editText.getText().toString();
               editText.setText("");
                break;

            case R.id.sub:
                symbol=2;
                number1=editText.getText().toString();
                editText.setText("");
                break;

            case R.id.multiple:
                symbol=3;
                number1=editText.getText().toString();
                editText.setText("");
                break;

            case R.id.divide:
                symbol=4;
                number1=editText.getText().toString();
                editText.setText("");
                break;


            case R.id.Equal:
                number2=editText.getText().toString();

                if (symbol==1)
                {
                    mathOperation=new MathOperation(Integer.parseInt(number1), Integer.parseInt(number2));
                    int a = mathOperation.addition();
                    editText.setText(String.valueOf(a));


                }

               if(symbol==2)
                {
                    mathOperation=new MathOperation(Integer.parseInt(number1), Integer.parseInt(number2));
                    int b = mathOperation.subtraction();
                    editText.setText(String.valueOf(b));
                }

                if(symbol==3)
                {
                    mathOperation=new MathOperation(Integer.parseInt(number1), Integer.parseInt(number2));
                    int b = mathOperation.multiplication();
                    editText.setText(String.valueOf(b));
                }

                if(symbol==4)
                {
                    mathOperation=new MathOperation(Integer.parseInt(number1), Integer.parseInt(number2));
                    int b = mathOperation.division();
                    editText.setText(String.valueOf(b));
                }

                break;

        }

    }


}
