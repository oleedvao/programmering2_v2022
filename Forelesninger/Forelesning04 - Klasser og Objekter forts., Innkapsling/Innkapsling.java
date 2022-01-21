public class Innkapsling {

    public static void main(String[] args) {

        // Oppretter et objekt av StudentVer2-klassen
        StudentVer2 student = new StudentVer2();
        //System.out.println(student.studentId);

        //Setter instansvariabelen verdiene for student-objektet ved bruk av setter-metoder
        student.setStudentId("12345");
        student.setFornavn("Ole-Edvard");
        student.setEtternavn("Ørebæk");
        student.setAlder(24);

        // Skriver ut en beskrivelse av objektet.
        student.printBeskrivelse();

        // Henter ut objektets fødselsnummer.
        // Man på en annen side ikke sette denne verdien ettersom variabelen er
        // private og ikke har noen setter metode.
        System.out.println();
        System.out.println(student.getFodselsnummer());

    }
}
