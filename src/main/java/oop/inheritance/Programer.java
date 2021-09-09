package oop.inheritance;

public class Programer extends Engineer {

    private String lang;

    public Programer(String name, String surName, String education, String birthday, String work, String lang ) {
        super(name, surName, education, birthday, work);
        this.lang = lang;
    }
}
