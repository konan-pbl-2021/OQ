package com.example.oq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Spermarket3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spermarket3);
        Button yesButton = (Button)findViewById(R.id.missbutton);
        Button noButton = (Button)findViewById(R.id.nobutton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spermarket3Activity.this,Spermarket4Activity.class);
                startActivity(intent);
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spermarket3Activity.this,Spermarket1MissActivity.class);
                startActivity(intent);
            }
        });
    }
}