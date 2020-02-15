package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MemoriesActivity extends AppCompatActivity {

    ImageView imageButton;
    ImageView imageButton2;
    ImageView imageButton3;
    ImageView imageButton4;
    ImageView imageButton5;
    ImageView imageButton6;
    ImageView imageButton7;
    ImageView imageButton8;
    ImageView imageButton9;
    ImageView imageButton10;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memories);

        imageButton = findViewById(R.id.firstpic);
        imageButton2 = findViewById(R.id.secondpic);
        imageButton3 = findViewById(R.id.thirdpic);
        imageButton4 = findViewById(R.id.fourthpic);
        imageButton5 = findViewById(R.id.fifthpic);
        imageButton6 = findViewById(R.id.sixthpic);
        imageButton7 = findViewById(R.id.seventhpic);
        imageButton8 = findViewById(R.id.eighthpic);
        imageButton9 = findViewById(R.id.ninthpic);
        imageButton10 = findViewById(R.id.tenthpic);

    }
}
