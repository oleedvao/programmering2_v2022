package no.hiof.oleedvao.forelesning09;

import no.hiof.oleedvao.forelesning09.models.Bussjafor;
import no.hiof.oleedvao.forelesning09.models.Person;
import no.hiof.oleedvao.forelesning09.models.Snekker;
import no.hiof.oleedvao.forelesning09.models.Snekkerlaerling;

public class Main {
    public static void main(String[] args) {
        // Oppretter objekter for hver klasse i klassehierarkiet
        Person person = new Person("Jimmy",
                "Neutron", 12);

        Bussjafor bussjafor = new Bussjafor("Rolf",
                "Larsen", 38,
                "630 - Fredrikstad, Halden");

        Snekker snekker = new Snekker("Bjørn",
                "Magnusen", 47, 2);

        Snekkerlaerling snekkerlaerling = new Snekkerlaerling("Nils",
                "Jensen", 25, 0, "1 år");

        // Skriver ut beskrivelser for hvert objekt gjennom .toString() metoden
        // (Vi trenger faktisk ikke skrive .toString() ettersom dette er standardmetoden
        // ved objektreferanse)
        System.out.println(person.toString());
        System.out.println(bussjafor.toString());
        System.out.println(snekker.toString());
        System.out.println(snekkerlaerling.toString());

        // Oppretter et Bussjafor-objekt med den alternative konstruktøren
        // definert med Overloading i Bussafor-klassen.
        // Vi skiller på de to konstruktørene basert på det vi sender inne med parameterene.
        // I dette tilfellet String, String, int.
        // Java vil da benytte den konstruktøren som matcher disse parameter-datatypene.
        Bussjafor bussjafor2 = new Bussjafor("Bing",
                "Chilling", 91);
        System.out.println();
        System.out.println(bussjafor2);
    }
}
