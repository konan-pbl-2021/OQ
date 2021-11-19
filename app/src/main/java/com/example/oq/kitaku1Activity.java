package com.example.oq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kitaku1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitaku1);
        Button scButton = (Button)findViewById(R.id.missbutton);
        Button faButton = (Button)findViewById(R.id.nobutton);
        scButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kitaku1Activity.this,kitaku2Activity.class);
                startActivity(intent);
            }
        });
        faButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kitaku1Activity.this,GameoverActivity.class);
                startActivity(intent);
            }
        });
    }
}