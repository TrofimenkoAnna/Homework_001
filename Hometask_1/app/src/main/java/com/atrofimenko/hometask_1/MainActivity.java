package com.atrofimenko.hometask_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hw1_btn = (Button) findViewById(R.id.hw1_btn);
        Button hw2_btn = (Button) findViewById(R.id.hw2_btn);
        hw1_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, Homework1_Activity.class);
                startActivity(intent);
            }
        });

        hw2_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, Homework2_Activity.class);
                startActivity(intent);
            }
        });
    }
}
