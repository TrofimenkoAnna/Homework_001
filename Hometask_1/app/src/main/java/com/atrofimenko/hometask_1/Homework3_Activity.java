package com.atrofimenko.hometask_1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Homework3_Activity extends AppCompatActivity {
    private String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7",
            "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android", "iPhone", "WindowsMobile" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3);
        createAndShowNumbers();
        findViewById(R.id.button_1).setOnClickListener(clickListener);
        findViewById(R.id.button_2).setOnClickListener(clickListener);
        findViewById(R.id.button_3).setOnClickListener(clickListener);
        findViewById(R.id.button_4).setOnClickListener(clickListener);
    }
    private void createAndShowNumbers() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        String strings = TextUtils.join(", ", list);

        TextView text1 = (TextView) findViewById(R.id.text_1);
        text1.setText(strings);
    }
    private void showResult(List<String> list) {
        String strings = TextUtils.join(", ", list);
        TextView text2 = (TextView) findViewById(R.id.text_2);
        text2.setText(strings);
    }

    private void reverseOrder() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(values));
        Collections.reverse(list);
        showResult(list);
    }

    private void removeEveryThird() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(values));
        for (int i = 1; i <= list.size(); i++) {
            if (i % 3 == 0) {
                list.remove(i - 1);
            }
        }
        showResult(list);
    }

    private void removeDuplicates() {
        List<String> list = new ArrayList<>(new HashSet<>(Arrays.asList(values)));
        showResult(list);    }

    private void sortValues() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(values));
        Collections.sort(list);
        showResult(list);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_1:
                    reverseOrder();
                    break;
                case R.id.button_2:
                    removeEveryThird();
                    break;
                case R.id.button_3:
                    removeDuplicates();
                    break;
                case R.id.button_4:
                    sortValues();
                    break;
            }
        }
    };

}
