// Hvis vi benytter en pakke må dette være inkludert på dette formatet.
package no.hiof.oleedvao.forelesning05.models;

public class Kurs {

    private String kursNavn;
    private String kursKode;
    private int studiePoeng;

    // Konstruktør for Kurs-klassen, som setter instansvariabler ved oprettelse av nye Kurs-objekter.
    // Krever at verdier for kursNavn, kursKode og studiePoeng må spesifiseres ved
    // opprettelse av nye Student-objekter, basert på parameterene.
    // De verdiene som sendes med som parametere for et en gitt objekt-opprettelse vil gjelde for det spesifikke
    // objektet.
    public Kurs(String kursNavn, String kursKode, int studiePoeng) {
        this.kursNavn = kursNavn;
        this.kursKode = kursKode;
        this.studiePoeng = studiePoeng;
    }

    public void printBeskrivelse() {
        System.out.println("Kursnavn: " + kursNavn + "\n" +
                "Kurskode: " + kursKode + "\n" +
                "Studiepoeng: " + studiePoeng);
    }

    public String getKursNavn() {
        return kursNavn;
    }

    public void setKursNavn(String kursNavn) {
        this.kursNavn = kursNavn;
    }

    public String getKursKode() {
        return kursKode;
    }

    public void setKursKode(String kursKode) {
        this.kursKode = kursKode;
    }

    public int getStudiePoeng() {
        return studiePoeng;
    }

    public void setStudiePoeng(int studiePoeng) {
        this.studiePoeng = studiePoeng;
    }
}
