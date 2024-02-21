package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int receivedinteger = intent.getIntExtra("MY_KEY",0);
        String str = Integer.valueOf(receivedinteger).toString();
        TextView res = findViewById(R.id.textView);
        res.setText("Result: "+str);
    }
}