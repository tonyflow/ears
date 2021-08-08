package com.date.ears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PotentialMatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potential_match);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.INTRO);

        TextView introText = findViewById(R.id.potentialMatchIntro);
        introText.setText(message);

    }
}