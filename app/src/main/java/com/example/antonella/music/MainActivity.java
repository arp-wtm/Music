package com.example.antonella.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Imagine", "John Lennon", R.drawable.play));
        songs.add(new Song(2, "Stairway To Heaven", "Led Zeppelin", R.drawable.play));
        songs.add(new Song(3, "Smoke On The Water", "Deep Purple", R.drawable.play));
        songs.add(new Song(4, "November Rain", "Guns N' Roses", R.drawable.play));
        songs.add(new Song(5, "Bad Romance", "Lady Gaga", R.drawable.play));
        songs.add(new Song(6, "They Dance Alone", "Sting", R.drawable.play));
        songs.add(new Song(7, "Another Day In Paradise", "Phil Collins", R.drawable.play));
        songs.add(new Song(8, "We are The World", "Usa For Africa", R.drawable.play));
        songs.add(new Song(9, "Dare (la La La)", "Shakira", R.drawable.play));
        songs.add(new Song(10, "You give good love", "Whitney Houston", R.drawable.play));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.

        ListView listView = findViewById(R.id.songs_list);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                final Song s = (Song) adapterView.getItemAtPosition(pos);
                Log.i("letto", s.getSongName());

                // Create a new intent to open the {@link DetailActivity}
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                detailIntent.putExtra("song", s.getIdSong());
                // Start the new activity
                startActivity(detailIntent);
            }
        });
    }
}
