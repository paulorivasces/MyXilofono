package com.example.myxilofono;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void notaDo(View view) {
        button = findViewById(R.id.button);
        MediaPlayer mpButton = MediaPlayer.create(this,R.raw.note1);
        mpButton.start();

    }

    public void notaRe(View view) {
        button2 = findViewById(R.id.button2);
        MediaPlayer mpButton = MediaPlayer.create(this,R.raw.note2);
        mpButton.start();
    }

    public void notaMi(View view) {
        button3 = findViewById(R.id.button3);
        MediaPlayer mpButton = MediaPlayer.create(this,R.raw.note3);
        mpButton.start();
    }

    public void notaFa(View view) {
        button4 = findViewById(R.id.button4);
        MediaPlayer mpButton = MediaPlayer.create(this,R.raw.note4);
        mpButton.start();
    }

    public void notaSol(View view) {
        button5 = findViewById(R.id.button5);
        MediaPlayer mpButton = MediaPlayer.create(this,R.raw.note5);
        mpButton.start();
    }

    public void notaLa(View view) {
        button6 = findViewById(R.id.button6);
        MediaPlayer mpButton = MediaPlayer.create(this,R.raw.note6);
        mpButton.start();
    }

    public void notaSi(View view) {
        button7 = findViewById(R.id.button7);
        MediaPlayer mpButton = MediaPlayer.create(this,R.raw.note7);
        mpButton.start();
    }
}