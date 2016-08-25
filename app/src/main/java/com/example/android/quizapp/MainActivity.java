package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * This app displays a fitness quiz.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit buttom is clicked.
     * @param view
     */
    public void submit(View view) {
        EditText nameField = (EditText) findViewById(R.id.edit_text);
        String name = nameField.getText().toString();
        /**
         * Checkbox if user answers true to question 1.
         */
        CheckBox trueCheckBox = (CheckBox) findViewById(R.id.checkbox_true1);
        boolean isTrue = trueCheckBox.isChecked();

        /**
         * Checkbox if user answers false to question 1. This is the correct answer.
         */
        CheckBox falseCheckBox = (CheckBox) findViewById(R.id.checkbox_false1);
        boolean isFalse = falseCheckBox.isChecked();


        //int answer = submitAnswer(isTrue, isFalse);
      //  String answerMessage = gradeQuizAnswers(name, answer, isFalse, isTrue);
    }


    /**
     *
     * Calculates the quiz answers.
     * @param isTrue whether user answered true.
     * @param isFalse whether user answered false.
     * @return grade of the quiz.
     */
    private int submitAnswer(boolean isTrue, boolean isFalse) {
        //Initial grade of the quiz, starts at 0.
        int startingGrade = 0;

        //Add 0 points if answered true to question 1.
        if (isTrue) {
            startingGrade = startingGrade + 0;
        }
        //Add 1 point if answered false to question 1.
        if (isFalse) {
            startingGrade = startingGrade + 1;
        }
    return startingGrade;
    }

}
