package com.atrofimenko.hometask_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button showBtn =(Button) findViewById(R.id.show_btn);
        final TextView textview =(TextView) findViewById(R.id.TView);
        final ImageView imgView = (ImageView) findViewById(R.id.imageView_android);
        imgView.setImageResource(R.drawable.android);
        imgView.setVisibility(View.GONE);
        showBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                textview.setText("Hello:)");
                imgView.setVisibility(View.VISIBLE);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
