package no.hiof.oleedvao.forelesning15.models;

// Ettersom klassen arver fra Figur, som implementerer Tegnbar og Comparable, må denne klassen ha
// kodekropper for metodene definert i disse interfacene (enten via arv eller definert direkte i denne klassen).
public class Rektangel extends Figur {

    private double lengde;
    private double bredde;

    public Rektangel(String farge, double lengde, double bredde) {
        super(farge);
        this.lengde = lengde;
        this.bredde = bredde;
    }

    // Definerer kodekropp for getTegning() metoden i henhold til implementasjonen av Tegnbar-interfacet,
    // som vi definerer skal implementeres for alle Figur-er (Instansierbare underklasser av Figur).
    @Override
    public String getTegning() {
        return " ------\n" +
                "|      |\n" +
                " ------";
    }

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
