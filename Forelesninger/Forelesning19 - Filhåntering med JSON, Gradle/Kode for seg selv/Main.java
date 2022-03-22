package no.hiof.oleedvao.forelesning19;

// Importerer det eksterne biblioteket Jackson, som hjelper oss med håndtering av JSON.
// For at vi skal ha tilgang til denne klassen må vi spesifisere at vi skal implementere dette eksterne biblioteket
// i build.gradle.
import com.fasterxml.jackson.databind.ObjectMapper;
import no.hiof.oleedvao.forelesning19.models.Superhelt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Oppretter en superheltliste og fyller den opp med Superhelt-objekter
        ArrayList<Superhelt> superhelter = new ArrayList<>();

        superhelter.add(new Superhelt("Hulk",
                "Bruce Banner"));
        superhelter.add(new Superhelt("Wonder Woman",
                "Diana Prince"));

        // Batman er et Superhelt-objekt som også har et sidekick
        Superhelt batman = new Superhelt("Batman",
                "Bruce Wayne");
        batman.getSidekicks().add(new Superhelt("Robin",
                "Jason Todd"));
        superhelter.add(batman);

        // Vi skriver ut Superhelt-objektene for å få en initiell oversikt.
        for (Superhelt s : superhelter) {
            System.out.println(s);
        }

        // File-objekt som representerer filen vi ønsker å skrive og lese til.
        File JSONFil = new File("superhelter.json");

        // Skriver ArrayListen med Superhelt-objekter til JSON-fil.
        skrivTilJSONFil(superhelter, JSONFil);

        // Leser fra JSON-fil og returnerer innholdet som en ArrayList med Superhelt-objekter. Skriver deretter
        // ut innholdet.
        ArrayList<Superhelt> superhelterLestFraFil = lesFraJSONFil(JSONFil);
        System.out.println();
        for (Superhelt s : superhelterLestFraFil) {
            System.out.println(s);
        }
    }

    // Metode for å skrive en ArrayList med Superhelt-objekter til en fil med JSON-format.
    public static void skrivTilJSONFil(ArrayList<Superhelt> superhelter, File fil) {

        // Oppretter et ObjektMapper-objekt. Denne klassen kommer fra det eksterne biblioteket, Jackson, og har
        // en rekke med metoder som kan hjelpe oss med håndtering av JSON.
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Vi skriver her ArrayListen med Superhelt-objekter til fil med JSON-format
            // Vi gjør dette spesifikt med ObjectMapper sin writeValue()-metode, som tar filen vi ønsker å skrive til
            // som første parameter, og hva vi ønsker å skrive til den som andre paramter.
            // Hvis vi ønsker å få innholdet i JSON-filene på et litt penere format kan vi først kalle
            // writerWithDefaultPrettyPrinter()-metoden, og deretter writeValue()-metoden på den.
            // writeValue()-metoden kan forøvrig gi en IOException, så vi legger denne linjen inn i en try/catch-clause
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(fil, superhelter);

        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

    // Metode for å lese en JSON-fil og returnere innholdet som en ArrayList med Superhelt-objekter
    public static ArrayList<Superhelt> lesFraJSONFil(File fil) {
        // Oppretter en tom liste som vi skal fylle opp med Superhelt-objekter
        ArrayList<Superhelt> returnListe = new ArrayList<>();

        // Oppretter et ObjektMapper-objekt. Denne klassen kommer fra det eksterne biblioteket, Jackson, og har
        // en rekke med metoder som kan hjelpe oss med håndtering av JSON.
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Vi leser her innholdet av JSON-filen som en array med Superhelt-objekter.
            // Vi spesifiserer dette ved å benytte ObjectMapper sin readValue() metode som tar to parametere.
            // Den første parameteren sier hvilken fil det skal leses fra, og den andre parameteren sier
            // Hva innholdet av filen skal tolkes (og returneres) som. Vi har ikke mulighet til å tolke
            // innholdet direkte som en ArrayList med Superhelt-objekter, så vi sier at vi skal tolke det
            // som en array med Superhelt-objekter i stedet.
            // readValue()-metoden kan forøvrig gi IOException, så vi legger til denne linjen i en try/catch-clause.
            Superhelt[] superheltArray = objectMapper.readValue(fil, Superhelt[].class);

            // Vi benytter ArrayList sin addAll()-metode for å legge til alle objektene i arrayen til retur-listen.
            // Denne metoden krever på en annen side at det som sendes inn er en type Collection, så vi
            // konverterer derfor Superhelt-arrayen til en Liste ved bruk av Arrays.asList().
            returnListe.addAll(Arrays.asList(superheltArray));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Returnerer listen med Superhelt-objekter lest fra JSON-fil
        return returnListe;
    }



}
