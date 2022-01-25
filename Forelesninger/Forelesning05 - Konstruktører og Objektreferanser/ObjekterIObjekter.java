// Hvis vi benytter en pakke må dette være inkludert på dette formatet.
package no.hiof.oleedvao.forelesning05;

// Vi må importere klassene vi benytter så lenge disse ikke ligger i samme filsti som
// klassen vi skriver i.
import no.hiof.oleedvao.forelesning05.models.Kurs;
import no.hiof.oleedvao.forelesning05.models.Student;

public class ObjekterIObjekter {

    public static void main(String[] args) {

        // Oppretter et nytt Kurs-objekt og setter instansvariablene for kursNavn,
        // kursKode og studiePoeng ved bruk av konstruktøren.
        Kurs kurs1 = new Kurs("Programmering 2", "ITF10619", 10);
        //kurs1.printBeskrivelse();

        // Oppretter et Student-objekt (setter ikke kurs via konstruktøren).
        System.out.println();
        Student student = new Student("Ole-Edvard", "Ørebæk", 24, "12345");
        // Setter studentens kurs ved å sende inn et Kurs-objekt som parameter til .setKurs()-metoden
        student.setKurs(kurs1);
        // Skriver ut en beskrivelse for Student-objektets inneholdt Kurs-Objekt
        // ved å benytte Kurs-objektets .printBeskrivelse()-metode.
        student.getKurs().printBeskrivelse();
    }

}
