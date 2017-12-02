package com.example.android.tenniscourt;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreNadal = 0;
    int scoreFederer = 0;
    int nadalSet1 = 0;
    int nadalSet2 = 0;
    int nadalSet3 = 0;
    int federerSet1 = 0;
    int federerSet2 = 0;
    int federerSet3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset (View view){
        scoreNadal = 0;
        scoreFederer = 0;
        nadalSet1 = 0;
        nadalSet2 = 0;
        nadalSet3 = 0;
        federerSet1 = 0;
        federerSet2 = 0;
        federerSet3 = 0;
        displayForNadal(scoreNadal);
        displayForFederer(scoreFederer);
        displaySetNadal1(nadalSet1);
        displaySetNadal2(nadalSet2);
        displaySetNadal3(nadalSet3);
        displaySetFederer1(federerSet1);
        displaySetFederer2(federerSet2);
        displaySetFederer3(federerSet3);
    }
    public void oneForNadal(View view) {
        if (scoreNadal == 30) {
            scoreNadal = scoreNadal + 10;
        }else if (scoreNadal == 40 && scoreFederer == 50){
            scoreFederer = 40;
            scoreNadal = 40;
        }else if (scoreNadal == 40 && scoreFederer == 40){
            scoreNadal = scoreNadal + 10;
        }else if (scoreNadal == 40 || scoreNadal == 50) {
            nadalSet1 = nadalSet1 + 1;
            scoreNadal = 0;
            scoreFederer = 0;
            if (nadalSet1 > 6) {
                nadalSet2 = nadalSet2 + 1;
                nadalSet1 = 6;
            }
            if (nadalSet2 > 6){
                nadalSet3 = nadalSet3 + 1;
                nadalSet2 = 6;
            }
            if (nadalSet3 > 6){
                nadalSet3 = 6;
                scoreNadal = 0;
                scoreFederer = 0;
            }
        } else{
            scoreNadal = scoreNadal + 15;
        }
        displayForNadal(scoreNadal);
        displaySetNadal1(nadalSet1);
        displaySetNadal2(nadalSet2);
        displaySetNadal3(nadalSet3);
        displayForFederer(scoreFederer);

    }

    public void oneForFederer(View view) {
        if (scoreFederer == 30) {
            scoreFederer = scoreFederer + 10;
        }else if (scoreFederer == 40 && scoreNadal == 50) {
            scoreNadal = 40;
            scoreFederer = 40;
        }else if (scoreFederer == 40 && scoreNadal ==40){
            scoreFederer = scoreFederer + 10;
        }else if (scoreFederer == 40 || scoreFederer == 50) {
            federerSet1 = federerSet1 + 1;
            scoreFederer = 0;
            scoreNadal = 0;
            if (federerSet1 > 6) {
                federerSet2 = federerSet2 + 1;
                federerSet1 = 6;
            }
            if (federerSet2 > 6){
                federerSet3 = federerSet3 + 1;
                federerSet2 = 6;
            }
            if (federerSet3 > 6){
                federerSet3 = 6;
                scoreFederer = 0;
                scoreNadal = 0;
            }
        } else {
            scoreFederer = scoreFederer + 15;
        }

        displayForFederer(scoreFederer);
        displaySetFederer1(federerSet1);
        displaySetFederer2(federerSet2);
        displaySetFederer3(federerSet3);
        displayForNadal(scoreNadal);
    }

    public void displayForNadal(int scoreNadal) {
        TextView scoreView = (TextView) findViewById(R.id.nadal_points);
        if (scoreNadal == 50){
            scoreView.setText("ADV");
        }else{
            scoreView.setText(String.valueOf(scoreNadal));
        }

    }

    public void displayForFederer(int scoreFederer) {
        TextView scoreView = (TextView) findViewById(R.id.federer_points);
        if (scoreFederer == 50) {
            scoreView.setText("ADV");
        } else {
            scoreView.setText(String.valueOf(scoreFederer));
        }
    }

    public void displaySetNadal1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nadal_set_1);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetNadal2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nadal_set_2);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetNadal3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.nadal_set_3);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetFederer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.federer_set_1);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetFederer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.federer_set_2);
        scoreView.setText(String.valueOf(score));
    }
    public void displaySetFederer3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.federer_set_3);
        scoreView.setText(String.valueOf(score));
    }

}
