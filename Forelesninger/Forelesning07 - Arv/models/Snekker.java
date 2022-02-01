package no.hiof.oleedvao.forelesning07.models;

// En klasse, Snekker, som er satt til å arve fra Person-klassen ved bruk av kodeordet "extends".
// Dette vil si at Snekker-klassen også inneholder de variablene og metdoene som er definerte i
// Person. På en annen side er det bare de variablene og metodene som er satt til public
// som er direkte refererbare i Snekker.
public class Snekker extends Person {

    // En variabel som er unik for Snekker
    private int antallHusBygd;

    // En konstruktør som tar i mot parametere som er relevante for Person i tillegg til
    // de som er direkte relevante for Snekker. De som er relevante for Person blir sendt
    // til Person-konstruktøren ved bruk av super(). De som er direkte relevante for Snekker
    // benyttes til å direkte sette relevante variabler
    public Snekker(String fornavn, String etternavn, int alder, int antallHusBygd) {
        super(fornavn, etternavn, alder);

        this.antallHusBygd = antallHusBygd;
    }

    public int getAntallHusBygd() {
        return antallHusBygd;
    }

    public void setAntallHusBygd(int antallHusBygd) {

        this.antallHusBygd = antallHusBygd;
    }
}
