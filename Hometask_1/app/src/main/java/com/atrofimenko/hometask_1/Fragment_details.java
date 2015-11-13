package com.atrofimenko.hometask_1;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_details extends Fragment {
    public static Fragment_details newInstance(int pos) {
        Fragment_details details = new Fragment_details();
        Bundle args = new Bundle();
        args.putInt("position", pos);
        details.setArguments(args);
        return details;
    }

    int getPosition() {
        return getArguments().getInt("position", 0);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment_details, container, false);
        TextView tv = (TextView) v.findViewById(R.id.detailsText);
        tv.setText(getResources().getStringArray(R.array.content)[getPosition()]);
        return v;
    }
}
