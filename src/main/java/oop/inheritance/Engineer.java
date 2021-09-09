package oop.inheritance;

public class Engineer extends Profession {

    protected String work;

    public Engineer(String name, String surName, String education, String birthday, String work) {
        super(name, surName, education, birthday);
        this.work = work;
    }
}
