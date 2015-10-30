package com.atrofimenko.hometask_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {
    public abstract void addFragment();
    public abstract boolean isAddFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isAddFragment()){
            addFragment();
        } else {
            setContentView(R.layout.activity_base);
        }
    }


}
