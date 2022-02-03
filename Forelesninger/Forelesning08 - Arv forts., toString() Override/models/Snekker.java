package no.hiof.oleedvao.forelesning08.models;

// Klasse som representerer snekkere. Arver fra Person-klassen
public class Snekker extends Person {


    private int antallHusBygd;

    public Snekker(String fornavn, String etternavn,
                   int alder, int antallHusBygd) {
        super(fornavn, etternavn, alder);

        this.antallHusBygd = antallHusBygd;
    }

    public int getAntallHusBygd() {
        return antallHusBygd;
    }

    public void setAntallHusBygd(int antallHusBygd) {

        this.antallHusBygd = antallHusBygd;
    }
}
