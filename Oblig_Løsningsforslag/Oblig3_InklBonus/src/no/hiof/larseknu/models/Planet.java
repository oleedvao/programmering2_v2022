package no.hiof.larseknu.models;

public class Planet extends NaturalSatellite{
    public static final double JUPITER_RADIUS_IN_KM = 71492;
    public static final double JUPITER_MASS_IN_KG = 1.898E27;
    public static final double EARTH_RADIUS_IN_KM = 6371;
    public static final double EARTH_MASS_IN_KG = 5.972E24;

    public Planet(String name, double radius, double mass, double samiMajorAxis, double eccentricity,
                  double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass, samiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    public double getSurfaceGravity() {
         // g = GM / R²
        return (CelestialBody.GRAVITATIONAL_CONSTANT * getMassInKg()) / Math.pow(getRadiusInMeter(), 2);
    }

    @Override
    public double getRadiusInKm() {
        return getRadius() * JUPITER_RADIUS_IN_KM;
    }

    private double getRadiusInMeter() {
        return getRadiusInKm() * 1000;
    }

    @Override
    public double getMassInKg() {
        return getMass() * JUPITER_MASS_IN_KG;
    }

    public double getMassInMearth() {
        return getMassInKg() / EARTH_MASS_IN_KG;
    }

    public double getRadiusInRearth() {
        return getRadiusInKm() / EARTH_RADIUS_IN_KM;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %s Rjup and a mass of %s Mjup", getName(), getRadius(), getMass());
    }
}
