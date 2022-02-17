package no.hiof.oleedvao.forelesning11;

import no.hiof.oleedvao.forelesning11.models.Bussjafor;
import no.hiof.oleedvao.forelesning11.models.Person;
import no.hiof.oleedvao.forelesning11.models.Snekker;
import no.hiof.oleedvao.forelesning11.models.Snekkerlaerling;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jimmy",
                "Neutron", 12);

        Bussjafor bussjafor = new Bussjafor("Rolf",
                "Larsen", 38,
                "630 - Fredrikstad, Halden");

        Snekker snekker = new Snekker("Bjørn",
                "Magnusen", 47, 2);

        Snekkerlaerling snekkerlaerling = new Snekkerlaerling(
                "Nils", "Jensen",
                25, 3, "1 år");

        System.out.println(person.toString());
        System.out.println(bussjafor.toString());
        System.out.println(snekker.toString());
        System.out.println(snekkerlaerling.toString());

        // Oppretter en liste som holder på Person-objekter. På grunn av polymorfi-prinsippet vil dette si at vi
        // også kan sette inn objekter av Person sine underklasser
        ArrayList<Person> personliste = new ArrayList<>();
        personliste.add(person);
        personliste.add(snekker);
        personliste.add(bussjafor);
        personliste.add(snekkerlaerling);
        personliste.add(snekkerlaerling);


        System.out.println();
        // Iterer gjennom listen med Person-objekter
        for (Person p : personliste) {
            // Hvis vi vil kontrollere om et gitt Person-objekt er av en spesifikk klasse, kan vi benytte
            // nøkkelordet instanceof, som returnerer true/false basert på om objektet er av den spesifiserte klassen
            // eller ikke.
            if (p instanceof Snekkerlaerling) { // Hvis et gitt Person-objekt i listen er av Snekkerlaerling-klassen
                // Skriver ut objekt-beskrivelsen + indikasjon på at dette er et Snekkerlaerling-objekt
                // Konverterer her også Person-objektet til et Snekkerlaerling-objekt for å få tilgang til
                // funksjonalitet relevant for Snekkerlaerling-klassen
                // Denne konverteringen er bare mulig hvis objektet i Person-variabelen faktisk (minst) er et
                // objekt av Snekkerlaerling. Hvis ikke får vi en exception.
                System.out.println(p + " <-- Dette er en snekkerlærling med " +
                        "opplæringsperiode på " +
                        ((Snekkerlaerling) p).getOpplaerlingsperiode());
            }
            else if (p instanceof Snekker){ // Hvis et gitt Person-objekt i listen er av Snekker-klassen
                                            // (Gjelder by default også for Snekkerlaerling, med mindre
                                            // vi sjekker for den klassen først)
                // Skriver ut objekt-beskrivelsen + indikasjon på at dette er et Snekker-objekt
                // Konverterer her også Person-objektet til et Snekker-objekt for å få tilgang til funksjonalitet
                // relevant for Snekker-klassen.
                // Igjen er denne konverteringen er bare mulig hvis objektet i Person-variabelen faktisk
                // (minst) er et objekt av Snekkerlaerling. Hvis ikke får vi en exception.
                System.out.println(p + " <-- Dette er en snekker som har bygd " +
                        ((Snekker) p).getAntallHusBygd() + " hus.");
            }
            else { // i alle andre tilfeller
                // Skriver ut objektets beskrivelse.
                System.out.println(p);
            }
        }
    }
}
