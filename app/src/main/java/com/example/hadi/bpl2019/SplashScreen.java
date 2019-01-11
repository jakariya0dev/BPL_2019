package com.example.hadi.bpl2019;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {


    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView textView = findViewById(R.id.dev);
        progressBar = findViewById(R.id.pgBar);

        getSupportActionBar().hide();

        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/Charm.ttf");
        textView.setTypeface(typeface);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });

        thread.start();
    }

    public void doWork(){

        for (int i = 1; i <= 100; i++){
            try {
                Thread.sleep(30);
                progressBar.setProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void startApp(){
        Intent intent =new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
