package com.example.l3q1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] imgname = {"1", "2", "3", "4"};
        int[] imgid = {R.drawable.random1, R.drawable.random2, R.drawable.random3, R.drawable.random4};

        GridView gridView = findViewById(R.id.gridView);
        imageAdapter = new ImageAdapter(this, imgname, imgid);
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Start FullScreenActivity with the selected image
                /*Intent intent = new Intent(MainActivity.this, FullScreenActivity.class);
                intent.putExtra("imageId", imgid[position]);
                startActivity(intent);*/
            }
        });
    }
}
