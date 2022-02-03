package no.hiof.oleedvao.forelesning08.models;

// Klasse som representerer snekker lærlinger.
// Arver egenskaper direkte fra Snekker, men også indirekte de fra Person-klassen
// ettersom Snekker arver fra Person
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

    public String getOpplaerlingsperiode() {
        return opplaerlingsperiode;
    }

    public void setOpplaerlingsperiode(String opplaerlingsperiode) {
        this.opplaerlingsperiode = opplaerlingsperiode;
    }
}
