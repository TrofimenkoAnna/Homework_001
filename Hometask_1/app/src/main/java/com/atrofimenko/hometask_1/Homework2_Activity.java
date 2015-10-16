package com.atrofimenko.hometask_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Homework2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework2);

        Button btn_fibonacci = (Button) findViewById(R.id.btn_Fibonacci);
        final EditText edit_nFibonacci = (EditText) findViewById(R.id.edit_nFib);
        final TextView text_Fibonacci = (TextView) findViewById(R.id.text_fib);

        Button btn_factorial = (Button) findViewById(R.id.btn_factorial);
        final EditText edit_nFactorial = (EditText) findViewById(R.id.edit_nFactorial);
        final TextView text_factorial = (TextView) findViewById(R.id.text_factorial);

        btn_fibonacci.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                if (edit_nFibonacci.getText().toString().equals(""))
                {
                    message_err();
                }
                else {
                    long n = Long.parseLong(edit_nFibonacci.getText().toString());
                    text_Fibonacci.setText(String.valueOf(fibonacci(n)));
                }
            }
        });

        btn_factorial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                if (edit_nFactorial.getText().toString().equals(""))
                {
                    message_err();
                }
                else
                {
                    long n=Long.parseLong(edit_nFactorial.getText().toString());
                    text_factorial.setText(String.valueOf(factorial(n)));
                }
            }
        });
    }

    public static long fibonacci(long n)
    {
        return n > 1 ? fibonacci(n - 1) + fibonacci(n - 2) : n;
    }

    public static long factorial(long n) { return (n < 1) ? 1 : n * factorial(--n); }

    public void message_err()
    {
        Toast toast = Toast.makeText(getApplicationContext(),"Error!",Toast.LENGTH_SHORT);
        toast.show();
    }

}
