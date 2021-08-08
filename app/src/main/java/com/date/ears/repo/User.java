package com.date.ears.repo;

public class User {

    String username;
    String password;
    String preferredName;
    String email;
    LOOKING_FOR preference;
    String dateOfBirth;
    String intro;

    public User(String username,
                String preferredName,
                String password,
                String email,
                LOOKING_FOR preference,
                String dateOfBirth,
                String intro) {
        this.username = username;
        this.preferredName = preferredName;
        this.password = password;
        this.email = email;
        this.preference = preference;
        this.dateOfBirth = dateOfBirth;
        this.intro = intro;
    }

    public enum LOOKING_FOR {
        MEN,
        WOMEN,
        BOTH,
        UNICORNS
    }
}
