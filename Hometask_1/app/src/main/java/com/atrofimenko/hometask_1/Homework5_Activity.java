package com.atrofimenko.hometask_1;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Homework5_Activity extends AppCompatActivity implements Animation.AnimationListener {
    Animation animFadein;
    Animation animFadeOut;
    Animation animZoomIn;
    Animation animBlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button btn_FadeIn = (Button) findViewById(R.id.btn_FadeIn);
        Button btn_FadeOut = (Button) findViewById(R.id.btn_FadeOut);
        Button btn_ZoomIn = (Button) findViewById(R.id.btn_ZoomIn);
        Button btn_Blink = (Button) findViewById(R.id.btn_Blink);
        final TextView text_anim = (TextView) findViewById(R.id.text_anim);

        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animFadein.setAnimationListener(this);

        btn_FadeIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                text_anim.setVisibility(View.VISIBLE);
                text_anim.startAnimation(animFadein);
            }
        });

        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animFadeOut.setAnimationListener(this);

        btn_FadeOut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                text_anim.setVisibility(View.VISIBLE);
                text_anim.startAnimation(animFadeOut);
            }
        });

        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        animZoomIn.setAnimationListener(this);

        btn_ZoomIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                text_anim.setVisibility(View.VISIBLE);
                text_anim.startAnimation(animZoomIn);
            }
        });

        animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        animBlink.setAnimationListener(this);

        btn_Blink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                text_anim.setVisibility(View.VISIBLE);
                text_anim.startAnimation(animBlink);
            }
        });
    }
    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == animFadein) {
            Toast.makeText(getApplicationContext(), "Animation Stopped",
                    Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
    }

    @Override
    public void onAnimationStart(Animation animation) {
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
