package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_team_a = 0;
    int score_team_b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score_team_a);
        displayForTeamB(score_team_b);
    }

    /**
     * Displays the given score_team_a for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // increment the score_team_a by 3 on clicking the +3 points button

    public void incrementBy3a(View view)
    {
        score_team_a = score_team_a + 3;
        displayForTeamA(score_team_a);
    }

    // increment the score_team_a by 2 on clicking the +2 points button

    public void incrementBy2a(View view)
    {
        score_team_a = score_team_a + 2;
        displayForTeamA(score_team_a);
    }

    // increment the score_team_a by 1 on clicking the free throw button
    public void freethrowa(View view)
    {
        score_team_a = score_team_a + 1;
        displayForTeamA(score_team_a);
    }

    /**
     * Displays the given score_team_a for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // increment the score_team_a by 3 on clicking the +3 points button

    public void incrementBy3b(View view)
    {
        score_team_b = score_team_b + 3;
        displayForTeamB(score_team_b);
    }

    // increment the score_team_a by 2 on clicking the +2 points button

    public void incrementBy2b(View view)
    {
        score_team_b = score_team_b + 2;
        displayForTeamB(score_team_b);
    }

    // increment the score_team_a by 1 on clicking the free throw button
    public void freethrowb(View view)
    {
        score_team_b = score_team_b + 1;
        displayForTeamB(score_team_b);
    }

    //gets called for reset button
    public void reset(View view)
    {
        score_team_a=0;
        score_team_b=0;
        displayForTeamA(score_team_a);
        displayForTeamB(score_team_b);
    }
}
