package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static com.example.android.scorekeeper.R.id.action_settings;

/**
 * This activity keeps track of score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Timon
    int scoreTimon = 0;

    // Tracks the score for Pumbaa
    int scorePumbaa = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimpSlifiableIfStatement
        if (id == action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Timon by 1 point.
     */
    public void addOneForTimon(View v) {
        scoreTimon = scoreTimon + 1;
        displayForTimon(scoreTimon);
    }

    /**
     * Increase the score for Timon by 2 points.
     */
    public void addTwoForTimon(View v) {
        scoreTimon = scoreTimon + 2;
        displayForTimon(scoreTimon);
    }

    /**
     * Increase the score for Timon by 3 points.
     */
    public void addThreeForTimon(View v) {
        scoreTimon = scoreTimon + 3;
        displayForTimon(scoreTimon);
    }

    /**
     * Increase the score for Pumbaa by 1 point.
     */
    public void addOneForPumbaa(View v) {
        scorePumbaa = scorePumbaa + 1;
        displayForPumbaa(scorePumbaa);
    }

    /**
     * Increase the score for Pumbaa by 2 points.
     */
    public void addTwoForPumbaa(View v) {
        scorePumbaa = scorePumbaa + 2;
        displayForPumbaa(scorePumbaa);
    }

    /**
     * Increase the score for Pumbaa by 3 points.
     */
    public void addThreeForPumbaa(View v) {
        scorePumbaa = scorePumbaa + 3;
        displayForPumbaa(scorePumbaa);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTimon = 0;
        scorePumbaa = 0;
        displayForTimon(scoreTimon);
        displayForPumbaa(scorePumbaa);
    }

    /**
     * Displays the given score for Timon.
     */
    private void displayForTimon(int score) {
        TextView scoreView = (TextView) findViewById(R.id.timon_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Pumbaa.
     */
    private void displayForPumbaa(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pumbaa_score);
        scoreView.setText(String.valueOf(score));
    }
}