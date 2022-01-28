package no.hiof.oleedvao.forelesning06.models;

public class Kurs {

    private String kursNavn;
    private String kursKode;
    private int studiePoeng;

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
