package no.hiof.oleedvao.forelesning08;

import no.hiof.oleedvao.forelesning08.models.Bussjafor;
import no.hiof.oleedvao.forelesning08.models.Person;
import no.hiof.oleedvao.forelesning08.models.Snekker;
import no.hiof.oleedvao.forelesning08.models.Snekkerlaerling;

public class Main {
    public static void main(String[] args) {

        // Oppretter ogjekter for Person-, Snekker- og Bussjafor-klassen
        Person person = new Person("Jimmy",
                "Neutron", 12);

        Snekker snekker = new Snekker("Bjørn",
                "Magnusen", 47,
                2);

        Bussjafor bussjafor = new Bussjafor("Rolf",
                "Larsen", 38,
                "630 - Fredrikstad, Halden");

        // Skriver ut informasjonen som er tilgjengelig for person-objektet
        System.out.println(person.getFornavn() + " " +
                person.getEtternavn() + " alder: " +
                person.getAlder());

        // Skriver ut informasjonen som er tilgjengelig for snekker-objektet.
        // Inkluderer det som er tilgjengelig for person-objektet ettersom Snekker arver fra Person.
        System.out.println();
        System.out.println(snekker.getFornavn() + " " +
                snekker.getEtternavn() + " alder: " +
                snekker.getAlder());
        System.out.println("Antall hus bygd: " +
                snekker.getAntallHusBygd());


        // Skriver ut informasjonen som er tilgjengelig for bussjafor-objektet.
        // Inkluderer det som er tilgjengelig for person-objektet ettersom Bussjafor arver fra Person.
        System.out.println();
        System.out.println(bussjafor.getFornavn() + " " +
                bussjafor.getEtternavn() + " alder: " +
                bussjafor.getAlder());
        System.out.println("Rute: " + bussjafor.getRute());

        System.out.println();

        // Viser arv av metoder gjennom bruk av .getBeskrivelse() metoden, som er definert for Person-klassen
        // men ikke andre steder
        /*
        System.out.println(person.getBeskrivelse());

        System.out.println();
        System.out.println(snekker.getBeskrivelse());

        System.out.println();
        System.out.println(bussjafor.getBeskrivelse());

        System.out.println();
        Snekkerlaerling snekkerlaerling = new Snekkerlaerling(
                "Nils", "Jensen", 25,
                0, "1 år"
        );
        System.out.println(snekkerlaerling.getBeskrivelse());
        System.out.println("Antall hus bygd: " +
                snekkerlaerling.getAntallHusBygd());
        System.out.println("Opplæringsperiode: " +
                snekkerlaerling.getOpplaerlingsperiode());

         */

        // Bytter ut .getBeskrivelse()-metoden med .toString()-metoden som blir overstyrt i Person-klassen og
        // arvet nedover i hierarkiet deretter.
        System.out.println();
        System.out.println(person.toString());

        System.out.println();
        System.out.println(snekker.toString());

        System.out.println();
        System.out.println(bussjafor.toString());

        Snekkerlaerling snekkerlaerling = new Snekkerlaerling(
                "Nils", "Jensen", 25,
                0, "1 år"
        );

        System.out.println();
        System.out.println(snekkerlaerling.toString());


    }
}
