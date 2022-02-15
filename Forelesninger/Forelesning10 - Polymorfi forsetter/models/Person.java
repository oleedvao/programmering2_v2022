package no.hiof.oleedvao.forelesning10.models;

public class Person {

    protected String fornavn;
    protected String etternavn;
    protected int alder;

    public Person(String fornavn, String etternavn, int alder) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
    }

    // Metode som tillatter oss å sammenligne et gitt Person-objekt (eller objekter av barneklasser)
    // med et annet Person-objekt (objekter av barneklasser tilfredstiller også dette kravet)
    public void sammenlignAlderMedPerson(Person person) {
        if(this.alder > person.getAlder()) { // Hvis den gjeldende personen er eldst. Skriv ut dens navn.
            System.out.println(fornavn + " " +
                    etternavn + " er eldre.");
        }
        else if (person.getAlder() > this.alder) { // Hvis den sammenlignede personen er eldst. Skriv ut dens navn.
            System.out.println(person.getFornavn() + " " +
                    person.getEtternavn() + " er eldre.");
        }
        else { // Hvis personene er like gamle. Skriv ut en passende melding.
            System.out.println("Personene er like gamle.");
        }
    }

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
