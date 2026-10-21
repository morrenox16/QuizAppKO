package org.baltimorecityschools.quizappko;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScoreActivity extends AppCompatActivity {

    int score;
    String scoreMessage;
    TextView scoreTV;
    Intent incomingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scoreTV = (TextView) findViewById(R.id.scoreTV);
        score = 0;

        incomingIntent = getIntent();
        score = incomingIntent.getIntExtra("score", 0);
        scoreMessage = "SCORE: " + score;

        scoreTV.setText(scoreMessage);

    }
}