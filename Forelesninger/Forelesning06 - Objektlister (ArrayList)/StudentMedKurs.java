package no.hiof.oleedvao.forelesning06;

import no.hiof.oleedvao.forelesning06.models.Kurs;
import no.hiof.oleedvao.forelesning06.models.Student;

public class StudentMedKurs {
    public static void main(String[] args) {
        // Oppretter et Student-objekt
        Student student = new Student("Ole-Edvard", "Ørebæk", 24, "12345");
        //System.out.println(student.getKurs());
        //System.out.println(student.getKurs().size());
        System.out.println(student.getAntallKurs()); // Benytter metode for å hente ut antall kurs studenten har

        // Oppretter et Kurs-objekt
        Kurs kurs1 = new Kurs("Programmering 2", "ITF10619", 10);
        //kursListe.add(kurs1)
        //student.getKurs().add(kurs1);
        student.leggTilKurs(kurs1); // Benytter metode for å legge til kurs i stedet for å gjøre dette gjennom en
        // get-metode som returnerer hele liste-objektet.

        System.out.println();
        //System.out.println(student.getKurs().size());
        System.out.println(student.getAntallKurs());

        //student.getKurs().add( new Kurs("Databasesystemer", "ITF10319", 10) );
        //Benytter metode for å legge til kurs. Objektet blir opprettet direkte som input
        student.leggTilKurs(new Kurs("Databasesystemer", "ITF10319", 10));

        System.out.println();
        /*
        for (Kurs xKurs : student.getKurs()) {
            System.out.println(xKurs.getKursNavn());
        }
         */
        // Benytter metode for å skrive ut samtlige kursnavn studenten har, i stedet for å skrive for-løkken.
        student.printKursNavn();

        System.out.println();
        student.leggTilKurs(kurs1);

        /*
        for (Kurs xKurs : student.getKurs()) {
            System.out.println(xKurs.getKursNavn());
        }
         */
        student.printKursNavn();
    }
}
