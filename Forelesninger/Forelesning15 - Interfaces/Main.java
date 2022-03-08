package no.hiof.oleedvao.forelesning15;

import no.hiof.oleedvao.forelesning15.interfaces.Tegnbar;
import no.hiof.oleedvao.forelesning15.models.Figur;
import no.hiof.oleedvao.forelesning15.models.Rektangel;
import no.hiof.oleedvao.forelesning15.models.Sirkel;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Rektangel rektangel = new Rektangel("blå", 5,
                3);
        Sirkel sirkel = new Sirkel("rød", 4.5);

        // Oppretter en ArrayListe som er definert til å holde på instanser av datatypen Tegnbar (et interface).
        // Dette vil si at Listen kan bare holde på objekter som har implementert Tegnbar-interfacet.
        ArrayList<Tegnbar> tegnbareListe = new ArrayList<>();
        // Vi kan se at vi kan sette inn Rektangel- og Sirkel-objekter i denne listen ettersom disse klassene
        // implementerer Tegnbar-interfacet
        tegnbareListe.add(rektangel);
        tegnbareListe.add(sirkel);

        // Vi kan oså set at vi kan iterere gjennom de "tegnbare" objektene i listen ved bruk av polymorfi.
        for (Tegnbar tegnbar : tegnbareListe) {
            // Gjennom slike "interface-variabler" vil vi på en annen side bare å ha tilgang til de metodene
            // som er definerte i det spesifiserte interfacet (Tegnbar i dette tilfellet), samt de som tilhører
            // Object-klassen
            System.out.println(tegnbar.getTegning());
        }

        // Vi opretter en ny liste med Figur-objekter i en vilkårlig rekkefølge, som vi ønsker å sortere.
        ArrayList<Figur> figurer = new ArrayList<>();
        figurer.add(sirkel);
        figurer.add(rektangel);

        Sirkel sirkel2 = new Sirkel("gul", 6);
        figurer.add(sirkel2);

        // Skriver ut en beskrivelse av alle Figurene i listen for å kunne se at figurene nå ikke er sortert
        // basert på areal.
        System.out.println();
        for (Figur f : figurer) {
            System.out.println(f);
        }

        // Vi benytter den statiske metoden sort() fra klassen Collections, som følger med i Java, for å sortere
        // listen. Denne har som frutsetning at alle objektene i listen har implementert Comparable-interfacet.
        Collections.sort(figurer);

        // Vi skriver så ut alle Figur-objektene i listen etter vi har sortert den, og ser at disse er nå sortert
        // basert på areal
        System.out.println();
        for (Figur f : figurer) {
            System.out.println(f);
        }
    }
}
