// Implementerer Comparable for Spillbar slik at underobjekter av denne
// klassen kan sammenlignes (basert på navn)
// Vi må definere at det som Spilbar-objekter skal sammenlignes med er
// andre objekter av Spillbar (implements Comparable<Spillbar>).
public class Spillbar implements Comparable<Spillbar>{

    // Fullfører Comparable implementasjonen ved å override compareTo-metoden.
    // Merk at parameteren er at Spillbar-objekt.
    @Override
    public int compareTo(Spillbar o) {
        // Klassen String har også en compareTo-metode vi kan benytte for å
        // sammenligne to String-verdier. 
        return this.navn.compareTo(o.navn);
    }

}
