package no.hiof.oleedvao.forelesning09.models;

public class Snekker extends Person {


    private int antallHusBygd;

    public Snekker(String fornavn, String etternavn,
                   int alder, int antallHusBygd) {
        super(fornavn, etternavn, alder);

        this.antallHusBygd = antallHusBygd;
    }

    // Overrider toString()-metoden, som før ble overridet i Person-klassen,
    // slik at den returnerer ut en litt mer beskrivende tekst spesifikt for
    // Bussjafor-objekter
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
