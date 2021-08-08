package com.date.ears;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String INTRO = "intro.specifier";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        if (username.getText().toString().equals("niko") && password.getText().toString().equals("niko")) {
            Intent potentialMatchIntent = new Intent(this, PotentialMatchActivity.class);
            potentialMatchIntent.putExtra(INTRO, "this is a potential match");
            startActivity(potentialMatchIntent);
        }
    }

    public void register(View view) {
        Intent registerIntent = new Intent(this, RegisterActivity.class);
        startActivity(registerIntent);
    }
}