package no.hiof.oleedvao.forelesning17;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        skrivTilFil();

        lesFraFil();
    }


    // Metode for å lese fra fil og skrive ut inholdet til output
    public static void lesFraFil() {

        // Oppretter en try/catch clause for å lese fra fil.
        // Vi benytter dermed en FileReader for å lese individuelle tegn fra en spesifisert fil.
        try (FileReader fileReader = new FileReader("frainput.txt")) {

            // Det følgende er logikken for å lese individuelle tegn fra fil ved bruk av FileReader.
            // Vi mellomlagrer hver tegn i en int variabel ettersom dette er formattet tegnene blir
            // returnert av FileReader.
            int innhold;
            // Så lenge det finnes tegn i filen (så lenge det som returneres ikke er -1) skriver vi ut hvert tegn
            // (konvertert fra int til char format)
            while ( (innhold = fileReader.read()) != -1) {
                System.out.print((char) innhold);
            }


        } // Vi fanger opp eventuelle Exceptions og hånderer dem på en enkel måte (skrive ut melding/stack trace)
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }


    public static void skrivTilFil() {
        System.out.println("Skriv tekst her (skriv 'avslutt' for å avslutte):");

        String lestTekst = "";

        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fileWriter = new FileWriter("frainput.txt", true);
        ) {

            // Her er det blitt gjort en liten endring siden sist forelesning for å unngå at "avslutt" blir med
            // i filen.
            // Vi oppretter en variabel som representerer om vi skal forsette å lese fra input eller avslutte.
            boolean avslutt = false;
            // Så lenge vi ikke ikke skal avslutte gjør vi følgende:
            while (!avslutt) {
                System.out.print(": ");

                // leser neste linje fra input
                lestTekst = bufferedReader.readLine();

                // Sjekker om inputen er "avslutt""
                if (lestTekst.equals("avslutt")) {
                    // Hvis inputen er avslutt oppdaterer vi variabelen til å si at vi nå skal avslutte lesingen
                    // fra input.
                    // Dette vil sørge for at den gjeldene gjennomgangen av while-løkken også er den siste.
                    avslutt = true;
                }
                else {
                    // Hvis input er noe annet enn "avslutt", skriver vi inputen til fil
                    fileWriter.append(lestTekst + "\n");
                }
            }
        }
        catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}