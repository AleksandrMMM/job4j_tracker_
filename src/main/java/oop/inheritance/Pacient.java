package oop.inheritance;

public class Pacient extends Profession {

    private Diagnosis diagnosis;

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }
}
