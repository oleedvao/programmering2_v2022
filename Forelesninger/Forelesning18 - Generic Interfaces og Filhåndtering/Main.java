package no.hiof.oleedvao.forelesning18;

import no.hiof.oleedvao.forelesning18.tools.StringFileHandler;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        // Oppretter en tekststreng vi ønsker å skrive til fil.
        String randomText = "Hei dette er tilfeldig text. \n" +
                "Kult ikke sant? \n";

        // Vi oppretter et StringFileHanlder-objekt som kan hjelpe oss å skrive til og lese tekst fra fil.
        StringFileHandler stringFileHandler = new StringFileHandler();

        // Et File-objekt som representerer hvilken fil vi ønsker å skrive til og lese fra.
        File file = new File("randomtext.txt");

        // Benytter StringFileHandler-objektet til å skrive teksten til fil.
        stringFileHandler.writeToFile(randomText, file);

        // Lester teksten fra fil og skriver det ut til output.
        System.out.println(stringFileHandler.readFromFile(file));


    }
}
