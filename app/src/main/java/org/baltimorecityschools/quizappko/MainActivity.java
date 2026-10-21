package org.baltimorecityschools.quizappko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

// 1. Declare all variables
    Button aBTN, bBTN, submitBTN, nextBTN;
    TextView questionTV;
    //Question
    Question q1, q2;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. initialize variables & inflate UI elements
        aBTN = (Button) findViewById(R.id.ABTN);
        bBTN = (Button) findViewById(R.id.BBTN);
        submitBTN = (Button) findViewById(R.id.SubmitBTN);
        nextBTN= (Button) findViewById(R.id.nextBTN) ;
        questionTV = (TextView) findViewById(R.id.QuestionTV);
        score = 0;

        q1 = new Question("What year the first NFS (Need For Speed) was released?","1994");
        q2 = new Question("What was the most selling Need For Speed?","Need For Speed Most Wanted (2005)");

        // 3. Do stuff
        // 3a. When the user clicks the TRUE button,
        aBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3b. A popup should appear telling them they are wrong.
                String messange = "You are wrong!";
                int duration = Toast.LENGTH_LONG;
                Toast incorrectToast = Toast.makeText(MainActivity.this, messange, duration);
                incorrectToast.show();
            }
        });


        bBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3b. A popup should appear telling them they are wrong.
                String messange = "You are right!";
                int duration = Toast.LENGTH_LONG;
                Toast correctToast = Toast.makeText(MainActivity.this, messange, duration);
                correctToast.show();
                score = score + 1;
            }
        });

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Goes to the next question.


            }
        });

        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToScoreIntent = new Intent(MainActivity.this, ScoreActivity.class);
                goToScoreIntent.putExtra("score", score);
                startActivity(goToScoreIntent);


            }
        });

    }
}