package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app displays a fitness quiz.
 */
public class MainActivity extends AppCompatActivity {

    int startingGrade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();


        // Check which radio button was clicked question 1.
        switch (view.getId()) {
            case R.id.radio_button_true1:
                if (checked) {

                }
                // Incorrect answer
                break;
            case R.id.radio_button_false1:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
                // Correct answer
                break;
        }
        // Check which radio button was clicked question 2.
        switch (view.getId()) {
            case R.id.radio_button_true2:
                if (checked) {

                }
                // Incorrect answer
                break;
            case R.id.radio_button_false2:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
                // Correct answer
                break;
        }
        // Check which radio button was clicked question 3.
        switch (view.getId()) {
            case R.id.radio_button_true3:
                if (checked) {

                }
                // Incorrect answer
                break;
            case R.id.radio_button_false3:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
                // Correct answer
                break;
        }
        // Check which radio button was clicked question 4.
        switch (view.getId()) {
            case R.id.radio_button_true4:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
                // Correct answer
                break;
            case R.id.radio_button_false4:
                if (checked) {

                }
                // Incorrect answer.
                break;
        }

        // Check which radio button was clicked question 5.
        switch (view.getId()) {
            case R.id.radio_button_true5:
                if (checked) {

                }
                // Incorrect answer
                break;
            case R.id.radio_button_false5:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
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
                if (checked) {

                }
                break;
            //Correct
            case R.id.dead_lift:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
                break;
            //Correct
            case R.id.t_bar_row:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
                break;
            //Incorrect
            case R.id.squats:
                if (checked) {

                }
                break;
            //Incorrect
            case R.id.hammer_curls:
                if (checked) {

                }
                break;
            //Correct
            case R.id.cable_row:
                if (checked) {
                    startingGrade = startingGrade + 1;
                }
                break;

        }
    }


    /**
     * This method is called when the submit button is clicked.
     *
     * @param view
     */
    public void submit(View view) {
        EditText nameField = (EditText) findViewById(R.id.edit_text);
        String name = nameField.getText().toString();

        RadioButton radioButtonFalse = (RadioButton) findViewById(R.id.radio_button_false1);
        boolean isFalse = radioButtonFalse.isChecked();

        RadioButton radioButtonFalse2 = (RadioButton) findViewById(R.id.radio_button_false2);
        boolean isFalse2 = radioButtonFalse2.isChecked();

        RadioButton radioButtonFalse3 = (RadioButton) findViewById(R.id.radio_button_false3);
        boolean isFalse3 = radioButtonFalse3.isChecked();

        RadioButton radioButtonTrue4 = (RadioButton) findViewById(R.id.radio_button_true4);
        boolean isTrue4 = radioButtonTrue4.isChecked();

        RadioButton radioButtonFalse5 = (RadioButton) findViewById(R.id.radio_button_false5);
        boolean isFalse5 = radioButtonFalse5.isChecked();

        CheckBox deadLiftCheckbox = (CheckBox) findViewById(R.id.dead_lift);
        boolean isTrue6 = deadLiftCheckbox.isChecked();

        CheckBox tBarRowCheckbox = (CheckBox) findViewById(R.id.t_bar_row);
        boolean isTrue7 = tBarRowCheckbox.isChecked();

        CheckBox cableRowCheckbox = (CheckBox) findViewById(R.id.cable_row);
        boolean isTrue8 = cableRowCheckbox.isChecked();


    }

    /**
     * This is to calculate the score.
     */
    int grade = calculateScore(isFalse, isFalse2, isFalse3, isTrue4, isFalse5, isTrue6, isTrue7, isTrue8);
    String gradeMessage = createGradeSummary(edit_text, grade);

    private int calculateScore(boolean isTrue, boolean isFalse, boolean checked) {
        return startingGrade;
    }

    /**
     * This is to display the score with users name as a toast.
     * @param name
     * @param startingGrade
     * @return
     */
    private String createGradeSummary(String name, int startingGrade) {
        String scoreMessage = getString(R.string.edit_text);
        gradeMessage = getString(R.string.starting_grade);
        return scoreMessage;

        if (scoreMessage == scoreMessage){
            Toast.makeText(this, "Your total score is " getString(R.string.starting_grade)  "out of 8!", Toast.LENGTH_LONG).show();
        }
    }

}
