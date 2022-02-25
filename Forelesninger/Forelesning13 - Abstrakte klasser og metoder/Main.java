package no.hiof.oleedvao.forelesning13figurer;

import no.hiof.oleedvao.forelesning13figurer.models.Figur;
import no.hiof.oleedvao.forelesning13figurer.models.Rektangel;
import no.hiof.oleedvao.forelesning13figurer.models.Sirkel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Oppretter en rekke med "figurer"
        // Vi hår lov opprette objekter av klassene som arver fra Figur-klassen, men ikke objekter av
        // Figur-klassen direkte, siden denne klassen er abstrakt.
        //Figur figur = new Figur("rød");
        Rektangel rektangel1 = new Rektangel("rød",
                4, 2);
        Sirkel sirkel1 = new Sirkel("blå", 7.3);
        Rektangel rektangel2 = new Rektangel("gul", 6.2,
                1.5);

        // Oppretter en liste som skal holde på Figur-objekter. Dette er tillatt ettersom vi ikke oppretter
        // noe objekt av Figur-klassen.
        // Vi kan legge til objekter av klasser som arver fra Figur i denne listen.
        // Med andre ord: Polymorfi er fremdeles fult mulig med abstrakte klasser.
        ArrayList<Figur> figurListe = new ArrayList<>();
        figurListe.add(rektangel1);
        figurListe.add(sirkel1);
        figurListe.add(rektangel2);

        // Skriver ut en beskrivelse for alle figurene i listen.
        for (Figur f : figurListe) {
            System.out.println(f);
        }

        // På samme måte som med en liste kan vi opprette en Figur-variabel og sette inn et objekt som minst er
        // et figur objekt, så lenge objektet ikke er av Figur-klassen direkte (Også polymorfi).
        Figur figur1 = new Rektangel("rød",
                1, 1);




    }
}
