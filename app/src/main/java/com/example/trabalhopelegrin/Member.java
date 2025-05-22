package com.example.trabalhopelegrin;

public class Member {
    private String name;
    private String role;
    private int image;

    public Member(String name, String role, int image) {
        this.name = name;
        this.role = role;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getImage() {
        return image;
    }
}