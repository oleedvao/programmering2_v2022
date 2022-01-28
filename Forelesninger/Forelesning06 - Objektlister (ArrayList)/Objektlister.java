package no.hiof.oleedvao.forelesning06;

import no.hiof.oleedvao.forelesning06.models.Kurs;

import java.util.ArrayList;

public class Objektlister {
    public static void main(String[] args) {

        // Oppretter en (tom) ArrayList som skal holde på Kurs-objekter
        ArrayList<Kurs> kursListe = new ArrayList<>();
        // Skriver ut antall elementer i listen.
        System.out.println("Antall elementer i liste: " + kursListe.size());

        // Oppretter og legger til et Kurs-objekt i listen og skriver ut den nye listestørrelsen.
        Kurs kurs1 = new Kurs("Programmering 2", "ITF10619", 10);
        kursListe.add(kurs1);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());

        // Benytter Kurs-klassens .printBeskrivelse()-metode for å skrive ut en beskrivelse
        // for det første Kurs-objektet i listen.
        kursListe.get(0).printBeskrivelse();

        // Oppretter et nytt Kurs-objekt og legger det til i listen.
        Kurs kurs2 = new Kurs("Databasesystemer", "ITF10319", 10);
        kursListe.add(kurs2);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        //Skriver ut beskrivelse for det andre Kurs-objektet i listen.
        kursListe.get(1).printBeskrivelse();

        // Skrive ut navet på alle Kurs-objektene i listen ved bruk av for-loop.
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        /* Iterere gjennom samtlige elementer i en liste med vanlig for-loop
        for (int x = 0; x < kursListe.size(); x++) {
            Kurs xKurs = kursListe.get(x);
            System.out.println(xKurs.getKursNavn());
        }
         */
        // Iterere gjennom samtlige elementer i en liste med for each-loop (smidigere syntax)
        for (Kurs xKurs : kursListe) {
            System.out.println(xKurs.getKursNavn());
        }


        // Fjerne et objekt fra listen (to alternativer: basert på index, eller spesifikt objekt som skal fjernes)
        //kursListe.remove(0);
        kursListe.remove(kurs1);

        // Skriver ut samtlige elementer i listen
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        for (Kurs xKurs : kursListe) {
            System.out.println(xKurs.getKursNavn());
        }


        // -------------------

        // Iterer gjennom alle elementene i en int-array
        System.out.println();
        int[] intArray = new int[5];

        for (int x : intArray) {
            System.out.println(x);
        }
    }
}
