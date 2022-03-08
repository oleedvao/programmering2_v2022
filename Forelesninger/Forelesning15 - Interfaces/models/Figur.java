package no.hiof.oleedvao.forelesning15.models;

import no.hiof.oleedvao.forelesning15.interfaces.Tegnbar;

// Klasse som implementerer to interfaces, Tegnbar (som vi har definert selv) og Comparable (som følger med i Java).
// Dette medfører at vi må implementere de abstrakte metodene fra begge interfacene.
// Ettersom at Figur er abstrakt, er vi på en annen side ikke tvunget til å implementere disse metodene direkte i
// denne klassen, men vil vil være det i alle ikke-abstrakte metoder som arver fra Figur.
// Merk også at Comparable krever at vi spesifiserer hva vi skal sammenligne med (i dette tilfellet andre
// Figur-objekter)
public abstract class Figur implements Tegnbar, Comparable<Figur> {

    private String farge;

    public Figur(String farge) {
        this.farge = farge;
    }

    public abstract double omkrets();

    public abstract double areal();

    // Definerer kodekropp for compareTo() metoden i henhold til implementasjonen av Comparable.
    // Merk at siden Comparable er implementert til å gjelde andre Figur-objekter er parameteren til
    // compareTo() av datatypen Figur.
    @Override
    public int compareTo(Figur o) {

        // Manuell og typisk implementasjon av compareTo()-metoden
        // I dette tilfellet ønsker vi å sammenligne Figur-objektene basert på areal.
        if (this.areal() < o.areal()) {
            // Hvis vi ønsker ascending sortering, returnerer vi her -1 (eller et annet negativt tall).
            // Hvis vi ønsker descending sortering, returnerer vi her 1 (eller et annet positivt tall)
            return -1;
        }
        else if (this.areal() > o.areal()) {
            // Hvis vi ønsker ascending sortering, returnerer vi her 1 (eller et annet positivt tall)
            // Hvis vi ønsker descending sortering, returnerer vi her -1 (eller et annet negativt tall)
            return 1;
        }
        else {
            // Hvis objektene er like "store" returnerer vi 0.
            return 0;
        }

        // Alternativ og smidigere måte å definere samme logikk (predefinert metode) som over.
        // Rekkefølgen av parameterene bestemmer om sorteringen blir gjort "ascending" eller "descending":
            // this først -> ascending
            // this sist -> descending
        //return Double.compare(this.areal(), o.areal());

    }

    @Override
    public String toString() {
        return "Figuren er " + farge + ", har en omkrets på " +
                omkrets() + " og et areal på " + areal() + ".";
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }
}
