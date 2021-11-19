package com.example.oq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Spermarket1MissActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spermarket1_miss);
        Button missButton = (Button)findViewById(R.id.missbutton);
        missButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Spermarket1MissActivity.this,GameoverActivity.class);
                startActivity(intent);
            }
        });
    }
}