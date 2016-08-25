package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * This app displays a fitness quiz.
 */
public class MainActivity extends AppCompatActivity {

    //Initial grade of the quiz, starts at 0.
    int startingGrade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     *
     * @param view
     */
    public void submit(View view) {
        EditText nameField = (EditText) findViewById(R.id.edit_text);
        String name = nameField.getText().toString();


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked question 1.
        switch (view.getId()) {
            case R.id.radio_button_true1:
                if (checked)
                    // Incorrect answer
                    break;
            case R.id.radio_button_false1:
                if (checked)
                    // Correct answer
                    break;
        }
        // Check which radio button was clicked question 2.
        switch (view.getId()) {
            case R.id.radio_button_true2:
                if (checked)
                    // Incorrect answer
                    break;
            case R.id.radio_button_false2:
                if (checked)
                    // Correct answer
                    break;
        }
        // Check which radio button was clicked question 3.
        switch (view.getId()) {
            case R.id.radio_button_true3:
                if (checked)
                    // Incorrect answer
                    break;
            case R.id.radio_button_false3:
                if (checked)
                    // Correct answer
                    break;
        }
        // Check which radio button was clicked question 4.
        switch (view.getId()) {
            case R.id.radio_button_true4:
                if (checked)
                    // Correct answer
                    break;
            case R.id.radio_button_false4:
                if (checked)
                    // Incorrect answer.
                    break;
        }

        // Check which radio button was clicked question 5.
        switch (view.getId()) {
            case R.id.radio_button_true5:
                if (checked)
                    // Incorrect answer
                    break;
            case R.id.radio_button_false5:
                if (checked)
                    // Correct answer
                    break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked for question 6 answers.
        switch (view.getId()) {
            //Incorrect
            case R.id.bench_press:
                if (checked){

                }

                break;
            //Correct
            case R.id.dead_lift:
                if (checked){

                }

                break;
            //Correct
            case R.id.t_bar_row:
                if (checked){

                }
                break;
            //Incorrect
            case R.id.squats:
                if (checked){

                }
                break;
            //Incorrect
            case R.id.hammer_curls:
                if (checked){

                }
                break;
            //Correct
            case R.id.cable_row:
                if (checked){

                }
                break;

        }
    }

    /**
     * Calculates the quiz answers.
     *
     * @param isTrue  whether user answered true.
     * @param isFalse whether user answered false.
     * @return grade of the quiz.
     */
    private int submitAnswer(String name, boolean isTrue, boolean isFalse) {

        return startingGrade;
    }

}
