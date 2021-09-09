package oop.inheritance;

public class Dentist extends Doctor {

    private int cc;

    public Dentist(String name, String surName, String education, String birthday, int years, int cc) {
        super(name, surName, education, birthday, years);
        this.cc = cc;
    }
}
