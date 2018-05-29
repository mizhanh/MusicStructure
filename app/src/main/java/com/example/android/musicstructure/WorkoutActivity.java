package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.music_list);

        ArrayList<Music> songs = new ArrayList<Music>();

        songs.add(new Music(R.drawable.acdc, getString(R.string.workout_song1), getString(R.string.workout_song1_artist)));
        songs.add(new Music(R.drawable.addicted,getString(R.string.workout_song2), getString(R.string.workout_song2_artist)));
        songs.add(new Music(R.drawable.avicii, getString(R.string.workout_song3), getString(R.string.workout_song3_artist)));
        songs.add(new Music(R.drawable.baauer, getString(R.string.workout_song4), getString(R.string.workout_song4_artist)));
        songs.add(new Music(R.drawable.beastie, getString(R.string.workout_song5), getString(R.string.workout_song5_artist)));
        songs.add(new Music(R.drawable.beyonce, getString(R.string.workout_song6), getString(R.string.workout_song6_artist)));
        songs.add(new Music(R.drawable.bruno, getString(R.string.workout_song7), getString(R.string.workout_song7_artist)));
        songs.add(new Music(R.drawable.daft, getString(R.string.workout_song8), getString(R.string.workout_song8_artist)));
        songs.add(new Music(R.drawable.dmx, getString(R.string.workout_song9), getString(R.string.workout_song9_artist)));
        songs.add(new Music(R.drawable.eminem, getString(R.string.workout_song10), getString(R.string.workout_song10_artist)));

        final MusicAdapter musicAdapter = new MusicAdapter(this, songs, R.color.category_workout);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(musicAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String song = musicAdapter.getItem(position).getSong();
                String artist = musicAdapter.getItem(position).getArtist();
                int imageResourceId = musicAdapter.getItem(position).getImageResourceId();

                Intent playingNowIntent = new Intent(WorkoutActivity.this, PlayNowActivity.class);

                playingNowIntent.putExtra("song", song);
                playingNowIntent.putExtra("artist", artist);
                playingNowIntent.putExtra("imageResourceId", imageResourceId);

                startActivity(playingNowIntent);
            }
        });
    }
}
