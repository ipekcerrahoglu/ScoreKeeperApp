package com.example.lenovo.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faulsTeamA = 0;
    int faulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayScoreTeamA(0);
        displayFaulsTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFaulsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fauls);
        scoreView.setText(String.valueOf(score));
    }

    public void addScoreTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;

        displayScoreTeamA(scoreTeamA);
    }
    public void addFaulsTeamA(View v) {
        faulsTeamA = faulsTeamA + 1;
        displayFaulsTeamA(faulsTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFaulsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fauls);
        scoreView.setText(String.valueOf(score));
    }

    public void addScoreTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;

        displayScoreTeamB(scoreTeamB);
    }
    public void addFaulsTeamB(View v) {
        faulsTeamB = faulsTeamB + 1;
        displayFaulsTeamB(faulsTeamB);
    }

    public void resetScore(View v) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        faulsTeamA = 0;
        faulsTeamB = 0;

        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFaulsTeamA(faulsTeamA);
        displayFaulsTeamB(faulsTeamB);
    }
}
