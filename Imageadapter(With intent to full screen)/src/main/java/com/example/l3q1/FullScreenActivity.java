package com.example.l3q1;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        ImageView imageView = findViewById(R.id.imageViewFullScreen);

        // Retrieve the image ID passed from MainActivity
        int imageId = getIntent().getIntExtra("imageId", -1);
        if (imageId != -1) {
            // Set the image in the ImageView
            imageView.setImageResource(imageId);

            // Close the activity after 10 seconds
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Finish the activity and return to MainActivity
                    finish();
                }
            }, 10000); // 10 seconds
        }
    }
}
