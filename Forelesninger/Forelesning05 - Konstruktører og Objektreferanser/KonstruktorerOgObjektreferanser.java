// Hvis vi benytter en pakke må dette være inkludert på dette formatet.
package no.hiof.oleedvao.forelesning05;

// Vi må importere klassene vi benytter så lenge disse ikke ligger i samme filsti som
// klassen vi skriver i.
import no.hiof.oleedvao.forelesning05.models.Student;

public class KonstruktorerOgObjektreferanser {
    public static void main(String[] args) {

        // Eksempel på bruk av en Konstruktør
        // Oppretter et Student-objekt med fornavn lik "Ole-E", etternavn lik "Ørebæk", alder lik 24
        // og studentId lik "12345".
        // Med andre ord blir disse instansvariablene satt for objektet samtidig som vi opprettet objektet.
        Student student1 = new Student("Ole-E", "Ørebæk", 24, "12345");

        // Oppretter en ny variabel som holder på et Student-objekt, og setter objektet til å være det samme
        Student student2 = student1;

        student1.printBeskrivelse();
        student2.printBeskrivelse();

        // Endrer fornavn for student1-variablen.
        // Dette vil medføre at fornavnet også vil endres for student2 ettersom de "peker" på samme objekt.
        student1.setFornavn("Ole-Edvard");

        System.out.println();
        student1.printBeskrivelse();
        student2.printBeskrivelse();

        // Endrer fornavn, etternavn, alder og studentid for student2.
        // Dette vil medføre at dette også blir endret for student1 ettersom de "peker" på samme objekt.
        student2.setFornavn("Bill");
        student2.setEtternavn("Gates");
        student2.setAlder(66);
        student2.setStudentId("54321");

        System.out.println();
        student1.printBeskrivelse();
        student2.printBeskrivelse();

        // Opprettelse av et Student-objekt med fornavn "John", etternavn "Doe", alder 20,
        // og studentid "748392".
        // Dette objektet og verdiene som settes via konstruktøren er fullstendig uavhengig av tidligere
        // Student-objekter.
        System.out.println();
        Student student3 = new Student("John", "Doe", 20, "748392");
        student3.printBeskrivelse();
    }
}
