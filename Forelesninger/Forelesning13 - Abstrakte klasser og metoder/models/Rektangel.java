package no.hiof.oleedvao.forelesning13figurer.models;

// Klasse som representerer Rektangler.
// Arver fra den abstrakte klassen Figur.
// Vi KAN opprette objekter av Rektangel-klassen.
public class Rektangel extends Figur{

    private double lengde;
    private double bredde;

    public Rektangel(String farge, double lengde, double bredde) {
        super(farge);
        this.lengde = lengde;
        this.bredde = bredde;
    }

    // Rektangel er tvunget til å implementere omkrets() og areal() via Overriding ettersom disse er definert
    // som abstrakte metoder i Figur-klassen.
    @Override
    public double omkrets() {
        // rektangel: 2*lengde + 2*bredde
        return 2*lengde + 2*bredde;
    }

    @Override
    public double areal() {
        // rektangel: lengde*bredde
        return lengde*bredde;
    }

    public double getLengde() {
        return lengde;
    }

    public void setLengde(double lengde) {
        this.lengde = lengde;
    }

    public double getBredde() {
        return bredde;
    }

    public void setBredde(double bredde) {
        this.bredde = bredde;
    }
}
