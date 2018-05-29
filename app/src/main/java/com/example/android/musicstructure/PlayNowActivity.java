package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class PlayNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_now);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String song = extras.getString("song");
            String artist = extras.getString("artist");
            int imageResourceId = extras.getInt("imageResourceId");
            //The key argument here must match that used in the other activity

            ImageView imageView = (ImageView) findViewById(R.id.list_item_image);
            imageView.setImageResource(imageResourceId);

            TextView textView = (TextView) findViewById(R.id.title_text_view);
            textView.setText(song);

            TextView textView1 = (TextView) findViewById(R.id.artist_text_view);
            textView1.setText(artist);
        }

        TextView home = (TextView) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the favorite category is clicked on.
            @Override
            public void onClick(View view) {
                Intent homePageIntent = new Intent(PlayNowActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homePageIntent);
            }
        });
    }



}

