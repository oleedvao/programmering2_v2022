package no.hiof.oleedvao.forelesning10.models;

public class Snekker extends Person {


    private int antallHusBygd;

    public Snekker(String fornavn, String etternavn,
                   int alder, int antallHusBygd) {
        super(fornavn, etternavn, alder);

        this.antallHusBygd = antallHusBygd;
    }

    // Alternativ konstruktør definert ved bruk av Overloading (forskjellige antall parametere eller rekkefølgen
    // av parameterenes datatyper). Vi setter bare fornavn, etternavn og alder via parametere, mens
    // antallHusBygd blir satt til en default verdi.
    public Snekker(String fornavn, String etternavn,
                   int alder) {
        super(fornavn, etternavn, alder);

        antallHusBygd = 0;
    }

    @Override
    public String toString(){
        return "Hei. Jeg heter " + fornavn + " " +
                etternavn + " og er " + alder +
                " år gammel. Jeg har bygd " +
                antallHusBygd + " hus.";
    }

    public int getAntallHusBygd() {
        return antallHusBygd;
    }

    public void setAntallHusBygd(int antallHusBygd) {

        this.antallHusBygd = antallHusBygd;
    }

}
