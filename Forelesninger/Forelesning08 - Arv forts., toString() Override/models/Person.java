package no.hiof.oleedvao.forelesning08.models;

public class Person {

    private String fornavn;
    private String etternavn;
    private int alder;

    public Person(String fornavn, String etternavn, int alder) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
    }

    // Metode som returnerer en tekstlig beskrivelse av et objekt. Orginalt definert i Objekt-klassen,
    // som alle Klasser "usynlig" arver fra.
    // Overstyres ved å definere metoden med samme return-type og navn (som kontrolleres at stemmer ved bruk av
    // @Override-nøkkelordet)
    // Overstyringen vil sørge for at alle person-objekter og objekter av klasser som direkte eller indirekte
    // arver fra Person.
    @Override
    public String toString(){
        return "Hei. Jeg heter " + fornavn + " " + etternavn +
                " og er " + alder + " år gammel.";
    }

    // Metode som returnerer en tekstlig beskrivelse av et objekt.
    // (I overordnet beskrivelse er den redundant i forhold til toString())
    /*
    public String getBeskrivelse() {
        return "Hei. Jeg heter " + fornavn + " " + etternavn +
                " og er " + alder + " år gammel.";
    }
     */

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
