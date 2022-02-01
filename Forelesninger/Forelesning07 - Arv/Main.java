package no.hiof.oleedvao.forelesning07;

import no.hiof.oleedvao.forelesning07.models.Person;
import no.hiof.oleedvao.forelesning07.models.Snekker;

public class Main {
    public static void main(String[] args) {
        // Oppretter ett Person objekt. Følger konstruktøren definert for Person-klassen.
        Person person = new Person("Jimmy",
                "Neutron", 12);
        System.out.println(person.getFornavn() + " " +
                person.getEtternavn());


        System.out.println();

        // Oppretter et Snekker-objekt. Tar parametere som er relevante for person, i tillegg til
        // parametere som er spesifikt relevante for Snekker.
        // Konseptuelt kan vi si at Snekker er en Person, og må derfor ha de samme egenskapene.
        Snekker snekker = new Snekker("Bjørn",
                "Magnusen", 47,
                2);
        // Skriver ut Snekker-objektet fornavn og etternavn (på samme måte som med Person-objekter).
        System.out.println(snekker.getFornavn() + " " +
                snekker.getEtternavn());

        // Skriver ut antall hus bygd for Snekker-objektet. Dette er unikt for Snekker objekter.
        System.out.println();
        System.out.println(snekker.getAntallHusBygd());

        // Vi kan ikke benytte metoder definert for Snekker klassen gjennom Person-objekter.
        // Snekker klassen har et forhold til Person-klassen gjennom arv, men det motsatte er ikke tilfellet.
        //person.getAntallHusBygd();


        System.out.println();


        // Endrer fornavn, etternavn og antall hus for Snekker-objektet.
        snekker.setFornavn("Bing");
        snekker.setEtternavn("Chilling");
        snekker.setAntallHusBygd(4);
        System.out.println(snekker.getFornavn() + " " +
                snekker.getEtternavn() + "\n" +
                snekker.getAntallHusBygd());


    }
}
