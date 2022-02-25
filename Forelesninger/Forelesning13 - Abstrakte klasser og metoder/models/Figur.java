package no.hiof.oleedvao.forelesning13figurer.models;

// Klasse som abstraherer felles funksjonalitet for forskjellige "figurer"
// Klassen er definert som abstract. Det vil si at vi ikke kan opprette objekter av denne klassen direkte,
// men vi kan fremdeles arve fra den og opprette objekter av de medfølgende underklassene.
public abstract class Figur {

    private String farge;

    public Figur(String farge) {
        this.farge = farge;
    }

    // Metodene for omkrets() og areal() er felles for alle "figurer", men implementasjonen
    // er forskjellig for hver type figur. Det er derfor ikke mulig å implementere omkrets() og areal() på
    // en tilfredstillende måte i Figur-klassen, som forsøker å abstrahere disse.
    // Vi definerer derfor disse metodene som abstract. Dette gjør at vi ikke trenger å implementere kodelogikken
    // for disse metodene i den abstrakte klassen, Figur, men MÅ implementere kodelogikken for disse i alle
    // klasser som arver fra Figur. Dette gjøres spesifikt ved å Override dem i Figur sine underklasser.
    // Merk også at abstrakte metoder ikke kan defineres i en vanlig klasse. Klassen må også være abstrakt.
    // Dette gir mening ettersom alle metoder kalt fra et objekt må ha en tilhørende kodekropp.
    // Vi kan opprette objekter av vanlige klasser, mens abstrakte metoder ikke har noen implementert kode.
    // Abstrakte metoder tar derfor forutsetningen av de er definert i en klasse vi ikke kan opprette objekter av.
    public abstract double omkrets();

    public abstract double areal();

    // Overrider toString() metoden for å lage en "fin" utskrift for alle figur objekter.
    // Merk at vi her kan referere til omkrets() og areal() selv om kodelogikken ikke er definert i Figur.
    // Dette er fordi vi ikke kan opprette objekter av Figur-klassen direkte, så toString() vil alltid kalles
    // fra et objekt hvor omkrets() og areal() er implementert (som følge av abstract). Implementasjonene
    // for omkrets() og areal() som benyttes er derfor dynamisk basert på hvilken klasse objektet toString() kalles
    // fra.
    @Override
    public String toString() {
        return "Figuren er " + farge + ", har en omkrets på " +
                omkrets() + " og et areal på " + areal() + ".";
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }
}
