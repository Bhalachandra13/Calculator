package com.basiccalculator.mybasiccalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
     Button btnAdd,btnsub,btndivide,btnmul;
    TextView tvresult;

     EditText etfirst,etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnsub = (Button)findViewById(R.id.btnSubtract);
        btndivide = (Button)findViewById(R.id.btnDivide);
        btnmul = (Button)findViewById(R.id.btnMultiply);
        etfirst = (EditText)findViewById(R.id.etFirstNumber);
        etsecond =(EditText)findViewById(R.id.etSecondNumber);
        tvresult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String num3 = etfirst.getText().toString();
        String num4 = etsecond.getText().toString();
        int num1=Integer.parseInt(num3);
        int num2=Integer.parseInt(num4);
        switch(view.getId()){
            case R.id.btnAdd:
                try {

                    int addition = Add(num1,num2);
                    tvresult.setText(String.valueOf(addition));
                }
                catch(Exception e){
                    tvresult.setText("Cannot ADD!");
                }
                break;
            case R.id.btnSubtract:
                try {
                     int subtraction=Sub(num1,num2);
                    tvresult.setText(String.valueOf(subtraction));
                }
                catch(Exception e){
                    tvresult.setText("Cannot SUBTRACT!");
                }
                    break;
            case R.id.btnDivide:

                try{
                    float division = Div(num1,num2);
                    tvresult.setText(String.valueOf(division));
                }catch(Exception e){
                    tvresult.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
               try {
                   int multiply = Mul(num1,num2);
                   tvresult.setText(String.valueOf(multiply));
               }
               catch(Exception e){
                   tvresult.setText("Cannot MULTIPLY!");
               }
                   break;
        }
    }
        public int  Add(int a,int b)
        {
            return a+b;
        }

        public int Sub(int a,int b)
        {
            return a-b;
        }

        public float Div(int a,int b)
        {
            return a/b;
        }

       public int Mul(int a,int b)
       {
           return a*b;
       }
}