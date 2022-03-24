package no.hiof.oleedvao.forelesning20.forms;

import javax.swing.*;

// Klasse som definerer "oppførselen" til MoonWeightGUI-vinduet.
// Merk at vi manuelt må definere denne klassen som et GUI-vindu ved å arve fra JFrame-klassen.
public class MoonWeightGUI extends JFrame{

    // Variabler som referer til GUI-elementer i MoonWeightGUI.form-filen. Altså i klassens tilhørende GUI-design.
    // Navnene på disse variablene er basert på "field name"-et på GUI-elementene i .form-filen.
    // Vi trenger ikke å tenke på å initialisere disse. Dette blir håndtert i bakgrunnen.
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;

    // Ved objekt-opprettelse av denne "GUI vindu"-klassen må vi konfigurere hvordan vinduet skal oppføre seg.
    // Dette gjør vi dermed i konstruktøren.
    public MoonWeightGUI(String title) {
        // Vi setter som regel vinduets tittel som parameter for konstruktøren og sender det opp til
        // JFrame (super-klassen) for videre håndtering.
        super(title);

        // Vi må sette en default operasjon for hva som skal skje når vi trykker på "lukkeknappen" i vinduet.
        // Vi setter denne operasjonen til å være at vinduet lukkes ved bruk av JFrame-konstanten EXIT_ON_CLOSE.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Vi må også sette innholdet av viduet (typisk i form av en JPanel).
        // I .form-filen har vi en JPanel som heter mainPanel, som inneholder alle GUI-elementene.
        // Vi setter derfor viduets innhold til å være mainPanel.
        this.setContentPane(mainPanel);
        // Vi konfigurer så hvordan størrelsen på vinduet skal håndteres.
        // Ved bruk av .pack()-metoden spesifiserer vi at vi ønsker at vinduet skal "wrappe" GUI-elementene.
        this.pack();
    }

}
