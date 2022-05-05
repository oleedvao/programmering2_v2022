package no.hiof.oleedvao.oblig4;

import no.hiof.oleedvao.oblig4.models.Planet;
import no.hiof.oleedvao.oblig4.models.PlanetSystem;
import no.hiof.oleedvao.oblig4.models.Star;

import java.util.ArrayList;
import java.util.Collections;

public class MainSorting {
    public static void main(String[] args) {
        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        PlanetSystem solarSystem = new PlanetSystem("Solar System", sun);

        solarSystem.addPlanet(new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4,
                0.387, 0.206, 88, sun));
        solarSystem.addPlanet(new Planet("Venus", 0.08465003077267387, 0.002564278187565859,
                0.723, 0.007, 225, sun));
        solarSystem.addPlanet(new Planet("Earth", 0.08911486599899289, 0.003146469968387777,
                1, 0.017, 365, sun));
        solarSystem.addPlanet(new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4,
                1.524, 0.093, 687, sun));
        solarSystem.addPlanet(new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049,
                4380, sun));
        solarSystem.addPlanet(new Planet("Saturn", 0.8145247020645666, 0.2994204425711275,
                9.5826, 0.057, 10585, sun));
        solarSystem.addPlanet(new Planet("Uranus", 0.35475297935433336, 0.04573761854583773,
                19.2184, 0.046, 30660, sun));
        solarSystem.addPlanet(new Planet("Neptune", 0.34440217087226543, 0.05395152792413066,
                30.11, 0.010, 60225, sun));

        // Sorterer planetene i solsystemet (basert på masse) og printer dem ut
        solarSystem.sortPlanets();
        for (Planet p : solarSystem.getPlanets()) {
            System.out.println(p.getName() + " - " + p.getMass());
        }

        // Lager et mockup PlanetSystem-objekt for å vise sortering av PlanetSystem-objekter.
        Star muCas = new Star("MU Cas", 4.192, 4.657, 14750);
        PlanetSystem mockupPlanetSystem = new PlanetSystem("Mockup Solar System", muCas);
        mockupPlanetSystem.addPlanet(new Planet("FakePlanet1", 0.064, 2.85, 0.732,
                0.3, 97, muCas));
        mockupPlanetSystem.addPlanet(new Planet("FakePlanet2", 0.00864, 4.65, 0.25,
                0.9, 156, muCas));

        ArrayList<PlanetSystem> planetSystems = new ArrayList<>();
        planetSystems.add(mockupPlanetSystem);
        planetSystems.add(solarSystem);

        // Sorterer planetsystemene basert på hvor mange planeter de har.
        System.out.println();
        Collections.sort(planetSystems);
        for(PlanetSystem ps : planetSystems) {
            System.out.println(ps.getName() + ": " + ps.getPlanets().size() + " planets in system.");
        }

    }
}
