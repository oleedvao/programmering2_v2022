package no.hiof.oleedvao.forelesning19.models;

import java.util.ArrayList;

// Klasse som representerer Superhelter
public class Superhelt {

    private String navn;
    private String alterEgo;
    // Utover String-variablene for navn og alter ego kan et gitt Superhelt-objekt ha en rekke sidekicks i
    // form av en ArrayListe med Superhelt objekter. Dette gjør at vi kan få tilfeller hvor objeker "inneholder"
    // objekter. Altså en hirarkisk objekt-struktur.
    private ArrayList<Superhelt> sidekicks = new ArrayList<>();

    // For at Jackson skal kunne oversette JSON-objekter til Java-objekter (i dette tilfellet Superhelter)
    // kreves det at det finnes en tom konstruktør. Dette er nødvendig fordi Jackson spesifikt er programmert
    // til å først opprette tomme objekter og deretter fylle inn innholdet av disse objektene gjennom setter-metodene.
    public Superhelt() {

    }

    public Superhelt(String navn, String alterEgo) {
        this.navn = navn;
        this.alterEgo = alterEgo;
    }

    @Override
    public String toString() {
        return "Navn: " + navn + ", alter ego: " + alterEgo +
                " sidekicks: " + sidekicks;
    }


    // For at Jackson skal kunne konvertere objekter til og fra JSON-format må vi ha public getter- og setter-metoder
    // for alle variabler.
    // Generering av nøkler og verdier i JSON blir spesifikt gjort ved bruk av disse metodene, og tolkningen av
    // hvilke verdier som er hvilke variabler i objekene tolkes ut ifra setter-metodene.
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAlterEgo() {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    public ArrayList<Superhelt> getSidekicks() {
        return sidekicks;
    }

    public void setSidekicks(ArrayList<Superhelt> sidekicks) {
        this.sidekicks = sidekicks;
    }
}
