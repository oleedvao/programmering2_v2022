package no.hiof.oleedvao.oblig2.models;

public class Planet {
    private String name;
    private double radius;
    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public double radiusInKm() {
        return radius * 71_492;
    }

    public double massInKg() {
        return mass * 1.898E27;
    }

    public double radiusInRearth() {
        return radiusInKm()/6371;
    }

    public double massInMearth() {
        return massInKg()/5.972E24;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11 * massInKg()) / Math.pow(radiusInKm()*1000, 2);
    }

    @Override
    public String toString() {
        return "The planet " + name + " has a radius of " + radius +
                " Rjup, and a mass of " + mass + " Mjup.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
