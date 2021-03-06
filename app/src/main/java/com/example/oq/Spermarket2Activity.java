package com.example.oq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Spermarket2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spermarket2);
        Button yesButton = (Button)findViewById(R.id.missbutton);
        Button noButton = (Button)findViewById(R.id.nobutton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spermarket2Activity.this,GameoverActivity.class);
                startActivity(intent);
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spermarket2Activity.this,Spermarket3Activity.class);
                startActivity(intent);
            }
        });
    }
}