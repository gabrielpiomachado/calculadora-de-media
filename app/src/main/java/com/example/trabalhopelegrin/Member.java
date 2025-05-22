package com.example.trabalhopelegrin;

public class Member {
    private String name;
    private String ra;
    private int image;

    public Member(String name, String role, int image) {
        this.name = name;
        this.ra = role;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getRa() {
        return ra;
    }

    public int getImage() {
        return image;
    }
}