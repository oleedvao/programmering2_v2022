package no.hiof.oleedvao.forelesning11.models;

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


    public Snekkerlaerling(String fornavn,
                           String etternavn,
                           int alder,
                           int antallHusBygd) {
        super(fornavn, etternavn, alder, antallHusBygd);

        opplaerlingsperiode = "1 år";
    }

    public Snekkerlaerling(String fornavn,
                           String etternavn,
                           int alder) {
        super(fornavn, etternavn, alder);

        opplaerlingsperiode = "1 år";
    }

    @Override
    public String toString() {
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
