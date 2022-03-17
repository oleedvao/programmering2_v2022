package no.hiof.oleedvao.forelesning18.tools;

import no.hiof.oleedvao.forelesning18.interfaces.FileHandler;
import no.hiof.oleedvao.forelesning18.models.Superhelt;

import java.io.File;

// Dummy-klasse som kan benyttes til å skrive til og lese Superhelt-objekter fra fil.
// Disclaimer: Denne klassen ble bare opprettet for å eksemplifisere hvordan generic interfaces
// kan benyttes med forskjellige typer data.
// Implementerer FileHandler interfacet og spesifiserer at den omhandlende datatypen skal være Superhelt
public class SuperheltFileHandler implements FileHandler<Superhelt> {

    // Implementasjon av writeToFile()-metoden fra FileHandler-interfacet.
    // Legg merke til at den første inputparameteren er dynamisk definert ut fra datatypen vi spesifiserte at
    // FileHandler-implementasjonen skulle "omhandle" (Superhelt i dette tilfellet).
    @Override
    public void writeToFile(Superhelt superhelt, File file) {

        // Kodelogikken er utelatt ettersom denne klassen bare ble benyttet for å eksemplifisere
        // hvordan generic interfaces kan benyttes med forskjellige typer data.

    }

    // Implementasjon av readFromFile()-metoden fra FileHandler-interfacet.
    // Legg merke til at return-typen er dynamisk definert ut fra datatypen vi spesifiserte at
    // FileHandler-implementasjonen skulle "omhandle" (Superhelt i dette tilfellet).
    @Override
    public Superhelt readFromFile(File file) {

        // Kodelogikken er utelatt ettersom denne klassen bare ble benyttet for å eksemplifisere
        // hvordan generic interfaces kan benyttes med forskjellige typer data.

        return null;
    }
}
