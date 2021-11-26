package com.example.oq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Go1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go1);
        Button yesButton = (Button)findViewById(R.id.missbutton);
        Button noButton = (Button)findViewById(R.id.nobutton);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Go1Activity.this,Go2Activity.class);
                startActivity(intent);
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Go1Activity.this,Go1MissActivity.class);
                startActivity(intent);
            }
        });
    }
}