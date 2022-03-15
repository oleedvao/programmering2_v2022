package no.hiof.oleedvao.forelesning17;

import no.hiof.oleedvao.forelesning17.models.Superhelt;

import java.io.*;
import java.util.ArrayList;

public class MainCSV {
    public static void main(String[] args) {

        // Vi oppretter et File-objekt som vi kan benytte i senere metoder for å skive til og lese fra CSV fil.
        File fil = new File("superhelter.csv");

        // Vi oppretter en liste med Superhelt-objekter for å ha litt data vi kan skrive til fil med CSV-format.
        ArrayList<Superhelt> superhelter = new ArrayList<>();
        superhelter.add(new Superhelt("Superman", "Clark Kent"));
        superhelter.add(new Superhelt("Hulk", "Bruce Banner"));
        superhelter.add(new Superhelt("Batman", "Bruce Wayne"));
        superhelter.add(new Superhelt("Wonder Woman", "Diana Prince"));

        // Skriver listen med superhelter til fil med CSV-format. Se metode-definisjonen for en mer detaljert beskrivelse.
        skrivTilCSV(superhelter, fil);

        // Oppretter en liste med Superhelt-objekter ved å lese en CSV-fil og hver innehold linje som
        // et unikt Superhelt-objekt. Se metode-definisjon for en mer detaljert beskrivelse.
        ArrayList<Superhelt> superhelterLestFraCSV = lesFraCSV(fil);
        // Skriver ut en enkel beskrivelse for hvert Superhelt-objekt vi hentet ut fra CSV-filen.
        for (Superhelt superhelt : superhelterLestFraCSV) {
            System.out.println("Navn: " + superhelt.getNavn() +
                    ", Alter ego: " + superhelt.getAlterEgo());
        }
    }


    // Metode for å opprette og returnere en liste med Superhelt-objekter basert på
    public static ArrayList<Superhelt> lesFraCSV(File fil) {

        // Initialiserer en tom liste vi skal fylle opp med Superhelt-objekter og til syvende og sist returnere.
        ArrayList<Superhelt> returListe = new ArrayList<>();

        // Logikk for å benytte en BufferedReader stream for å lese en CSV-fil linje for linje.
        // Vi er tvunget til å håndtere Eventuelle exceptions som kan oppstå.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fil))) {

            // Variabel for å mellomlagre hver linje vi leser fra filen.
            String linje;
            // Så lenge det finnes gjenværende linjer i filen (så lenge den hentede linjen ikke er null)
            while ( (linje = bufferedReader.readLine()) != null) {

                // Vi splitter verdiene i den nylig uthentede linjen basert på skilletenget (i dette tilfellet,
                // semikolon). Vi får dermed disse separerte verdiene som en String-Array.
                String[] verdier = linje.split(";");

                // Med verdiene i linjen hentet ut, kan vi benytte dem til å opprette et Superhelt-objekt.
                // Siden vi vet at verdiene kommer i rekkefølgen Navn;AlterEgo, kan vi sende inn første verdi som
                // parameter for Superhelt-objektets navn, og andre parameter som alter ego.
                Superhelt superhelt = new Superhelt(verdier[0], verdier[1]);

                // Vi legger til det nylig opprettede Superhelt-objektet i returlisten.
                returListe.add(superhelt);
            }

        } // Vi håndterer eventuelle Exceptions som kan forekomme på grunnlag av de benyttede stream-ene.
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Når vi er ferdig med å lese fra filen, returnerer vi listen med Superhelt-objekter.
        return returListe;
    }


    // Metode for å skrive en liste med Superhelt-objekter til en fil på CSV-format.
    public static void skrivTilCSV(ArrayList<Superhelt> superheltListe, File fil) {

        // Logikk for å benytte en BufferedWriter-stream for å skrive individuelle Superhelt-objekter som individuelle
        // linjer i en fil med CSV-format.
        // Vi er tvunget til å håndtere Eventuelle exceptions som kan oppstå.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fil))) {

            // For hvert Superhelt-objekt i listen vi får som parameter skriver vi en tekststreng til filen med
            // CSV-format. Spesifikt med formatet: Navn;Alter Ego
            for (Superhelt superhelt : superheltListe) {
                bufferedWriter.write(superhelt.getNavn() + ";" + superhelt.getAlterEgo());
                bufferedWriter.newLine();
            }

        } // Vi håndterer eventuelle Exceptions som kan forekomme på grunnlag av de benyttede stream-ene.
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
