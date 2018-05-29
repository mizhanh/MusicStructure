package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the favorite category
        TextView favorite = (TextView) findViewById(R.id.favorite);

        // Set a click listener on that View
        favorite.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the favorite category is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                // Start the new activity
                startActivity(favoriteIntent);
            }
        });

        // Find the View that shows the workout category
        TextView workout = (TextView) findViewById(R.id.workout);

        // Set a click listener on that View
        workout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the wakeup category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WakeupActivity}
                Intent workoutIntent = new Intent(MainActivity.this, WorkoutActivity.class);
                // Start the new activity
                startActivity(workoutIntent);
            }
        });

        // Find the View that shows the wakeup category
        TextView wakeup = (TextView) findViewById(R.id.wakeup);

        // Set a click listener on that View
        wakeup.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the wakeup category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WakeupActivity}
                Intent wakeupIntent = new Intent(MainActivity.this, WakeupActivity.class);
                // Start the new activity
                startActivity(wakeupIntent);
            }
        });

        // Find the View that shows the bedtime category
        TextView bedtime = (TextView) findViewById(R.id.bedtime);

        // Set a click listener on that View
        bedtime.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the bedtime category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BedtimeActivity}
                Intent bedtimeIntent = new Intent(MainActivity.this, BedtimeActivity.class);
                // Start the new activity
                startActivity(bedtimeIntent);
            }
        });
    }
}
