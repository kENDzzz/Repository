package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button memoriesButton;
    Button messageButton;
    Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        memoriesButton = findViewById(R.id.memoriesButton);
        messageButton = findViewById(R.id.messageButton);
        aboutButton = findViewById(R.id.aboutButton);

        memoriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MemoriesActivity.class);
                startActivity(intent);
                finish();
                }
            });

        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MessageActivity.class);
                startActivity(intent);
                finish();
                }
            });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
