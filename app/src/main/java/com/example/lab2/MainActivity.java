package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button openActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openActivity = (Button) findViewById(R.id.button2);
    }

    public void openActivity2(View view){
        Intent intent = new Intent (this, MainActivity2.class);
        startActivity(intent);
    }
}