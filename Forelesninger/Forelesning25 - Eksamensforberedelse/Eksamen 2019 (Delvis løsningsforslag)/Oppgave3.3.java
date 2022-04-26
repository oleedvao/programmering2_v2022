// Vi skriver en ny klasse Spillbar som abstraherer de felles variablene
// For Lyd og en annen klasse Video
// Vi velger her å gjøre denne abstrakt ettersom det ikke gir mening i
// caset å opprette Spillbar-objekter
public abstract class Spillbar {
    // Flytter de felles variablene til denne klassen
    private String navn;
    private int varighet;

    // Lager en passende konstruktør for de felles variablene.
    public Spillbar(String navn, int varighet) {
        this.navn = navn;
        this.varighet = varighet;
    }

    // Definerer metoden spill som abstrakt ettersom implementasjonen
    // trolig vil være unik for alle underklasser av Spillbar.
    public abstract void spill();

    // Flyter over get-metodene for navn og varighet.
    public String getNavn() {
        return navn;
    }

    public int getVarighet(){
        return varighet;
    }

}

// Vi oppdaterer Lyd-klassen til å nå gjenbruke Spillbar sine egenskaper (Arv).
// Vi må derfor sette Lyd til å arve (extends) fra Spillbar.
public class Lyd extends Spillbar{
    private int kanaler;
    private int maalinger;
    private int bits;
    private LydSamples lydSamples;

    public Lyd(String navn, int varighet, int kanaler, int maalinger,
    int bits, LydSamples lydSamples) {
        // For å sette verdiene for navn og varighet, må vi nå kalle
        // super sin konstruktør i stedet for å sette verdiene direkte.
        super(navn, varighet);

        this.maalinger = maalinger;
        this.bits = bits;
        this.lydSamples = lydSamples;

        if (kanaler >= 1 && kanaler <= 24) {
            this.kanaler = kanaler;
        } else {
            throw IllegalArgumentException;
        }
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
