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
        songs.add(new Song("VOgFZfRVaww", "Imagine", "John Lennon",
                R.drawable.play, "John Lennon’s most famous album is not what it seems. " +
                "A huge commercial success both upon its release and immediately after Lennon’s murder, " +
                "Imagine is generally seen as the star’s inevitable return to conventional pop after the ferocious flurry of avant-garde experiments," +
                " protest singles, primal confessionals and live rave-ups of the Yoko Ono-led 1968-70 period. " +
                "But, beyond the title-track and the presence of Phil Spector and George Harrison, " +
                "Imagine is a weird, ramshackle collection of eclectic gems that uniquely links Lennon the raging politico" +
                " (and lippy bitch) with Lennon the peace-loving dreamer and adoring husband. Official video by Emi Records"));
        songs.add(new Song("xbhCPt6PZIU", "Stairway To Heaven", "Led Zeppelin",
                R.drawable.play, "composed by guitarist Jimmy Page and vocalist Robert Plant " +
                "for the band's untitled fourth studio album (usually referred to as \"Led Zeppelin IV\")"));
        songs.add(new Song("eu5lv2Umn3M", "Smoke On The Water", "Deep Purple",
                R.drawable.play, "Music video by Deep Purple performing Smoke On The Water. " +
                "(C) 2007 Montreux Sounds SA, exclusively licensed to Eagle Rock Entertainment Ltd"));
        songs.add(new Song("eaOGW5pI3Ss", "November Rain", "Guns N' Roses",
                R.drawable.play, "When I look into your eyes I can see a love restrained But darlin' when" +
                " I hold you Don't you know I feel the same"));
        songs.add(new Song("ayVSBQPoRKw", "Bad Romance", "Lady Gaga",
                R.drawable.play, "Music video by Lady Gaga performing Bad Romance. " +
                "(C) 2009 Interscope Records"));
        songs.add(new Song("MS_bN5ECJTI", "They Dance Alone", "Sting",
                R.drawable.play, "Music video by Sting performing They Dance Alone (Cueca Solo). " +
                "(C) 1988 A&M Records"));
        songs.add(new Song("Qt2mbGP6vFI", "Another Day In Paradise", "Phil Collins",
                R.drawable.play, "“Another Day In Paradise” was the first single to be released " +
                "from Phil Collins’ number-1 1989 album ‘...But Seriously’."));
        songs.add(new Song("YShXibdWYk", "We are The World", "Usa For Africa",
                R.drawable.play, "USA for Africa   We Are The World  Original Music Video 1985  HD"));
        songs.add(new Song("zw4MN47mgU4", "Dare (la La La)", "Shakira",
                R.drawable.play, "Music video by Shakira performing Dare (La La La). " +
                "(C) 2014 Ace Entertainment S.ar.l."));
        songs.add(new Song("eZVLHjnitnM", "Didn't we almost have it all", "Whitney Houston",
                R.drawable.play, "Whitney Elizabeth Houston (August 9, 1963 – February 11, 2012)" +
                " was an American singer, actress, producer, and model. In 2009, Guinness World Records cited her" +
                " as the most awarded female act of all time"));

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
                //create a bundle to pass the clicked object s of type Song to the DetailActivity;
                Bundle bundle = new Bundle();
                bundle.putSerializable("song", s);
                detailIntent.putExtras(bundle);
                // Start the new activity
                startActivity(detailIntent);
            }
        });
    }
}
