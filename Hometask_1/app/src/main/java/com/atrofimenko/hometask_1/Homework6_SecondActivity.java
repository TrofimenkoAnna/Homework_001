package com.atrofimenko.hometask_1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Homework6_SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        if (savedInstanceState == null) {
            Fragment_details details = Fragment_details.newInstance(getIntent().getIntExtra("position", 0));
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }
    }
}
