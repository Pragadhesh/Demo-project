package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    Button demo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demo = (Button) findViewById(R.id.button);
        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                OpenSecondPage();

            }
        });
    }
    public void OpenSecondPage()
    {
        Intent intent = new Intent(this,SecondPage.class);
        startActivity(intent);
    }
}