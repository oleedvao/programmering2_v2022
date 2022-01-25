// Hvis vi benytter en pakke må dette være inkludert på dette formatet.
package no.hiof.oleedvao.forelesning05.models;

public class Student {

    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentId;
    private Kurs kurs;

    // Konstruktør for Student-klassen, som setter instansvariabler ved oprettelse av nye Student-objekter.
    // Krever at verdier for fornavn, etternavn, alder og studentId må spesifiseres ved
    // opprettelse av nye Student-objekter, basert på parameterene.
    // De verdiene som sendes med som parametere for et en gitt objekt-opprettelse vil gjelde for det spesifikke
    // objektet.
    public Student(String fornavn, String etternavn, int alder, String studentId) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
        this.studentId = studentId;
    }


    public void printBeskrivelse() {
        System.out.println("Hei. Jeg er en " + alder + " år gammel student med navn " +
                fornavn + " " + etternavn + ". Min studentid er " + studentId + ".");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        //minst 0. max 120
        if (alder < 0 || alder > 120) {
            System.out.println("Alder må være mellom 0 og 120.");
        }
        else {
            this.alder = alder;
        }
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
