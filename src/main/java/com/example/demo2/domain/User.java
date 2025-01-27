package com.example.demo2.domain;

public class User {
    private String name;
    private String comment;

    public User(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

}
