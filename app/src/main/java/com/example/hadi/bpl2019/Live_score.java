package com.example.hadi.bpl2019;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Live_score extends AppCompatActivity {

    WebView LiveScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_score);

        if (isConnected(this)){
            LiveScore = findViewById(R.id.liveScore);

            LiveScore.loadUrl("https://m.cricbuzz.com/cricket-match/live-scores");
            WebSettings webSettings =  LiveScore.getSettings();
            webSettings.setJavaScriptEnabled(true);
            LiveScore.setWebViewClient(new WebViewClient());
        }else {
            Toast.makeText(Live_score.this,"No internet", Toast.LENGTH_LONG).show();
            finish();
        }

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        if (LiveScore.canGoBack()){
            LiveScore.goBack();
        }else {
            onBackPressed();
        }
    }

    public boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }

}
