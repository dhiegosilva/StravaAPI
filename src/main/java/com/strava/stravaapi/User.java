package com.strava.stravaapi;

import lombok.Getter;

@Getter
public class User {
    // Getters and Setters
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
