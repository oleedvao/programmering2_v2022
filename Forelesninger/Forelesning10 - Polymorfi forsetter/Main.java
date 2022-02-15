package no.hiof.oleedvao.forelesning10;

import no.hiof.oleedvao.forelesning10.models.Bussjafor;
import no.hiof.oleedvao.forelesning10.models.Person;
import no.hiof.oleedvao.forelesning10.models.Snekker;
import no.hiof.oleedvao.forelesning10.models.Snekkerlaerling;

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

        Snekkerlaerling snekkerlaerling = new Snekkerlaerling("Nils",
                "Jensen", 25, 0, "1 år");

        System.out.println(person.toString());
        System.out.println(bussjafor.toString());
        System.out.println(snekker.toString());
        System.out.println(snekkerlaerling.toString());


        // Oppretter et Bussjafor-objekt med den alternative konstruktøren.
        // Rute vil her bli satt til defaultverdien "630 - Fredrikstad, Halden" ettersom det er definert i
        // denne konstruktøren.
        Bussjafor bussjafor2 = new Bussjafor("Bing",
                "Chilling", 91);
        System.out.println();
        System.out.println(bussjafor2);

        // Oppretter et Snekker-objekt med alternativ konstruktør.
        // antallHusBygd vil her bli satt til defaultverdien 0;
        Snekker snekker2 = new Snekker("Jonas",
                "Kladd", 53
                );
        System.out.println(snekker2);

        // Oppretter et Snekkerlaerling-objekt med den første alternative konstruktøren
        // Dette vil sette opplaerlingsperiode til defaultverdien "1 år".
        /*
        Snekkerlaerling snekkerlaerling2 = new Snekkerlaerling("Arne",
                "Noldus", 20, 3);
         */
        // Oppretter et Snekkerlaerling-objekt med den andre alternative konstruktøren
        // Dette vil sette både antallHusBygd og opplaerningsperiode til defaultverdier (0 og "1 år" respektivt).
        Snekkerlaerling snekkerlaerling2 = new Snekkerlaerling("Arne",
                "Noldus", 20);
        System.out.println(snekkerlaerling2);


        // Benytter sammenlignings-metoden til å sammenligne et gitt Person-objekt med et annet Person-objekt.
        // Merk at alle objekter som er av Person eller arver fra denne klassen er aktuelle som metode-parametere.
        System.out.println();
        person.sammenlignAlderMedPerson(person);
        person.sammenlignAlderMedPerson(snekker);
        snekker.sammenlignAlderMedPerson(bussjafor);
        bussjafor.sammenlignAlderMedPerson(snekkerlaerling);

        // Vi kan ikke sammenligne med et objekt av Objekt-klassen ettersom denne typen objekt ikke arver fra Person.
        Object object = new Object();
        //snekker.sammenlignAlderMedPerson(object);


        // Oppretter en arrayliste som holder på Person-objekter.
        ArrayList<Person> personliste = new ArrayList<>();
        // Merk at alle objekter som er av Person eller arver fra denne klassen kan legges til i listen.
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
                System.out.println(p + " <-- Dette er en snekkerlærling.");
            }
            else if (p instanceof Snekker){ // Hvis et gitt Person-objekt i listen er av Snekker-klassen
                                            // (Gjelder by default også for Snekkerlaerling, med mindre
                                            // vi sjekker for den klassen først)
                // Skriver ut objekt-beskrivelsen + indikasjon på at dette er et Snekker-objekt
                System.out.println(p + " <-- Dette er en snekker.");
            }
            else { // i alle andre tilfeller
                // Skriver ut objektets beskrivelse.
                System.out.println(p);
            }
        }

    }
}
