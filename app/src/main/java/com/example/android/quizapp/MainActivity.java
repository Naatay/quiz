package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Changes acttivity and passes name typed by user
     */
    public void changeScene(View view){

        Intent changeActivity = new Intent(this, Questions.class);
        EditText name_id = (EditText) findViewById(R.id.name);
        String name = name_id.getText().toString();

        if(remainder(name)) {
            changeActivity.putExtra("identifier", name);
            startActivity(changeActivity);
        }
    }


    /**
     * Checks if somone typed a name
     *
     * @param name typed by user
     * @return false if EditText is empty
     */
    public boolean remainder(String name){

        boolean x = true;
        if(name.equals("")){
            x = false;
            Toast.makeText(getApplicationContext(), "Insert your name", Toast.LENGTH_SHORT).show();
        }
        return x;
    }
}
