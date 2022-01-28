package no.hiof.oleedvao.forelesning06;

import no.hiof.oleedvao.forelesning06.models.Kurs;

import java.util.ArrayList;

public class Objektlister {

    public static void main(String[] args) {

        // Opprette en ArrayList med kurs-objekter
        ArrayList<Kurs> kursListe = new ArrayList<>();
        System.out.println("Antall elementer i liste: " + kursListe.size());

        // Opprette og legge til et kurs
        Kurs kurs1 = new Kurs("Programmering 2", "ITF10619", 10);
        kursListe.add(kurs1);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());

        // Referere til objektet på posisjonen med index 0. Altså første element.
        kursListe.get(0).printBeskrivelse();

        // Opprette og legge til ett nytt kurs og skrive ut beskrivelse.
        Kurs kurs2 = new Kurs("Databasesystemer", "ITF10319", 10);
        kursListe.add(kurs2);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Beskrivelese av andre element i listen:");
        kursListe.get(1).printBeskrivelse();

        // Skrive ut navn på samtlige
        System.out.println();
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        /*
        for (int x = 0; x < kursListe.size(); x++) {
            Kurs xKurs = kursListe.get(x);
            System.out.println(xKurs.getKursNavn());
        }
         */
        for(Kurs xKurs : kursListe) {
            //xKurs.printBeskrivelse();
            System.out.println(xKurs.getKursNavn());
        }

        // Endre på et første objekt
        System.out.println();
        kursListe.get(0).setStudiePoeng(1_000_000);
        System.out.println("Beskrivelese av første element i listen:");
        kursListe.get(0).printBeskrivelse();

        // Overskrive første objekt med et nytt objekt
        Kurs kurs3 = new Kurs("Rumpeldunk", "ITF?????", 10);
        kursListe.set(0, kurs3);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Beskrivelese av første element i listen:");
        kursListe.get(0).printBeskrivelse();

        // Legge til det samme objektet vi endret første objekt til
        kursListe.add(kurs3);
        System.out.println();
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        for(Kurs xKurs : kursListe) {
            //xKurs.printBeskrivelse();
            System.out.println(xKurs.getKursNavn());
        }

        // Fjerne et spesifikt objekt (fjerner første tilfelle)
        kursListe.remove(kurs3);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        for(Kurs xKurs : kursListe) {
            //xKurs.printBeskrivelse();
            System.out.println(xKurs.getKursNavn());
        }

        // Fjerne objekt basert på posisjon (index)
        kursListe.remove(1);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        for(Kurs xKurs : kursListe) {
            //xKurs.printBeskrivelse();
            System.out.println(xKurs.getKursNavn());
        }

        // Sette inn objekt spesifikt på første posisjon
        kursListe.add(0, kurs1);
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        for(Kurs xKurs : kursListe) {
            //xKurs.printBeskrivelse();
            System.out.println(xKurs.getKursNavn());
        }

        // Fjern alle objekter fra listen
        kursListe.clear();
        System.out.println();
        System.out.println("Antall elementer i liste: " + kursListe.size());
        System.out.println("Utskrift av samtlige kurs i kursListe:");
        for(Kurs xKurs : kursListe) {
            //xKurs.printBeskrivelse();
            System.out.println(xKurs.getKursNavn());
        }


        // Eksempel på hvordan å benytte ArrayList med primitive datatyper
        System.out.println();
        System.out.println("-----------------");
        // Wrapperklasser for de forskjellige primitive datatypene
        //int -> Integer
        //double -> Double
        //boolean -> Boolean
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(42);
        intList.add(69);
        intList.add(1337);
        //intList.remove(1);
        intList.remove((Integer)69);
        for (Integer xInt : intList) {
            System.out.println(xInt);
        }






    }
}
