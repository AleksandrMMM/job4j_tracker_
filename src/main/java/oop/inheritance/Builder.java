package oop.inheritance;

public class Builder extends Engineer {

    private int countOld;

    public Builder(String name, String surName, String education, String birthday, String work, int countOld) {
        super(name, surName, education, birthday, work);
        this.countOld = countOld;
    }
}
