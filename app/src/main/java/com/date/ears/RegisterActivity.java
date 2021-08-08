package com.date.ears;

import static com.date.ears.repo.User.LOOKING_FOR.BOTH;
import static com.date.ears.repo.User.LOOKING_FOR.MEN;
import static com.date.ears.repo.User.LOOKING_FOR.WOMEN;
import static com.date.ears.repo.User.LOOKING_FOR.UNICORNS;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.date.ears.repo.InMemoryUserRepository;
import com.date.ears.repo.User;
import com.date.ears.repo.User.LOOKING_FOR;

public class RegisterActivity extends AppCompatActivity {

    InMemoryUserRepository userRepo = new InMemoryUserRepository();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner preferencesSpinner = findViewById(R.id.preference);
        LOOKING_FOR[] preferences = {MEN, WOMEN, BOTH, UNICORNS};
        ArrayAdapter<LOOKING_FOR> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, preferences);
        preferencesSpinner.setAdapter(adapter);
    }

    public void completeRegistration() {
        EditText usernameView = findViewById(R.id.username);
        EditText preferredNameView = findViewById(R.id.preferredName);
        EditText passwordView = findViewById(R.id.password);
        EditText emailAddressView = findViewById(R.id.emailAddress);
        EditText dateOfBirthView = findViewById(R.id.dateOfBirth);
        EditText introView = findViewById(R.id.intro);
        Spinner preferenceView = findViewById(R.id.preference);

        User user = new User(usernameView.getText().toString(),
                preferredNameView.getText().toString(),
                passwordView.getText().toString(),
                emailAddressView.getText().toString(),
                WOMEN,
                dateOfBirthView.getText().toString(),
                introView.getText().toString());

        userRepo.save(user);
    }
}