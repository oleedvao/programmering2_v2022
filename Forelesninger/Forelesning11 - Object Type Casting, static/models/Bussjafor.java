package no.hiof.oleedvao.forelesning11.models;

public class Bussjafor extends Person{

    private String rute;

    public Bussjafor(String fornavn,
                     String etternavn,
                     int alder,
                     String rute) {
        super(fornavn, etternavn, alder);

        this.rute = rute;
    }

    public Bussjafor(String fornavn, String etternavn,
                     int alder) {
        super(fornavn, etternavn, alder);

        rute = "630 - Fredrikstad, Halden";
    }

    @Override
    public String toString(){
        return "Hei. Jeg heter " + fornavn + " " +
                etternavn + " og er " + alder
                + " år gammel. Min dedikerte rute er " +
                rute + ".";
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }
}
