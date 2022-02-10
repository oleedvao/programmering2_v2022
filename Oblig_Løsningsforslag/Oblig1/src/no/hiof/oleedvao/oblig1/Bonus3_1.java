package no.hiof.oleedvao.oblig1;

import no.hiof.oleedvao.oblig1.models.Planet;

import java.util.Scanner;

public class Bonus3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the planet?: ");
        String name = scanner.nextLine();

        System.out.println("What is the radius of the planet (in km)?: ");
        int radius = scanner.nextInt();

        System.out.println("What is the mass of the planet (in kg)?: ");
        double mass = scanner.nextDouble();

        System.out.println();

        Planet planet = new Planet(name, radius, mass);
        planet.printDescription();
    }
}
