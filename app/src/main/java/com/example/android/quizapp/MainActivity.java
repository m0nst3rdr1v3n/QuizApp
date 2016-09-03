package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void submit(View view) {

        int totalScore = calculateScore();


        // Display a toast message when user submit answers
        Toast.makeText(this, "You have a total of: " + totalScore + " out of 7 CORRECT!", Toast.LENGTH_SHORT).show();

        // Run method to reset score
        resetScore();

    }

    private int calculateScore() {

        RadioGroup questionGroupOne = (RadioGroup) findViewById(R.id.radio_group_1);
        int questionOne = questionGroupOne.getCheckedRadioButtonId();

        if (questionOne == R.id.radio_button_false1) {
            score = score + 1;
        }
        RadioGroup questionGroupTwo = (RadioGroup) findViewById(R.id.radio_group_2);
        int questionTwo = questionGroupTwo.getCheckedRadioButtonId();

        if (questionTwo == R.id.radio_button_false2) {
            score = score + 1;
        }

        RadioGroup questionGroupThree = (RadioGroup) findViewById(R.id.radio_group_3);
        int questionThree = questionGroupThree.getCheckedRadioButtonId();

        if (questionThree == R.id.radio_button_false3) {
            score = score + 1;
        }

        RadioGroup questionGroupFour = (RadioGroup) findViewById(R.id.radio_group_4);
        int questionFour = questionGroupFour.getCheckedRadioButtonId();

        if (questionFour == R.id.radio_button_true4) {
            score = score + 1;
        }
        RadioGroup questionGroupFive = (RadioGroup) findViewById(R.id.radio_group_5);
        int questionFive = questionGroupFive.getCheckedRadioButtonId();

        if (questionFive == R.id.radio_button_false5) {
            score = score + 1;
        }

        /**
         * Checkbox answer question 6.
         */


        CheckBox tBarRowChecked = (CheckBox) findViewById(R.id.t_bar_row);
        boolean hastBarRowChecked = tBarRowChecked.isChecked();

        CheckBox deadLiftChecked = (CheckBox) findViewById(R.id.dead_lift);
        boolean hasDeadLiftChecked = deadLiftChecked.isChecked();

        CheckBox cableRowChecked = (CheckBox) findViewById(R.id.cable_row);
        boolean hasCableRowChecked = cableRowChecked.isChecked();

        CheckBox squatsChecked = (CheckBox) findViewById(R.id.squats);
        boolean hasSquatsChecked = squatsChecked.isChecked();

        CheckBox hammerCurlsChecked = (CheckBox) findViewById(R.id.hammer_curls);
        boolean hasHammerCurlsChecked = hammerCurlsChecked.isChecked();

        CheckBox benchPressChecked = (CheckBox) findViewById(R.id.bench_press);
        boolean hasBenchPressChecked = benchPressChecked.isChecked();


        if (deadLiftChecked.isChecked() && tBarRowChecked.isChecked() && cableRowChecked.isChecked() && !benchPressChecked.isChecked() && !hammerCurlsChecked.isChecked() && !squatsChecked.isChecked()) {
            score = score + 1;
        }


        EditText textField = (EditText) findViewById(R.id.answer_edit_text);
        String answerText = textField.getText().toString();

        // Question with EditText question 7
        if (answerText.equalsIgnoreCase("False")) {
            score = score + 1;
        }

        return score;
    }

    /**
     * Set score back to 0
     */
    private void resetScore() {

        score = 0;
    }


}