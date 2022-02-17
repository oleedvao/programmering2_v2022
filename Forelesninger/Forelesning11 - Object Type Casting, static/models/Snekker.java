package no.hiof.oleedvao.forelesning11.models;

public class Snekker extends Person {

    private int antallHusBygd;

    // Statiske variabeler som holder på informasjonen om hvor mange Snekker-objekter vi har opprettet i
    // programmet vårt, og hvor mange hus som har sammenlagt har blitt bygd av alle snekkerene våre.
    // Disse tilhører Snekker-klassen og vil ha samme verdi for alle Snekker-objekter.
    private static int totaltAntallSnekkere = 0;
    private static int totaltAntallHus = 0;

    public Snekker(String fornavn, String etternavn,
                   int alder, int antallHusBygd) {
        super(fornavn, etternavn, alder);

        this.antallHusBygd = antallHusBygd;

        // Øker det totale antallet snekkere med 1 hver gang konstruktøren kjører.
        // Altså hver gang vi oppretter et Snekker-objekt.
        // Denne konstruktøren vil også kjøre hver gang vi oppretter objekter av Snekker sine barneklasser (via kjeden
        // av super()-kall).
        totaltAntallSnekkere++;
        // Øker det totatle antallet hus bygd med hva vi sender med som parameter til konstruktøren.
        totaltAntallHus += antallHusBygd;
    }

    public Snekker(String fornavn, String etternavn,
                   int alder) {
        super(fornavn, etternavn, alder);

        antallHusBygd = 0;

        totaltAntallSnekkere++;
    }

    public static int getTotaltAntallSnekkere() {
        return totaltAntallSnekkere;
    }

    public static int getTotaltAntallHus() {
        return totaltAntallHus;
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
