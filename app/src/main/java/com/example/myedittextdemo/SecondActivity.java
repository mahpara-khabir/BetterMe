package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView meatImageView,vegImageView,workoutImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        meatImageView=(ImageView)findViewById(R.id.meatImageViewId);
        vegImageView=(ImageView)findViewById(R.id.vegImageViewId);
        workoutImageView=(ImageView)findViewById(R.id.workoutImageViewId);

        meatImageView.setOnClickListener(this);
        vegImageView.setOnClickListener(this);
        workoutImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.meatImageViewId){
            meatImageView.setVisibility(View.GONE);
            vegImageView.setVisibility(View.VISIBLE);
            Toast.makeText(SecondActivity.this, "Vegetables are good for health", Toast.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.vegImageViewId){
            vegImageView.setVisibility(View.GONE);
            workoutImageView.setVisibility(View.VISIBLE);
            Toast.makeText(SecondActivity.this, "Workout makes you fit", Toast.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.workoutImageViewId){
            workoutImageView.setVisibility(View.GONE);
            Intent workoutIntent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(workoutIntent);
            Toast.makeText(SecondActivity.this, "Enter information", Toast.LENGTH_SHORT).show();
            //meatImageView.setVisibility(View.VISIBLE);
        }


    }
}
