package com.example.hadi.bpl2019;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button timeId, team, live, history;
    Typeface typeface;
    WebView banner;
    String myText = "<h1><marquee> Learn <i>HSC ICT </i> With Hadi @ ICT Learning Point </marquee></h1>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeId = findViewById(R.id.timeId);
        team = findViewById(R.id.teamId);
        live = findViewById(R.id.liveId);
        history = findViewById(R.id.historyId);
        banner = findViewById(R.id.banner);

        typeface = Typeface.createFromAsset(getAssets(), "font/Mohua.ttf");
        timeId.setTypeface(typeface);
        team.setTypeface(typeface);
        live.setTypeface(typeface);
        history.setTypeface(typeface);


        banner.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    public void timeTable(View view) {
        Intent intent = new Intent(MainActivity.this, time.class);
        startActivity(intent);
    }

    public void teamIntro(View view) {
        Intent intent = new Intent(MainActivity.this, Team_list.class);
        startActivity(intent);
    }

    public void Live(View view) {
        Intent intent = new Intent(MainActivity.this, Live.class);
        startActivity(intent);
    }

    public void Details(View view) {
        Intent intent = new Intent(MainActivity.this, Details.class);
        startActivity(intent);
    }

    public void liveScore(View view) {
        Intent intent = new Intent(MainActivity.this, Live_score.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("Confirmation")
                .setMessage("Do you want to exit?")
                .setCancelable(false)

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Canceled", Toast.LENGTH_SHORT).show();
                    }
                })

                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
