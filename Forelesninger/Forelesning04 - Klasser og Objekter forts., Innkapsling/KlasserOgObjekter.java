public class KlasserOgObjekter {

    public static void main(String[] args) {
        // Deklarasjon og initialisering av et student-objekt. Dette kan gjøres på to eller èn linje.
        //Student student1;
        //student1 = new Student();
        Student student1 = new Student();
        //System.out.println(student1.fornavn); // skriver ut null ettersom variabelen ikke er initialisert

        // Initialiserer samtlige variabler for student-objektet
        student1.fornavn = "Ole-Edvard";
        student1.etternavn = "Ørebæk";
        student1.alder = 24;
        student1.studentId = "12345";

        // Benytter en metode for å skrive ut en tekstlig beskrivelse
        student1.printBeskrivelse();

        // Oppretter og initialiserer et nytt objekt av Student-klassen
        System.out.println();
        Student student2 = new Student();
        //System.out.println(student2.fornavn);
        student2.fornavn = "Bill";
        student2.etternavn = "Gates";
        student2.alder = 66;
        student2.studentId = "54321";

        System.out.println();
        student2.printBeskrivelse();

        // Eksempel av utksrift hvis vi ikke benytter en metode
        /*
        System.out.println();
        System.out.println(student2.fornavn + "\n" +
                student2.etternavn + "\n" +
                student2.alder + "\n" +
                student2.studentId);

        // Skriver ut innholdet av samtlige variabler for student-objektet etter initialisering.
        System.out.println();
        System.out.println(student1.fornavn + "\n" +
                student1.etternavn + "\n" +
                student1.alder + "\n" +
                student1.studentId);

         */



        // Opretter og initialiserer et objekt av Kurs-klassen
        Kurs kurs = new Kurs();
        kurs.kursNavn = "Programmering 2";
        kurs.kursKode = "ITF10619";

        // Skriver ut informasjon om Kurs-objektet (på gammeldags måte)
        System.out.println();
        System.out.println(kurs.kursNavn + "\n" +
                kurs.kursKode);

    }
}
