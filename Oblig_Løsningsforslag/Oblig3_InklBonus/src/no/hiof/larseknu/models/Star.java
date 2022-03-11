package no.hiof.larseknu.models;

public class Star extends CelestialBody{
    private double effectiveTemp;

    public static final double SOLAR_RADIUS_IN_KM = 695700;
    public static final double SOLAR_MASS_IN_KG = 1.98892E30;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public double getRadiusInKm() {
        return getRadius() * SOLAR_RADIUS_IN_KM;
    }

    @Override
    public double getMassInKg() {
        return getMass() * SOLAR_MASS_IN_KG;
    }

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %s Rsun, a mass of %s Msun and a effective temperature of %.0f K", getName(), getRadius(), getMass(), effectiveTemp);
    }
}
