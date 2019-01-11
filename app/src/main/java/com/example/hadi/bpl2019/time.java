package com.example.hadi.bpl2019;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.TextView;

public class time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        DatePicker datePicker = new DatePicker(this);

        int days = datePicker.getDayOfMonth();
        int months = datePicker.getMonth() + 1;

        TextView team1 = findViewById(R.id.team1);
        TextView team2 = findViewById(R.id.team2);
        TextView team3 = findViewById(R.id.team3);
        TextView team4 = findViewById(R.id.team4);

        if (days == 11 && months == 1) {
            team1.setText("ঢাকা");
            team2.setText("রংপুর");
            team3.setText("কুমিল্লা");
            team4.setText("রাজশাহী");
        } else if (days == 12 && months == 1) {
            team1.setText("খুলনা");
            team2.setText("চট্রগ্রাম");
            team3.setText("সিলেট");
            team4.setText("ঢাকা");
        } else if (days == 13 && months == 1) {
            team1.setText("রংপুর");
            team2.setText("রাজশাহী");
            team3.setText("কুমিল্লা");
            team4.setText("চট্রগ্রাম");
        } else if (days == 15 && months == 1) {
            team1.setText("খুলনা");
            team2.setText("রাজশাহী");
            team3.setText("সিলেট");
            team4.setText("কুমিল্লা");
        } else if (days == 16 && months == 1) {
            team1.setText("ঢাকা");
            team2.setText("রাজশাহী");
            team3.setText("সিলেট");
            team4.setText("রংপুর");
        } else if (days == 18 && months == 1) {
            team1.setText("সিলেট");
            team2.setText("ঢাকা");
            team3.setText("খুলনা");
            team4.setText("কুমিল্লা");
        } else if (days == 19 && months == 1) {
            team1.setText("সিলেট");
            team2.setText("রংপুর");
            team3.setText("খুলনা");
            team4.setText("চট্রগ্রাম");
        } else if (days == 21 && months == 2) {
            team1.setText("কুমিল্লা");
            team2.setText("রাজশাহী");
            team3.setText("ঢাকা");
            team4.setText("চট্রগ্রাম");
        } else if (days == 22 && months == 2) {
            team1.setText("খুলনা");
            team2.setText("রংপুর");
            team3.setText("ঢাকা");
            team4.setText("কুমিল্লা");
        } else if (days == 23 && months == 2) {
            team1.setText("রাজশাহী");
            team2.setText("চট্রগ্রাম");
            team3.setText("সিলেট");
            team4.setText("খুলনা");
        } else if (days == 25 && months == 2) {
            team1.setText("সিলেট");
            team2.setText("রাজশাহী");
            team3.setText("রংপুর");
            team4.setText("চট্রগ্রাম");
        } else if (days == 26 && months == 2) {
            team1.setText("সিলেট");
            team2.setText("খুলনা");
            team3.setText("রাজশাহী");
            team4.setText("চট্রগ্রাম");
        } else if (days == 28 && months == 2) {
            team1.setText("খুলনা");
            team2.setText("কুমিল্লা");
            team3.setText("ঢাকা");
            team4.setText("রংপুর");
        } else if (days == 29 && months == 2) {
            team1.setText("কুমিল্লা");
            team2.setText("চট্রগ্রাম");
            team3.setText("রংপুর");
            team4.setText("রাজশাহী");
        } else if (days == 30 && months == 2) {
            team1.setText("ঢাকা");
            team2.setText("চট্রগ্রাম");
            team3.setText("সিলেট");
            team4.setText("রাজশাহী");
        } else if (days == 1 && months == 2) {
            team1.setText("ঢাকা");
            team2.setText("কুমিল্লা");
            team3.setText("সিলেট");
            team4.setText("চট্রগ্রাম");
        } else if (days == 2 && months == 2) {
            team1.setText("কুমিল্লা");
            team2.setText("রংপুর");
            team3.setText("ঢাকা");
            team4.setText("খুলনা");
        } else if (days == 4 && months == 2) {
            team1.setText("এলিমেনেটর ৩");
            team2.setText("এলিমেনেটর ৪");
            team3.setText("কোয়ালিফায়ার ১");
            team4.setText("কোয়ালিফায়ার ২");
        } else if (days == 6 && months == 2) {
            team1.setText("এলি-১ জয়ী");
            team2.setText("কো-২ পরাজিত");
            team3.setText("N/A");
            team4.setText("N/A");
        } else if (days == 8 && months == 2) {
            team1.setText("কো-১ জয়ী");
            team2.setText("কো-২ জয়ী");
            team3.setText("N/A");
            team4.setText("N/A");
        } else {
            team1.setText("N/A");
            team2.setText("N/A");
            team3.setText("N/A");
            team4.setText("N/A");
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
}
