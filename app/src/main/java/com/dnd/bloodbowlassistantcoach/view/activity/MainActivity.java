package com.dnd.bloodbowlassistantcoach.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.dnd.bloodbowlassistantcoach.R;

public class MainActivity extends AppCompatActivity {
    private String[] races;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources resources = getResources();
        races = resources.getStringArray(R.array.races);
        Spinner newTeamRaceSpinner = findViewById(R.id.title_create_team_race_spinner);
        populateSpinnerWithString(newTeamRaceSpinner, R.array.races);

        Spinner playAgainstRace = findViewById(R.id.title_play_game_opponent_race);
        populateSpinnerWithString(playAgainstRace, R.array.races);
    }

    public void createTeam(View view) {
        System.out.println("Create team");
        System.out.flush();
    }

    public void editTeam(View view) {
        System.out.println("Edit team");
        System.out.flush();
    }

    public void playGame(View view) {
        System.out.println("Play game");
        System.out.flush();
    }

    public void deleteTeam(View view) {
        System.out.println("Delete team");
        System.out.flush();
    }

    private void populateSpinnerWithString(Spinner spinner, int stringArrayId) {
        ArrayAdapter<CharSequence> raceSpinnerAdapter = ArrayAdapter.createFromResource(this, stringArrayId, R.layout.support_simple_spinner_dropdown_item);
        raceSpinnerAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(raceSpinnerAdapter);
    }
}