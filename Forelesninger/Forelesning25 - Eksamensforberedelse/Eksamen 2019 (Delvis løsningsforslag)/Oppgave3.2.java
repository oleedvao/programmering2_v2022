public class Lyd {
    // Vi utelater koden fra forrige oppgave ettersom denne oppgaven ikke er
    // avhengig av dette.

    // konstant som representerer 1 Hertz
    public final static int HZ = 44100;

    // Henter størrelsen av Lyd-objektet
    public long getSize() {
        // Denne koden er ikke fullstendig riktig ut ifra oppgavebeskrivelsen,
        // men denne er veldig case-spesifikk og vanskelig å tyde, so
        // whatever...
        return kanaler * maalinger * (bits / 8) * varighet;
    }

    // Returnerer en boolean verdi som representerer "kvaliteten" av
    // Lyd-objektet.
    public boolean cdKvalitet() {
        return if (kanaler >= 2 && maalinger >= HZ && bits >= 16);
    }

    // Metode for avspilling av lyd
    public void spill() {
        // Det er spesifisert i oppgaven at vi ikke skal lage en implementasjon
        // for denne metoden.
    }
}
