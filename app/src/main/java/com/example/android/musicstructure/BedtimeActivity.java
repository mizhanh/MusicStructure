package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BedtimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.music_list);

        ArrayList<Music> songs = new ArrayList<Music>();

        songs.add(new Music(R.drawable.nature, getString(R.string.bed_song1), getString(R.string.fav_song1_artist)));
        songs.add(new Music(R.drawable.rain, getString(R.string.bed_song2), getString(R.string.fav_song2_artist)));
        songs.add(new Music(R.drawable.rainforest, getString(R.string.bed_song3), getString(R.string.fav_song3_artist)));
        songs.add(new Music(R.drawable.mozart, getString(R.string.bed_song4), getString(R.string.fav_song4_artist)));

        final MusicAdapter musicAdapter = new MusicAdapter(this, songs, R.color.category_bedtime);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(musicAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String song = musicAdapter.getItem(position).getSong();
                String artist = musicAdapter.getItem(position).getArtist();
                int imageResourceId = musicAdapter.getItem(position).getImageResourceId();

                Intent playingNowIntent = new Intent(BedtimeActivity.this, PlayNowActivity.class);

                playingNowIntent.putExtra("song", song);
                playingNowIntent.putExtra("artist", artist);
                playingNowIntent.putExtra("imageResourceId", imageResourceId);

                startActivity(playingNowIntent);
            }
        });

    }
}
