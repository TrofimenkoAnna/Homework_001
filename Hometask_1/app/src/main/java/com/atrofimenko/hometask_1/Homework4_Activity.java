package com.atrofimenko.hometask_1;

import android.os.Bundle;

public class Homework4_Activity extends BaseActivity implements Interface_Navigation {

    @Override
    public boolean isAddFragment()
    {
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework4);
    }

    @Override
    public void addFragment()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MainFragment()).commit();
    }

    @Override
    public void showNext()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NextFragment())
                .addToBackStack(null).commit();
    }

    @Override
    public void showPrevious()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PreviousFragment())
                .addToBackStack(null).commit();
    }

}
