package no.hiof.oleedvao.oblig1;

import java.util.Scanner;

public class Oppgave2_2 {
    public static void main(String[] args) {

        // Tar input fra terminal for å få brukeren sin vekt (alternativ kunne vært å benytte program-argumenter)
        // (også OK om man definerer vekten sin direkte i en variabel og ikke benytter Scanner-klassen)
        System.out.println("What is your weight in kg?: ");
        Scanner scanner = new Scanner(System.in);
        int myWeight = scanner.nextInt();

        // Variabel som representerer månens tyngekraft (i prosent av jordens tyngdekraft)
        double moonGravity = 16.5;

        // Regner ut vekten på månen (det finnes alternative utregninger også)
        double weightOnTheMoon = myWeight * (moonGravity/100);

        // Skriver ut vekten på månen
        System.out.println();
        System.out.println("Your weight on the moon: " + weightOnTheMoon);
    }
}
