package oop.inheritance;

public class Doctor extends Profession {

    public Diagnosis heal (Pacient pacient) {

        return pacient.getDiagnosis();
    }


}
