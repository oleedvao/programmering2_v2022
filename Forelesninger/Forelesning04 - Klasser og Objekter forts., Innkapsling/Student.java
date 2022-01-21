// Klasse som definierer en custom datatype som representerer studenter.
public class Student {

    // En rekke med instansvariabler som alle objekter av klassen skal inneholde.
    // Disse er deklarert, men ikke initialisert, ettersom dette må gjøres i forbindelse med
    // hvert opprettede objekt.
    public String fornavn;
    public String etternavn;
    public int alder;
    public String studentId;

    // Metode som skriver ut en tekstlig beskrivelse av et gitt objekt av denne klassen.
    public void printBeskrivelse() {
        System.out.println("Hei. Jeg er en " + alder + " år gammel student med navn " +
                fornavn + " " + etternavn + ". Min studentid er " + studentId + ".");
    }

}
