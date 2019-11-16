package com.ismailbelmouh.scorekeeping;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the + button is clicked.
     */
    public void incrementA(View view) {
        scoreA++;
        displayA(scoreA);
    }

    public void incrementB(View view) {
        scoreB++;
        displayB(scoreB);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB_text_view);
        quantityTextView.setText("" + number);
    }


}