package com.example.hadi.bpl2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Team_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void rangpur(View view) {
        Intent intent = new Intent(Team_list.this, rangpur.class);
        startActivity(intent);

    }

    public void dhaka(View view) {
        Intent intent = new Intent(Team_list.this, Dhaka.class);
        startActivity(intent);
    }

    public void rajshahi(View view) {
        Intent intent = new Intent(Team_list.this, Rajshahi.class);
        startActivity(intent);
    }

    public void chittagong(View view) {
        Intent intent = new Intent(Team_list.this, Chittagong.class);
        startActivity(intent);
    }

    public void comilla(View view) {
        Intent intent = new Intent(Team_list.this, Comilla.class);
        startActivity(intent);
    }

    public void khulna(View view) {
        Intent intent = new Intent(Team_list.this, Khulna.class);
        startActivity(intent);

    }

    public void sylhet(View view) {
        Intent intent = new Intent(Team_list.this, Sylhet.class);
        startActivity(intent);
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
}
