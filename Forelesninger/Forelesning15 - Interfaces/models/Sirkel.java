package no.hiof.oleedvao.forelesning15.models;

// Ettersom klassen arver fra Figur, som implementerer Tegnbar og Comparable, må denne klassen ha
// kodekropper for metodene definert i disse interfacene (enten via arv eller definert direkte i denne klassen).
public class Sirkel extends Figur{

    private double radius;

    public Sirkel(String farge, double radius) {
        super(farge);
        this.radius = radius;
    }

    // Definerer kodekropp for getTegning() metoden i henhold til implementasjonen av Tegnbar-interfacet,
    // som vi definerer skal implementeres for alle Figur-er (Instansierbare underklasser av Figur).
    @Override
    public String getTegning() {
        return "   ___  \n" +
                " /     \\ \n" +
                " \\     / \n" +
                "   ---  ";
    }

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
