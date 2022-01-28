package no.hiof.oleedvao.forelesning06.models;

import java.util.ArrayList;

public class Student {

    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentId;
    private ArrayList<Kurs> kurs; // instansvariabel som er en ArrayList med Kurs-objekter

    public Student(String fornavn, String etternavn, int alder, String studentId) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
        this.studentId = studentId;

        kurs = new ArrayList<>(); // Initialiserer Kurs-listen ved opprettelse av et gitt objekt
    }

    // Metode som returnerer antall kurs registert for Student-objektet metoden kalles fra.
    public int getAntallKurs() {
        return kurs.size();
    }

    // Metode som legger til et Kurs-objekt i Kurs-listen
    public void leggTilKurs(Kurs kursObjekt) {
        kurs.add(kursObjekt);
    }

    // Metode som skriver ut kursnavnet for samtlige kurs registert for Student-objektet metoden kalles fra.
    public void printKursNavn() {
        for (Kurs xKurs : kurs) {
            System.out.println(xKurs.getKursNavn());
        }
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

    // Getter og setter metoder for Kurs-listen.
    // Disse er kommentert bort fordi de tillater full kontroll over listen fra utsiden av klassen.
    // Dette ønsker vi ikke basert på innkapslingsprinsippet.
    /*
    public ArrayList<Kurs> getKurs() {
        return kurs;
    }

    public void setKurs(ArrayList<Kurs> kurs) {
        this.kurs = kurs;
    }
     */
}
