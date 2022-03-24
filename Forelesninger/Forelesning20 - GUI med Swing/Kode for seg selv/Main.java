package no.hiof.oleedvao.forelesning20;

import no.hiof.oleedvao.forelesning20.forms.MoonWeightGUI;

public class Main {
    public static void main(String[] args) {
        // For å synliggjøre et GUI-vindu må vi opprette et objekt av den relevante GUI-vindu-klassen.
        // Vi oppretter en instanse av MoonWeightGUI og setter vinduets tittel til å være "Moon Weight".
        MoonWeightGUI moonWeightGUI = new MoonWeightGUI("Moon Weight");
        // Vi kaller så .setVisible(true) på dette vindu-objektet for å gjøre det synlig når vi kjører koden.
        moonWeightGUI.setVisible(true);
    }
}
