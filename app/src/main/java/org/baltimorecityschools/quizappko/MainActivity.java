package org.baltimorecityschools.quizappko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

// 1. Declare all variables
    Button aBTN, bBTN, submitBTN, nextBTN;
    TextView questionTV;
    //Question
    Question q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
    Question currentQuestion;
    int questionNumber;
    Question[] qBank;
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. initialize variables & inflate UI elements
        aBTN = findViewById(R.id.ABTN);
        bBTN = findViewById(R.id.BBTN);
        submitBTN = findViewById(R.id.SubmitBTN);
        nextBTN = findViewById(R.id.nextBTN);
        questionTV = findViewById(R.id.QuestionTV);
        score = 0;

        q1 = new Question("What year the first NFS (Need For Speed) was released?","1994", "1992","1994");
        q2 = new Question("What was the most selling Need For Speed?","Need For Speed Most Wanted (2005)", "Need For Speed Most Heat", "Need For Speed Most Wanted (2005)");
        q3 = new Question("In what year was the first game released and for which revolutionary console was it originally designed??","1994 on the 3DO Interactive Multiplayer", "1996 on the Sony PlayStation", "1994 on the 3DO Interactive Multiplayer");
        q4 = new Question("Which iconic NFS entry features the main antagonist Razor?","Need for Speed: Most Wanted (2005Q" +
                ")", "Need for Speed: Most Wanted (2005)", "Need for Speed: (2012)");
        q5 = new Question("What exact car model is the legendary hero car from Need for Speed: Most Wanted featuring the silver and blue livery?","BMW M3 GTR (E46)", "BMW M3 GTR (E46)","Nissan Skyline GT-R R34");
        q6 = new Question("What is the name of the fictional city inspired by Los Angeles where Need for Speed: Underground 2 takes place?","Bayview", "Bayview","Fair Haven");
        q7 = new Question("What innovative customization feature was introduced in Need for Speed: Carbon that allowed players to morph and reshape body parts?","Autosculpt", "Autosculpt","ProTuner");
        q8 = new Question("Which famous actor, known for his role in Breaking Bad, starred in the 2014 Need for Speed movie?","Aaron Paul", "Paul Walker","Aaron Paul");
        q9 = new Question("Which developer, famous for the Burnout series, took over the franchise to create NFS: Hot Pursuit (2010)?","Criterion Games", "Criterion Games","Ghost Games");
        q10 = new Question("How does the high-stakes mechanic differ between daytime and nighttime racing in Need for Speed: Heat?","Day earns Bank (cash) for upgrades, while Night earns Rep to unlock them under aggressive police presence", "Day is strictly drag racing, while Night is only drift events","Day earns Bank (cash) for upgrades, while Night earns Rep to unlock them under aggressive police presence");

        qBank = new Question[]{q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};
        questionNumber = 0;
        currentQuestion = qBank[questionNumber];
        questionTV.setText(currentQuestion.getqPrompt());

        // 3. Do stuff
        // 3a. When the user clicks button A
        aBTN.setOnClickListener(v -> {
            String userAnswer = aBTN.getText().toString();
            if(userAnswer.equals(currentQuestion.isCorrectAns())){
                String message = "You are right!";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                score = score + 1;

            } else {
                String message = "You are wrong!";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

            }

        });

        // When the user clicks button B
        bBTN.setOnClickListener(v -> {
            String userAnswer = bBTN.getText().toString();
            if(userAnswer.equals(currentQuestion.isCorrectAns())){
                String message = "You are right!";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                score = score + 1;

            } else {
                String message = "You are wrong!";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

            }

        });

        // Goes to the next question when nextBTN is clicked
        nextBTN.setOnClickListener(v -> {
            if (questionNumber < qBank.length - 1) {
                questionNumber++;
                currentQuestion = qBank[questionNumber];
                questionTV.setText(currentQuestion.getqPrompt());
                aBTN.setText(currentQuestion.getChoiceA());
                bBTN.setText(currentQuestion.getChoiceB());
            } else {
                Toast.makeText(MainActivity.this, "This is the last question!", Toast.LENGTH_SHORT).show();
            }
        });

        submitBTN.setOnClickListener(v -> {
            Intent goToScoreIntent = new Intent(MainActivity.this, ScoreActivity.class);
            goToScoreIntent.putExtra("score", score);
            startActivity(goToScoreIntent);
        });

    }
}
