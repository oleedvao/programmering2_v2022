// Definerer Video-klassen
public class Video extends Spillbar {
    private Lyd lyd;
    private BildeSekvens bildeSekvens;

    public Video(String navn, Lyd lyd, BildeSekvens bildeSekvens) {
        this.lyd = lyd;
        this.bildeSekvens = bildeSekvens;

        // Sjekker om lyden eller bildesekvensens varighet er størst, setter
        // den største verdien til å være den gjeldene.
        int varighet = 0;
        if (bildeSekvens.getVarighet() > lyd.getVarighet()) {
            varighet = bildeSekvens.getVarighet();
        }
        else {
            varighet = lyd.getVarighet();
        }

        // Sender de endelige verdiene opp til Spillbar sin konstruktør.
        super(navn, varighet);
    }

    // Vi later som gettere og settere er inkludert. Jeg utelater det
    // fordi der er redundant i forhold til andre oppgaver.
}
