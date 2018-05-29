package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList <Music> songs = new ArrayList<Music>();

        songs.add(new Music(R.drawable.animals, getString(R.string.fav_song1), getString(R.string.fav_song1_artist)));
        songs.add(new Music(R.drawable.adele1, getString(R.string.fav_song2), getString(R.string.fav_song2_artist)));
        songs.add(new Music(R.drawable.phantom, getString(R.string.fav_song3), getString(R.string.fav_song3_artist)));
        songs.add(new Music(R.drawable.eagles, getString(R.string.fav_song4), getString(R.string.fav_song4_artist)));
        songs.add(new Music(R.drawable.journey, getString(R.string.fav_song5), getString(R.string.fav_song5_artist)));
        songs.add(new Music(R.drawable.badmoon, getString(R.string.fav_song6), getString(R.string.fav_song6_artist)));
        songs.add(new Music(R.drawable.zeppelin, getString(R.string.fav_song7), getString(R.string.fav_song7_artist)));
        songs.add(new Music(R.drawable.queen, getString(R.string.fav_song8), getString(R.string.fav_song8_artist)));
        songs.add(new Music(R.drawable.kiss, getString(R.string.fav_song9), getString(R.string.fav_song9_artist)));
        songs.add(new Music(R.drawable.hozier, getString(R.string.fav_song10), getString(R.string.fav_song10_artist)));

        final MusicAdapter musicAdapter = new MusicAdapter(this, songs, R.color.category_favorite);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(musicAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String song = musicAdapter.getItem(position).getSong();
                String artist = musicAdapter.getItem(position).getArtist();
                int imageResourceId = musicAdapter.getItem(position).getImageResourceId();

                Intent playingNowIntent = new Intent(FavoriteActivity.this, PlayNowActivity.class);

                playingNowIntent.putExtra("song", song);
                playingNowIntent.putExtra("artist", artist);
                playingNowIntent.putExtra("imageResourceId", imageResourceId);

                startActivity(playingNowIntent);
            }
        });
    }
}
