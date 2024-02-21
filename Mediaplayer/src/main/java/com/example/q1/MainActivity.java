package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    Button play,pause,stop;
    Spinner spinner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String item = adapterView.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Chill Bro");
        arrayList.add("Adigaa");
        arrayList.add("Why this kolavari");
        arrayList.add("Im Scared of");
        arrayList.add("Pick up the phone");
        arrayList.add("Chedhu Nijam");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner.setAdapter(adapter);

    }

    public void play(View v)
    {
        if(player==null)
        {
            String selectedSong = spinner.getSelectedItem().toString();


            switch (selectedSong) {
                case "Chill Bro":
                    player =  MediaPlayer.create(this,R.raw.song4);
                    Toast.makeText(this,"Song: "+selectedSong,Toast.LENGTH_SHORT).show();
                    break;
                case "Adigaa":
                    player =  MediaPlayer.create(this,R.raw.song3);
                    Toast.makeText(this,"Song: "+selectedSong,Toast.LENGTH_SHORT).show();
                    break;
                case "Why this kolavari":
                    player =  MediaPlayer.create(this,R.raw.song2);
                    Toast.makeText(this,"Song: "+selectedSong,Toast.LENGTH_SHORT).show();
                    break;
                case "Im Scared of":
                    player =  MediaPlayer.create(this,R.raw.song1);
                    Toast.makeText(this,"Song: "+selectedSong,Toast.LENGTH_SHORT).show();
                    break;
                case "Pick up the phone":
                    player =  MediaPlayer.create(this,R.raw.song);
                    Toast.makeText(this,"Song: "+selectedSong,Toast.LENGTH_SHORT).show();
                    break;
                case "Chedhu Nijam":
                    player =  MediaPlayer.create(this,R.raw.song5);
                    Toast.makeText(this,"Song: "+selectedSong,Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Toast.makeText(this,"Song: None",Toast.LENGTH_SHORT).show();
            }
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopplayer();
                }
            });
        }
        player.start();
    }

    public void pause(View v)
    {
        if(player!=null)
        {
            player.pause();
        }
    }
    public void stop(View v)
    {
        stopplayer();
    }

    public void reset(View v)
    {
       player.reset();
    }

    private void stopplayer()
    {
        if(player!=null)
        {
            player.release();
            player = null;
        }
    }


    protected void onstop()
    {
        super.onStop();
        stopplayer();
    }
}