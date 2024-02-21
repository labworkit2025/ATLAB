package com.example.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v)
    {
         tv =  findViewById(R.id.textView);
         et =  findViewById(R.id.editTextTextPersonName);
        String wrd;
        wrd =  et.getText().toString();
        char a;
        String word="";
        for(int i=0;i<wrd.length();i++)
        {
            a=wrd.charAt(i);
            a+=1;
            if(a>'z')
            {
                a-=26;
            }
            word+=a;
        }
        tv.setText(word);
    }
}