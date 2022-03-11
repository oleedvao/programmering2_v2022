package no.hiof.oleedvao.oblig2;

import no.hiof.oleedvao.oblig2.models.Planet;
import no.hiof.oleedvao.oblig2.models.PlanetSystem;
import no.hiof.oleedvao.oblig2.models.Star;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Oppretter Star-objektet som representerer solsystemets sol
        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        // Oppretter en rekke med planet-objekter
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);

        // Legger til planet-objektene i en arrayliste
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        // Oppretter planetsystemet "Solar system"
        PlanetSystem planetSystem = new PlanetSystem("Solar system", sun, planets);

        // Skriver ut beskrivelse for planetsystemet
        System.out.println(planetSystem);

        // Skriver ut en beskrivelse for alle planetene i planetsystemet
        System.out.println();
        for (Planet planet : planetSystem.getPlanets()) {
            System.out.println(planet);
        }

        // Skriver ut saturns radius og masse
        System.out.println();
        System.out.println("Saturn radius in Km: " + saturn.radiusInKm() + "\n" +
                "Saturn mass in kg: " + saturn.massInKg());

        // Skriver ut solens radius og masse
        System.out.println("Sun radius in km: " + sun.radiusInKm() +
                "\nSun mass in kg: " + sun.massInKg());

        // Skriver ut tyngdekraften for saturn og neptune
        System.out.println();
        System.out.println("Saturn surface gravity: " + saturn.getSurfaceGravity());
        System.out.println("Neptune surface gravity: " + neptune.getSurfaceGravity());

        // Skriver ut den største og minste planeten i planetsystemet
        System.out.println();
        System.out.println("Biggest planet in the solar system: " + planetSystem.getBiggestPlanet());
        System.out.println("Smallest planet in the solar system: " + planetSystem.getSmallestPlanet());

        // Skriver ut masse og radius i Mearth og Rearth for Mars
        System.out.println();
        System.out.println("Mars Mearth: " + mars.massInMearth());
        System.out.println("Mars Rearth: " + mars.radiusInRearth());
    }
}
