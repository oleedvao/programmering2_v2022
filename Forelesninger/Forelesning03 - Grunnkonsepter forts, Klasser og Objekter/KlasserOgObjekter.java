public class KlasserOgObjekter {

    public static void main(String[] args) {

        // Deklarasjon og initialisering av et student-objekt. Dette kan gjøres på to eller èn linje.
        //Student student1;
        //student1 = new Student();
        Student student1 = new Student();
        System.out.println(student1.fornavn); // skriver ut null ettersom variabelen ikke er initialisert

        // Initialiserer samtlige variabler for student-objektet
        student1.fornavn = "Ole-Edvard";
        student1.etternavn = "Ørebæk";
        student1.alder = 24;
        student1.studentId = "12345";

        // Skriver ut innholdet av samtlige variabler for student-objektet etter initialisering.
        System.out.println();
        System.out.println(student1.fornavn + "\n" +
                student1.etternavn + "\n" +
                student1.alder + "\n" +
                student1.studentId);

    }
}
