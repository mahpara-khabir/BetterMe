package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        button4=(Button)findViewById(R.id.button);

        button4.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            Intent button4Intent = new Intent(FourthActivity.this, FivthActivity.class);
            startActivity(button4Intent);


        }

    }
}



