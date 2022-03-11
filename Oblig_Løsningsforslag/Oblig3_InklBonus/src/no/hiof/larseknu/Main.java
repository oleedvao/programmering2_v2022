package no.hiof.larseknu;

import no.hiof.larseknu.models.Planet;
import no.hiof.larseknu.models.PlanetSystem;
import no.hiof.larseknu.models.Star;

public class Main {

    public static void main(String[] args) {
        Star sun = new Star("Sun", 1.0, 1.0, 5777);

	    PlanetSystem solarSystem = new PlanetSystem("Solar System", sun);

	    Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun);
	    solarSystem.addPlanet(mercury);
	    solarSystem.addPlanet(new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun));
        solarSystem.addPlanet(new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun));
        solarSystem.addPlanet(new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun));
        solarSystem.addPlanet(new Planet("Jupiter",1.0, 1.0, 5.20440, 0.049, 4380, sun));
        solarSystem.addPlanet(new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun));
        solarSystem.addPlanet(new Planet("Uranus", 0.35475297935433336, 0.04573761854583773,  19.2184, 0.046, 30660, sun));
        solarSystem.addPlanet(new Planet("Neptune",0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun));

        System.out.println(solarSystem.toString());

        Planet venus = solarSystem.getPlanet("Venus");
        Planet earth = solarSystem.getPlanet("Earth");
        Planet mars = solarSystem.getPlanet("Mars");
        Planet jupiter = solarSystem.getPlanet("Jupiter");
        Planet saturn = solarSystem.getPlanet("Saturn");
        Planet uranus = solarSystem.getPlanet("Uranus");
        Planet neptune = solarSystem.getPlanet("Neptune");

        System.out.println(sun.toString());
        System.out.println(venus);
        System.out.printf("%s has a radius of %skm and a mass of %skg %n",
                venus.getName(), venus.getRadiusInKm(), venus.getMassInKg());
        System.out.printf("%s has a radius of %skm and a mass of %skg %n",
                saturn.getName(), saturn.getRadiusInKm(), saturn.getMassInKg());

        System.out.printf("%s has a radius of %skm and a mass of %skg %n",
                sun.getName(), sun.getRadiusInKm(), sun.getMassInKg());

        System.out.printf("%s has a radius of %s Rearth and a mass of %s Mearth %n",
                mars.getName(), mars.getRadiusInRearth(), mars.getMassInMearth());

        System.out.println("Saturn gravity " + saturn.getSurfaceGravity() + " m/s²");
        System.out.println("Neptune gravity " + neptune.getSurfaceGravity() + " m/s²");

        System.out.println("Smallest: " + solarSystem.getSmallestPlanet());
        System.out.println("Largest: " + solarSystem.getLargestPlanet());


        // Oppgave 2.5
        System.out.println("\n********************Orbital Distance************************");
        for (int i = 0; i <= 360; i += 90) {
            double distance = earth.distanceToCentralBody(i);
            System.out.printf("%s has a distance of %.0fkm to the %s at %d degrees%n", earth.getName(), distance, earth.getCentralCelestialBody().getName(), i);
        }

        System.out.printf("%s has a distance of %.0fkm to the %s at %f radians%n", earth.getName(), earth.distanceToCentralBodyWithRadians(0.5), earth.getCentralCelestialBody().getName(), 0.5);


        System.out.println("\n********************Orbital Velocity************************");
        for (int i = 0; i <= 180; i += 45) {
            double distance = earth.distanceToCentralBody(i);
            double velocity = earth.orbitingVelocity(distance);
            System.out.printf("At a distance of %.0fkm, %s has a velocity of %.2fkm/s%n", distance, earth.getName(), velocity);
        }

        System.out.println("\n********************Maximum Distance************************");
        System.out.printf("%s has a max distance of %.0fkm%n", earth.getName(),earth.getMaxDistanceInOneOrbitalPeriod());

        System.out.println("\n********************Minimum Distance************************");
        System.out.printf("%s has a max distance of %.0fkm%n", earth.getName(),earth.getMinDistanceInOneOrbitalPeriod());


        System.out.println("\n********************Distance between two natural satellites************************");
        int day = 180;
        double distance = earth.distanceToOtherSatelliteAfterDays(saturn, day);
        System.out.printf("The distance between %s and %s at day %d is %.0fkm", earth.getName(), saturn.getName(), day, distance);
    }
}
