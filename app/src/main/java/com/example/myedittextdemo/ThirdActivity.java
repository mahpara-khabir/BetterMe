package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText height,weight,bmi,comment;
    private Button button2,button3;
   //private TextView bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        height=(EditText)findViewById(R.id.heightId);
        weight=(EditText)findViewById(R.id.weightId);
        bmi=(EditText) findViewById(R.id.resultId);
        comment=(EditText) findViewById(R.id.comment1Id);
        //bmi=(TextView)findViewById(R.id.BmiId);

        button2=(Button)findViewById(R.id.button2Id);
        button3=(Button)findViewById(R.id.button3Id);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String number1=height.getText().toString();
        String number2=weight.getText().toString();

        double num1=Double.parseDouble(number1);
        double num2=Double.parseDouble(number2);

        //double result=num2/((num1)*(num1));

        if(v.getId()==R.id.button2Id){
              double result=num2/(num1*num1);
              bmi.setText("BMI:"+result );

              if(result<18.5){
                  comment.setText("Underweight");
              } if(result>=18.5){
                  comment.setText("Normal");
              } if(result>=25.0){
                  comment.setText("Overweight");
              } if(result>=30.0){
                  comment.setText("Obese");
              }


            //Intent button2Intent = new Intent(ThirdActivity.this, FourthActivity.class);

            //startActivity(button2Intent);

        }
        if(v.getId()==R.id.button3Id){
              //double result=num2/((num1)*(num1));
              //bmi.setText("BMI:"+result );


            Intent button3Intent = new Intent(ThirdActivity.this, FourthActivity.class);
            startActivity(button3Intent);
            Toast.makeText(ThirdActivity.this, "Choose one and implement it in your life", Toast.LENGTH_SHORT).show();

        }

    }
}
