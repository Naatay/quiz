package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        showScore();
        showMessage();
    }

    /**
     * Shows score on the screen
     */
    public void showScore() {

        TextView score = (TextView) findViewById(R.id.final_score);
        score.setText(Integer.toString(getSum()) + "/6");
    }

    /**
     * Shows message which depends on the score
     */
    public void showMessage() {
        String message;
        if (getSum() > 2) {
            message = "Well done " + getName();
        } else {
            message = "Try again " + getName();
        }

        TextView msg = (TextView) findViewById(R.id.message);
        msg.setText(message);
    }

    /**
     * Puts you back to the first activity
     *
     * @param view
     */
    public void again(View view) {
        Intent changeActivity = new Intent(this, MainActivity.class);
        startActivity(changeActivity);
    }

    /**
     * Gets sum from activity_questions.xml
     *
     * @return
     */
    public int getSum() {
        Bundle e = getIntent().getExtras();
        return e.getInt("id_sum");
    }

    /**
     * Gets name typed in the activity_main.xml
     *
     * @return name of the current user
     */
    public String getName() {
        Bundle extras = getIntent().getExtras();
        return extras.getString("id_name");
    }
}
