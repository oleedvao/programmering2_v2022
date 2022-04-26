// Opprett klassen
public class Lyd {

    // Definer variablene beskrevet. Sørg for at disse har fornufitige
    // datatyper og følger innkaplingsprinsippet.
    private String navn;
    private int varighet;
    private int kanaler;
    private int maalinger;
    private int bits;
    private LydSamples lydSamples;

    // Oppretter en konstuktør som setter verdier for de opprettede variablene.
    public Lyd(String navn, int varighet, int kanaler, int maalinger,
    int bits, LydSamples lydSamples) {
        this.navn = navn;
        this.varighet = varighet;
        this.maalinger = maalinger;
        this.bits = bits;
        this.lydSamples = lydSamples;

        // Sjekker om den oppgitte verdien for kanaler er på riktig format
        if (kanaler >= 1 && kanaler <= 24) {
            this.kanaler = kanaler;
        } else {
            // Hvis ikke kastes det en IllegalArgumentException.
            // Merk at dette ikke er gjenomgått i veldig stor grad i årets
            // kurs, så dette er ikke like relevant for årets eksamen.
            throw new IllegalArgumentException();
        }
    }

    // Oppretter gettere for de forskjellige variablene.
    public String getNavn() {
        return navn;
    }

    public int getKanaler() {
        return kanaler;
    }

    public int getMaalinger() {
        return maalinger;
    }

    public int getBits() {
        return bits;
    }

    public LydSamples getLydSamples() {
        return lydSamples;
    }
}
