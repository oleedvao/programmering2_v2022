package no.hiof.oleedvao.forelesning11.models;

public class Person {

    protected String fornavn;
    protected String etternavn;
    protected int alder;

    // En statisk variabel som representerer det totale antall Person-objekter som er opprettet i programmert vårt.
    // Denne tilhører Person-klassen og vil ha samme verdi for alle Person-objekter.
    private static int totaltAntallPersoner = 0;

    public Person(String fornavn, String etternavn, int alder) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;

        // Øker det totale antalle personer med 1 hver gang konstruktøren kjører.
        // Altså hver gang vi oppretter et Person-objekt.
        // Denne konstruktøren vil også kjøre hver gang vi oppretter objekter av Person sine barneklasser (via kjeden
        // av super()-kall).
        totaltAntallPersoner++;
    }

    public static int getTotaltAntallPersoner() {
        return totaltAntallPersoner;
    }


    public void sammenlignAlderMedPerson(Person person) {
        if (this.alder > person.getAlder()) {
            System.out.println(fornavn + " " +
                    etternavn + " er eldre.");
        } else if (person.getAlder() > this.alder) {
            System.out.println(person.getFornavn() + " " +
                    person.getEtternavn() + " er eldre.");
        } else {
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
