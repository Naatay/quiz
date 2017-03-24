package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class Questions extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    /**
     * Sums number of corrects answers
     */
    public int sumPoints(View view) {

        int sum = 0;

        RadioButton answerFromQuestion1 = (RadioButton) findViewById(R.id.answer_q1);
        RadioButton answerFromQuestion2 = (RadioButton) findViewById(R.id.answer_q2);
        RadioButton answerFromQuestion3 = (RadioButton) findViewById(R.id.answer_q3);
        RadioButton answerFromQuestion4 = (RadioButton) findViewById(R.id.answer_q4);
        RadioButton answerFromQuestion5 = (RadioButton) findViewById(R.id.answer_q5);

        if (answerFromQuestion1.isChecked()) {
            sum++;
        }
        if (answerFromQuestion2.isChecked()) {
            sum++;
        }
        if (answerFromQuestion3.isChecked()) {
            sum++;
        }
        if (answerFromQuestion4.isChecked()) {
            sum++;
        }
        if (answerFromQuestion5.isChecked()) {
            sum++;
        }

        return sum;
    }

    /**
     * Changes activity and passes score
     *
     * @param view
     */
    public void changeSceneq(View view) {

        Bundle extras = getIntent().getExtras();
        Intent changeActivity = new Intent(this, Score.class);
        changeActivity.putExtra("id_sum", sumPoints(view));
        changeActivity.putExtra("id_name", extras.getString("identifier"));
        startActivity(changeActivity);

    }

}
