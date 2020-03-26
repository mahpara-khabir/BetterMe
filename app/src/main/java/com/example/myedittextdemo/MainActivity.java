package com.example.myedittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1Id);
        button1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent button1Intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(button1Intent);
        Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();

    }
}
