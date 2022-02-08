package no.hiof.oleedvao.forelesning09.models;

public class Person {

    protected String fornavn;
    protected String etternavn;
    protected int alder;

    public Person(String fornavn, String etternavn, int alder) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
    }

    // Overrider toString()-metoden, som er arvet fra Object-klassen,
    // slik at den returnerer ut en mer tilpasset beskrivelse for Person-objekter.
    @Override
    public String toString() {
        return "Hei. Jeg heter " + fornavn + " " +
                etternavn + " og er " + alder + " år gammel.";
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
        this.alder = alder;
    }
}
