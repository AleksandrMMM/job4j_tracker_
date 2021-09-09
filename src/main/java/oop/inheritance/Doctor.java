package oop.inheritance;

public class Doctor extends Profession {

    protected int years;
    public Doctor(String name, String surName, String education, String birthday, int years) {
        super(name, surName, education, birthday);
        this.years = years;
    }

    public Diagnosis heal (Pacient pacient) {

        return pacient.getDiagnosis();
    }


}
