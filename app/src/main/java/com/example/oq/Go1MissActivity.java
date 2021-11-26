package com.example.oq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Go1MissActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go1_miss);
        Button missButton = (Button)findViewById(R.id.missbutton);
        missButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Go1MissActivity.this,GameoverActivity.class);
                startActivity(intent);
            }
        });
    }
}