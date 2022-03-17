package no.hiof.oleedvao.forelesning18.tools;

import no.hiof.oleedvao.forelesning18.interfaces.FileHandler;

import java.io.*;

// Klasse som kan benyttes til å skrive til og lese String fra fil.
// Implementerer FileHandler interfacet og spesifiserer at den omhandlende datatypen skal være String
public class StringFileHandler implements FileHandler<String> {

    // Implementasjon av writeToFile()-metoden fra FileHandler-interfacet.
    // Legg merke til at den første inputparameteren er dynamisk definert ut fra datatypen vi spesifiserte at
    // FileHandler-implementasjonen skulle "omhandle" (String i dette tilfellet).
    @Override
    public void writeToFile(String s, File file) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            bufferedWriter.write(s);

        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

    }

    // Implementasjon av readFromFile()-metoden fra FileHandler-interfacet.
    // Legg merke til at return-typen er dynamisk definert ut fra datatypen vi spesifiserte at
    // FileHandler-implementasjonen skulle "omhandle" (String i dette tilfellet).
    @Override
    public String readFromFile(File file) {

        String returnString = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            while ( (line = bufferedReader.readLine()) != null) {
                returnString = returnString + "\n" + line;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnString;
    }

}
