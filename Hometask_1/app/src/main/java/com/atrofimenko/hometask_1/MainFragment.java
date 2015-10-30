package com.atrofimenko.hometask_1;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class MainFragment extends android.support.v4.app.Fragment {
    private Button btn_next;
    private Button btn_prev;
    private Interface_Navigation interface_navigation;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void  onAttach(Activity activity)
    {
        super.onAttach(activity);
        try {
            interface_navigation = (Interface_Navigation) activity;
        } catch (ClassCastException exception) {
            throw new ClassCastException(activity.toString() +  " Interface_Navigation");
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_next = (Button)view.findViewById(R.id.btn_next);
        btn_prev = (Button)view.findViewById(R.id.btn_prev);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interface_navigation.showNext();
            }
        });

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interface_navigation.showPrevious();
            }
        });

    }

}
