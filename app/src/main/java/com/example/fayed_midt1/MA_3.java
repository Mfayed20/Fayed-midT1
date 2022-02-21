package com.example.fayed_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MA_3 extends ListActivity {

    String args [] = {"option 1","option 2","option 3","option 4"};

    MediaPlayer mediaPlayer1;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ma3);

        mediaPlayer1 = new MediaPlayer();

        mediaPlayer1 = MediaPlayer.create(this, R.raw.track1);

        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_ma3,
                R.id.list,
                args));


        Button gtA2 = (Button) findViewById(R.id.gtA2);

        gtA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MA_3.this, MainActivity2.class));
            }
        });
    }



    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){

            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alfaisal.edu")));
                break;
            case 1:
            mediaPlayer1.start();
                startActivity(new Intent(MA_3.this,bigger.class));
                break;

        }

    }
}