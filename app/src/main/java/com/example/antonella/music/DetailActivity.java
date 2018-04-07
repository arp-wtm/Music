package com.example.antonella.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Find the TextView in the activity_detail.xml layout with the ID song_detail

        TextView songDetailTextView = findViewById(R.id.song_detail);
        int id = getIntent().getIntExtra("song", 0);
        Log.i("id= ", "" + id);
        songDetailTextView.setText("" + id);
    }
}
