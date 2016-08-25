package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
     * @param view
     */
    public void submit(View view) {
        EditText nameField = (EditText) findViewById(R.id.edit_text);
        String name = nameField.getText().toString();


    }

    public void onRadioButtonClicked(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_button_true1:
                if (checked)
                    // Incorrect answer
                    break;
            case R.id.radio_button_false1:
                if (checked)
                    // Correct answer
                    break;
        }
    }

    /**
     *
     * Calculates the quiz answers.
     * @param isTrue whether user answered true.
     * @param isFalse whether user answered false.
     * @return grade of the quiz.
     */
    private int submitAnswer(String name, boolean isTrue, boolean isFalse) {

        return startingGrade;
    }

}
