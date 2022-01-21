// Videreutvikling av Student-klassen
public class StudentVer2 {

    // En rekke med instansvariabler som alle objekter av klassen skal inneholde.
    // Disse er deklarert, men ikke initialisert, ettersom dette må gjøres i forbindelse med
    // hvert opprettede objekt.
    private String fornavn;
    private String etternavn;
    private int alder;
    private String studentId;

    // Fødselsnummer-variabel
    // (Vil i praksis være det samme for alle objekter.
    // Dette er ikke en god ting i dette tilfellet, men gjøres for å eksemplifisere
    // en variabel med bare leserettighet).
    private String fodselsnummer = "12345678910"; // Vi later som at denne er hentet fra eksterne kilder

    // Gettere og Settere for de private variablene.
    // Hvis vi skal hente ut eller endre instansvariablene, må vi benytte disse.
    public String getFodselsnummer() {
        return fodselsnummer;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getAlder() {
        return alder;
    }

    // Setter for alder-variabelen.
    // Har ekstra logikk som er fordelaktig å definere i setteren overfor å håndere utenfor objektet.
    // hadde vi gjort det, hadde vi kunnet endt opp med redundant kode som er slitsom å skrive og
    // vanskelig å godt vedlikeholde.
    public void setAlder(int alder) {
        //minst 0. max 120
        if (alder < 0 || alder > 120) {
            System.out.println("Alder må være mellom 0 og 120.");
        }
        else {
            this.alder = alder;
        }
    }

    // Metode som skriver ut en tekstlig beskrivelse av et gitt objekt av denne klassen.
    public void printBeskrivelse() {
        System.out.println("Hei. Jeg er en " + alder + " år gammel student med navn " +
                fornavn + " " + etternavn + ". Min studentid er " + studentId + ".");
    }
}
