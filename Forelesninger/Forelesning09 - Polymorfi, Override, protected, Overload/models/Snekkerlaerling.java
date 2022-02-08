package no.hiof.oleedvao.forelesning09.models;

public class Snekkerlaerling extends Snekker {

    private String opplaerlingsperiode;

    public Snekkerlaerling(String fornavn,
                           String etternavn,
                           int alder,
                           int antallHusBygd,
                           String opplaerlingsperiode) {
        super(fornavn, etternavn, alder, antallHusBygd);

        this.opplaerlingsperiode = opplaerlingsperiode;
    }

    // Overrider toString()-metoden, som før ble overridet i Snekker-klassen,
    // slik at den returnerer ut en litt mer beskrivende tekst spesifikt for
    // Bussjafor-objekter
    // Husk at keybinden Ctrl + o kan benyttes for å generere en override for en gitt arvet-metode
    @Override
    public String toString() {
        // Benytter super.toString() for gjenbruke teksten som returneres av toString()-implementasjonen
        // i Snekker-klassen.
        return super.toString() + " Min opplæringsperiode er på "+
                opplaerlingsperiode;
    }

    public String getOpplaerlingsperiode() {
        return opplaerlingsperiode;
    }

    public void setOpplaerlingsperiode(String opplaerlingsperiode) {
        this.opplaerlingsperiode = opplaerlingsperiode;
    }
}
