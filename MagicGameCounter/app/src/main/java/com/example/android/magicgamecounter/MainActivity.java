package com.example.android.magicgamecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    // Constants
    public static final int FIVE = 5;
    public static final int ONE = 1;
    public static final String PLAYER1 = "player1";
    public static final String PLAYER2 = "player2";

    // Instance variables
    int player_1_total = 20;
    int player_2_total = 20;


    /**
     * Fires when app starts up.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handle action bar item clicks here. The action bar will
     * automatically handle clicks on the Home/Up button, so long
     * as you specify a parent activity in AndroidManifest.xml.
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // TODO: fill in these handlers, and hook them into the xml.
    public void decrementHandlerPlayer1ByFive(View view) {

    }

    public void decrementHandlerPlayer1ByOne(View view) {

    }

    public void incrementHandlerPlayer1ByOne(View view) {

    }

    public void decrementHandlerPlayer2ByFive(View view) {

    }

    public void decrementHandlerPlayer2ByOne(View view) {

    }

    public void incrementHandlerPlayer2ByOne(View view) {

    }

    /**
     * Increases the life total of a given player by a given amount.
     * @param player
     * @param increment
     */
    private void incrementLifeTotal(String player, int increment) {
        switch (player) {
            case PLAYER1: player_1_total += increment;
                          displayForPlayer(PLAYER1, player_1_total);
                          break;
            case PLAYER2: player_2_total += increment;
                          displayForPlayer(PLAYER2, player_2_total);
                          break;
            default:      throw new RuntimeException("No Player Specified.");

        }
    }


    /**
     * Decreases the life total of a given player by a given amount.
     * @param player
     * @param decrement
     */
    private void decrementLifeTotal(String player, int decrement) {
        switch (player) {
            case PLAYER1: player_1_total -= decrement;
                          displayForPlayer(PLAYER1, player_1_total);
                          break;
            case PLAYER2: player_2_total -= decrement;
                          displayForPlayer(PLAYER2, player_2_total);
                          break;
            default:      throw new RuntimeException("No Player Specified.");

        }
    }

    /**
     * Displays the given score for a given player.
     */
    private void displayForPlayer(String player, int score) {
        // get id for given player
        int resID = getResources().getIdentifier(player, "id", getPackageName());
        TextView scoreView = (TextView) findViewById(resID);
        scoreView.setText(String.valueOf(score));
    }
}
