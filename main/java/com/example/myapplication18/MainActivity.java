package com.example.myapplication18;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //crea oggeto button
        Button button = findViewById(R.id button());
        MediaPlayer sound1 = MediaPlayer.create(context this, R.row.sound1)
        button.setOnClickListener(new View.OnClickListener()) {

            @override
            public void onClick (View view){
                sound1.start();
            }
        });

            }
        }