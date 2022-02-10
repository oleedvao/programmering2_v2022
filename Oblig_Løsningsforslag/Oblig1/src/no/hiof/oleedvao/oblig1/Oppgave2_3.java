package no.hiof.oleedvao.oblig1;

import no.hiof.oleedvao.oblig1.models.Planet;

public class Oppgave2_3 {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 3889, 6.36E23);
        Planet planet2 = new Planet("Jupiter", 69911, 1.898E27);

        /* Skriver ut direkte basert på get og set metoder
        System.out.println("Planeten " + planet.getName() + " har en radius på " +
                planet.getRadius() + " km og en masse på " + planet.getMass());

        System.out.println("Planeten " + planet2.getName() + " har en radius på " +
                planet2.getRadius() + " km og en masse på " + planet2.getMass());

         */

        // Skriver ut
        planet.printDescription();
        planet2.printDescription();
    }
}
