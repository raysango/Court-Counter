package com.herokuapp.raydashapp.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementTeamA(View view){
        int incValue = Integer.parseInt(view.getTag().toString());
        teamAScore = teamAScore + incValue;
        updateTeamAScore("" + teamAScore);
    }

    public void incrementTeamB(View view){
        int incValue = Integer.parseInt(view.getTag().toString());
        teamBScore = teamBScore + incValue;
        updateTeamBScore("" + teamBScore);
    }

    public void resetScore(View view){
        teamAScore = 0;
        teamBScore = 0;
        updateTeamAScore("" + teamAScore);
        updateTeamBScore("" + teamBScore);
    }

    public void updateTeamAScore(String Ascore) {
        TextView teamAScoreView = findViewById(R.id.team_A_score);
        teamAScoreView.setText(Ascore);
    }

    public void updateTeamBScore(String Bscore) {
        TextView teamBScoreView = findViewById(R.id.team_B_score);
        teamBScoreView.setText(Bscore);
    }
}
