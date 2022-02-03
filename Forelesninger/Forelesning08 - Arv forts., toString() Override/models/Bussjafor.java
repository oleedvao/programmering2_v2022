package no.hiof.oleedvao.forelesning08.models;

// Klasse som representerer bussjåfører. Arver fra Person-klassen
public class Bussjafor extends Person{

    private String rute;

    public Bussjafor(String fornavn,
                     String etternavn,
                     int alder,
                     String rute) {
        super(fornavn, etternavn, alder);

        this.rute = rute;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }
}
