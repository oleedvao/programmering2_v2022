package no.hiof.oleedvao.forelesning21.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoonWeightGUI extends JFrame{

    // Referanser til GUI-elementer i MoonWeightGUI.form
    // Disse kan benyttes som vanlige objekter, selv om de tilsynelatende ikke er initialisierte (Dette er automatisk
    // håndtert av Swing).
    private JPanel mainPanel;
    private JTextField weightOnEarthField;
    private JButton convertButton;
    private JLabel weightOnTheMoonLabel;

    public MoonWeightGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        // Denne kodeblokken konfigurerer hva som skal skje når knappen med field name "convertButton" blir trykket.
        // Vi gjør dette spesifikt gjennom addActionListener()-metoden som tar et ActionListener-objekt som parameter.
        // ActionListener er spesifikt et interface med én metode actionPerformed(), så objektet må dermed ha en
        // implementasjon av actionPerformed(). Det er denne metoden fra dette objektet som kalles når convertButton
        // blir trykket. For å holde koden konsis benytter vi her prinsippet med anonyme klasser til å opprette og
        // definere implementasjonen av actionPerformed() i samme handling. Det er dermed det vi definerer
        // innenfor actionPerformed-overriden som er koden som utføres for et gitt knappetrykk.
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Vi starter med å hente ut teksten i inputfeltet for å spesifisere vekt på jorden
                String weightOnEarthText = weightOnEarthField.getText();

                // Vi konverterer så teksten vi hentet ut fra tekstfeltet til en double verdi.
                double weightOnEarth = Double.parseDouble(weightOnEarthText);

                // Vi benytter tallet vi fikk som input til å beregne vekten på månen.
                double weightOnTheMoon = weightOnEarth * 0.165;

                // Til slutt konverterer vi den beregnede vekten på månen tilbake til tekst og setter inholdet
                // av "output-labelen", weightOnTheMoonLabel, til denne verdien.
                weightOnTheMoonLabel.setText(Double.toString(weightOnTheMoon));
            }
        });
    }

}
