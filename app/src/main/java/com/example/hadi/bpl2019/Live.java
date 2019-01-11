package com.example.hadi.bpl2019;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Live extends AppCompatActivity {

    WebView LiveTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (isConnected(this)) {
            LiveTv = findViewById(R.id.liveTv);

            LiveTv.loadUrl("https://www.youtube.com/watch?v=QbSYbAaQTsY");
            WebSettings webSettings = LiveTv.getSettings();
            webSettings.setJavaScriptEnabled(true);
            LiveTv.setWebViewClient(new WebViewClient());
        }else {
            Toast.makeText(Live.this,"No internet", Toast.LENGTH_LONG).show();
            finish();
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
        if (LiveTv.canGoBack()) {
            LiveTv.goBack();
        } else {
            onBackPressed();
        }
    }

    public boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();
    }


}
