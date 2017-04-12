package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Tracks the scores for team A and B
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Handles all click events
     */
    public void handleAllClick(View view) {
        switch (view.getId()) {
            // This method is called when the +3 button is clicked.
            case R.id.threePointA:
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);
                Toast.makeText(this, "Such Skills. Much Wow.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.threePointB:
                scoreTeamB = scoreTeamB + 3;
                displayForTeamB(scoreTeamB);
                Toast.makeText(this, "Nothing but net!", Toast.LENGTH_SHORT).show();
                break;

            // This method is called when the +2 button is clicked.
            case R.id.twoPointA:
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);
                Toast.makeText(this, "Boom goes the dynamite!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.twoPointB:
                scoreTeamB = scoreTeamB + 2;
                displayForTeamB(scoreTeamB);
                Toast.makeText(this, "Did you see that? Amazing!", Toast.LENGTH_SHORT).show();
                break;

            // This method is called when the Free Throw button is clicked.
            case R.id.freeThrowA:
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                Toast.makeText(this, "Swish!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.freeThrowB:
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                Toast.makeText(this, "That's how you do it!", Toast.LENGTH_SHORT).show();
                break;

            // This method is called when the Reset button is clicked.
            case R.id.resetScores:
                scoreTeamA = 0;
                displayForTeamA(scoreTeamA);
                scoreTeamB = 0;
                displayForTeamB(scoreTeamB);
                Toast.makeText(this, "All ready for another game!", Toast.LENGTH_SHORT).show();
        }
    }
}
