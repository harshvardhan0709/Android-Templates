package com.example.harsh.passdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView tv1 = (TextView)findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        String message1 = bundle.getString("message");

        tv1.setText(message1);
    }
}
