package oop.inheritance;

public class Surgeon extends Doctor {

    private int sur;

    public Surgeon(String name, String surName, String education, String birthday, int years, int sur) {
        super(name, surName, education, birthday, years);
        this.sur = sur;
    }
}
