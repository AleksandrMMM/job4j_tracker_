package oop.inheritance;

public class Pacient {

    private Diagnosis diagnosis;

    public Pacient(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }
}
