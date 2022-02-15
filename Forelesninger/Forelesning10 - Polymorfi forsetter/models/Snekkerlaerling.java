package no.hiof.oleedvao.forelesning10.models;

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

    // Alternativ konstruktør definert ved bruk av Overloading (forskjellige antall parametere eller rekkefølgen
    // av parameterenes datatyper). Vi setter bare fornavn, etternavn, alder og antallHusBygd via parametere, mens
    // opplaeringsperiode blir satt til en default verdi.
    public Snekkerlaerling(String fornavn,
                           String etternavn,
                           int alder,
                           int antallHusBygd) {
        super(fornavn, etternavn, alder, antallHusBygd);

        opplaerlingsperiode = "1 år";
    }

    // Alternativ konstruktør definert ved bruk av Overloading (forskjellige antall parametere eller rekkefølgen
    // av parameterenes datatyper). Vi setter bare fornavn, etternavn og alder via parametere, mens
    // antallHusBygd og opplaeringsperiode blir satt til default verdier.
    public Snekkerlaerling(String fornavn,
                           String etternavn,
                           int alder) {
        // Kaller konstuktøren i super-klassen (Snekker) med tilsvarande parametere.
        // Denne setter fornavn, etternavn og alder basert på parametere, men setter antallHusBygd til en defaultverdi.
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
