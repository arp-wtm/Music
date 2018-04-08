package com.example.antonella.music;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    Song s =
            null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Find the TextView in the activity_detail.xml layout with the ID song_name

        TextView songDetailTextView = findViewById(R.id.song_name);

        // Find the TextView in the activity_detail.xml layout with the ID artist

        TextView artistTextView = findViewById(R.id.artist);

        // Find the TextView in the activity_detail.xml layout with the ID song_description

        TextView songDescriptionTextView = findViewById(R.id.song_description);

        // Find the YouTube Button view in the activity_detail.xml layout with the ID youtube_button

        Button youTubeButton = findViewById(R.id.youtube_button);
        youTubeButton.setText(R.string.clickYouTubeVideo);
        youTubeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                watchYoutubeVideo(DetailActivity.this, s.getIdSong());

            }
        });

        // receive the actual song from the MainActivity

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            s = (Song) bundle.getSerializable("song");
        }
        // display the Song Name in Song Detail screen
        if (s != null) {
            String songTytle = getString(R.string.song_tytle) + " " + s.getSongName();
            songDetailTextView.setText(songTytle);
        }
        // display the Artist Name in Song Detail screen
        if (s != null) {
            String artist = getString(R.string.artist) + " " + s.getArtist();
            artistTextView.setText(artist);
        }
        // display the Song Description in Song Detail screen
        if (s != null) {
            String description = getString(R.string.description) + " " + s.getDescription();
            songDescriptionTextView.setText(description);
        }

    }

    //  call to a video on YouTube with the idSong
    public static void watchYoutubeVideo(Context context, String id) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=" + id));
        try {
            context.startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            context.startActivity(webIntent);
        }
    }
}
