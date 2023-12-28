package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titeTxt;
    Button startButt,stopButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButt = findViewById(R.id.startButt);
        stopButt = findViewById(R.id.stopButt);
        titeTxt = findViewById(R.id.titleHeading);

        //remember a service doesnt work unless in the android manifest
        startButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent serviceIntent = new Intent(getApplicationContext(),AbuCustomService.class);
                startService(serviceIntent);
            }
        });

        stopButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(getApplicationContext(),AbuCustomService.class);
                stopService(serviceIntent);

            }
        });

    }

}