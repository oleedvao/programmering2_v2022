package no.hiof.oleedvao.forelesning11;

import no.hiof.oleedvao.forelesning11.models.Bussjafor;
import no.hiof.oleedvao.forelesning11.models.Person;
import no.hiof.oleedvao.forelesning11.models.Snekker;
import no.hiof.oleedvao.forelesning11.models.Snekkerlaerling;

public class BrukAvStatic {
    public static void main(String[] args) {

        //Skriver ut totalt antall personer før vi oppretter noen Person-objekter.
        // Merk at vi kaller statiske variabler og metoder direkte fra Klassen, ikke gjennom objekter.
        //System.out.println(Person.totaltAntallPersoner);
        System.out.println(Person.getTotaltAntallPersoner()); // Utskrift: 0

        Person person = new Person("Jimmy",
                "Neutron", 12);

        System.out.println();
        //System.out.println(Person.totaltAntallPersoner);
        System.out.println(Person.getTotaltAntallPersoner()); // Utskrift: 1 (fordi vi har opprettet ett objekt)

        Bussjafor bussjafor = new Bussjafor("Rolf",
                "Larsen", 38,
                "630 - Fredrikstad, Halden");

        System.out.println();
        //System.out.println(Person.totaltAntallPersoner);
        System.out.println(Person.getTotaltAntallPersoner());

        Snekker snekker = new Snekker("Bjørn",
                "Magnusen", 47, 2);

        Snekkerlaerling snekkerlaerling = new Snekkerlaerling(
                "Nils", "Jensen",
                25, 0, "1 år");

        System.out.println();
        //System.out.println(Person.totaltAntallPersoner);
        System.out.println(Person.getTotaltAntallPersoner()); // Utskrift: 4 (fordi vi nå har opprettet fire
        // Person-objekter)

        System.out.println(Snekker.getTotaltAntallPersoner()); // Vi kan også kalle statiske metoder fra Klasser som
        // arver fra klassen de er definert. Vil få samme utskrift som forrige kodelinje (4).

        System.out.println();
        System.out.println(Snekker.getTotaltAntallSnekkere()); // Utskrift: 2 (fordi Snekkerlaerling-objekter teller
        // også teller som Snekker-objekter)

        System.out.println();
        System.out.println(Snekker.getTotaltAntallHus()); // Utskrift: 2 (fordi Snekker-objektet vårt, med navn Bjørn
        //Magnusen, har bygd 2 hus, mens Snekkerlaerling-objektet vårt, med navn Nils Jensen, har bygd 0. 2 + 0 = 2).



    }
}
