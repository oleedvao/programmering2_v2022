// Definerer Video-klassen
public class Video extends Spillbar {
    private Lyd lyd;
    private BildeSekvens bildeSekvens;

    public Video(String navn, Lyd lyd, BildeSekvens bildeSekvens) {
        // Benytter en ny metode getLengsteVarighet() inline i super() for
        // å sende med den største varigheten mellom lyden og bildesekvensen.
        // Merk at dette er påkrevt at getLengsteVarighet() er static.
        super(navn, getLengsteVarighet(lyd, bildeSekvens));
        this.lyd = lyd;
        this.bildeSekvens = bildeSekvens;

    }

    public static int getLengsteVarighet(Lyd lyd, BildeSekvens bildeSekvens) {
        // Returnerer den lengste varigheten mellom et Lyd-objekt og et
        // BildeSekvens-objekt
        if (bildeSekvens.getVarighet() > lyd.getVarighet()) {
            return bildeSekvens.getVarighet();
        }
        else {
            return lyd.getVarighet();
        }
    }

    // Vi later som gettere og settere er inkludert. Jeg utelater det
    // fordi der er redundant i forhold til andre oppgaver.
}
