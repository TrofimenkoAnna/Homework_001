package com.atrofimenko.hometask_1;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Homework6_Activity extends AppCompatActivity implements Fragment_list.onItemClickListener {
    int position = 0;
    boolean withDetails = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework6);
        if (savedInstanceState != null)
            position = savedInstanceState.getInt("position");
        withDetails = (findViewById(R.id.cont) != null);
        if (withDetails)
            showDetails(position);
    }

    void showDetails(int pos) {
        if (withDetails) {
        Fragment_details details = (Fragment_details) getSupportFragmentManager()
                .findFragmentById(R.id.cont);
        if (details == null || details.getPosition() != pos) {
            details = Fragment_details.newInstance(pos);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.cont, details).commit();
        }
        } else {
            startActivity(new Intent(this, Homework6_SecondActivity.class).putExtra("position", position));
        }
    }

    @Override
    public void itemClick(int position) {
        this.position = position;
        showDetails(position);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("position", position);
    }
}
