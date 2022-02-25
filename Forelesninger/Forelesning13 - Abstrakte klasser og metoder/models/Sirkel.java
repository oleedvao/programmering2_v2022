package no.hiof.oleedvao.forelesning13figurer.models;

// Klasse som representerer Sirkler.
// Arver fra den abstrakte klassen Figur.
// Vi KAN opprette objekter av Sirkel-klassen.
public class Sirkel extends Figur{

    private double radius;

    public Sirkel(String farge, double radius) {
        super(farge);
        this.radius = radius;
    }

    // Sirkel er tvunget til å implementere omkrets() og areal() via Overriding ettersom disse er definert
    // som abstrakte metoder i Figur-klassen.
    @Override
    public double omkrets() {
        // sirkel: 2*radius*Pi
        return 2*radius*Math.PI;
    }

    @Override
    public double areal() {
        // sirkel: Pi * radius^2
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
