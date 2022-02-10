package no.hiof.oleedvao.oblig1;

import no.hiof.oleedvao.oblig1.models.Planet;

import java.util.ArrayList;
import java.util.Scanner;

public class Bonus3_3 {
    public static void main(String[] args) {

        // Oppretter en liste som skal holde på planet-objekter
        ArrayList<Planet> planetList = new ArrayList<>();

        while (true) {

            Scanner scanner = new Scanner(System.in);

            // Spør bruker om han/hun vil avslutte programmet
            // Det blir feil med inputs hvis man legger denne på slutten av løkken (usikker på hvorfor).
            System.out.println("Quit?: ");
            String answer = scanner.nextLine();
            if (answer.equals("y")) {
                break;
            }

            // Spør brukeren om han/hun ønsker å skrive ut alle registerte planeter
            // Det blir feil med inputs hvis man legger denne på slutten av løkken (usikker på hvorfor)
            System.out.println("Do you want to print all registered planets?: ");
            String wantToPrint = scanner.nextLine();
            if (wantToPrint.equals("y")) {
                for (Planet p : planetList ) {
                    p.printDescription();
                }
                System.out.println();
            }

            // Tar en rekke med inputs for forskjellige planetinformasjon
            System.out.println("What is the name of the planet?: ");
            String name = scanner.nextLine();

            System.out.println("What is the radius of the planet (in km)?: ");
            int radius = scanner.nextInt();

            System.out.println("What is the mass of the planet (in kg)?: ");
            double mass = scanner.nextDouble();

            System.out.println();

            // Oppretter et planet-objekt basert på input og legger det til i planetlisten.
            Planet planet = new Planet(name, radius, mass);
            planetList.add(planet);

        }
    }
}
