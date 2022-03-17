package no.hiof.oleedvao.forelesning18.interfaces;

import java.io.File;

// Generic interface som definerer en "kontrakt" på nødvendige metoder for en gitt klasse som skal kunne skrive/lese
// filer.
// Det som gjør interfacet generic er "større enn"/"mindre enn"-klammene hvor vi kan definere en generisk
// datatype vi ofte navngir T. At datatypen er generisk vil si at den foreløpig er ukjent, men skal spesifiseres ved
// ved implementasjon av interfacet.
public interface FileHandler<T> {

    // Abstrakt metode for å skrive "noe" til fil
    // Merk at første parameter for denne metoden er av den generiske datatypen T.
    void writeToFile(T t, File file);

    // Abstrakt metode for a lese "noe" fra fil og returnere det
    // Merk at return-typen for denne metoden er av den generiske datatypen T.
    T readFromFile(File file);
}
