package com.example.user.ocr;

/**
 * Created by user on 2/26/2016.
 */
public class User {
    String name, username, password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;

    }

    public User(String username, String password) {
        this.name = "";
        this.username = username;
        this.password = password;

    }
}
