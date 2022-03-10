package no.hiof.oleedvao.forelesning16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.println("Skriv tekst her (skriv 'avslutt' for å avslutte):");

        // Variabel for å midlertidig holde på tekstlinjer lest fra input.
        String lestTekst = "";

        // Dette er en try (with resources) block.
        // Denne blokken inneholder kode vi som programmerere, samt Java, vet kan gi en eller flere
        // Exceptions.
        // Parantesen knyttet til try blokken, altså 'try (...)', spesifisere de ressursene vi ønsker å benytte
        // for try logikken. Disse ressursene vil automatisk lukkes etter try-blokken er ferdig eller en Exception
        // har forekommet. Disse ressursene kan typisk være slikt som stream-objekter.
        try (
                // Stream objektene vi benytter (vil automatisk lokkes ettersom de er definert som ressurser for
                // try-blokken).

                // BufferedReader er en type stream som hjelper oss å lese "noe" linje for linje.
                // Den krever at vi også sender med et StreamReader-objekt (som leser tegn for tegn) den kan benytte.
                // Vi benytter her spesifikt InputStreamReader, som leser tegn fra en input stream. Vi spesifiserer
                // at den gjeldende input streamen skal være IntelliJ sin input fra konsoll (System.in).
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                // FileWriter er en type stream som hjelper oss å skrive til fil. Hvis vi spesifiserer append som
                // true vil denne streamen legge til tekst til den gitte filen. Hvis false, eller ikke spesifisert,
                // vil filen overskrives.
                // Denne oppretter også filen automatisk hvis den ikke finnes fra før av.
                // String verdien representerer filnavnet/-stien vi ønsker skal gjelde. Hvis vi bare skriver et
                // filnavn vil filen opprettes/leses fra roten av intellij prosjektet altså direkte under
                // prosjektmappen.
                FileWriter fileWriter = new FileWriter("frainput.txt", true);
                ) {

            // While løkke som avsluttes brukeren skriver 'avslutt'.
            // Altså logikken for hvordan vi skal lese hver linje fra input og skrive den til fil.
            while (lestTekst.equals("avslutt") == false) {
                System.out.print(": ");

                // Vi benytter BufferedReader-streamen til å oppdatere lestTest-variabelen til den siste linjen
                // lest fra input.
                lestTekst = bufferedReader.readLine();

                // Vi benytter FileWriter-streamen til å legge til den sist leste tekstlinjen fra input.
                fileWriter.append(lestTekst + "\n");

            }
        }
        // Dette er en catch-blokk.
        // I denne kan vi spesifisere hva for slags type exception vi ønsker å håndtere (hvilket type Exeption-objekt)
        // og skrive kode logikk for hvordan vi øsnker å håndtere den.
        catch (IOException ioException) {
            // I dette tilfellet hånderer vi en IOException som vi fikk bskjed kan komme
            // fra FileWriter.

            // Vi hånderer en IOException i dette tilfellet ved å enkelt skrive ut en error melding til output.
            System.err.println(ioException.getMessage());
        }
        // Dette er en finally-blokk.
        // Denne benyttes til å utføre en rekke kode sammenknyttet, men uavhengig av try- og catch-blokkene før.
        // finally-blokken vil med andre ord kjøre uavhengig av hva som skjer i try- og catch-blokkene.
        finally {
            // Vi kunne tenkt oss at vi her kunne benyttet finally blokken til å lukke streamene, men vi fant ut at
            // Dette ga en rekke med problemer og at det generelt var smartere å definere streamene som ressurser
            // for try-blokken (som vil lukke streamene automatisk).

            /*
            fileWriter.close();
            bufferedReader.close();
             */
        }


    }
}
