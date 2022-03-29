package no.hiof.oleedvao.forelesning21.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePersonGUI extends JFrame {

    // Referanser til GUI-elementer i CreatePersonGUI.form
    // Disse kan benyttes som vanlige objekter, selv om de tilsynelatende ikke er initialisierte (Dette er automatisk
    // håndtert av Swing).
    private JPanel mainPanel;
    private JTextField fullNameField;
    private JTextField ageField;
    private JButton createPersonButton;

    public CreatePersonGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        // Denne kodeblokken konfigurerer hva som skal skje når knappen med field name "createPersonButton" blir trykket.
        // Vi gjør dette spesifikt gjennom addActionListener()-metoden som tar et ActionListener-objekt som parameter.
        // ActionListener er spesifikt et interface med én metode actionPerformed(), så objektet må dermed ha en
        // implementasjon av actionPerformed(). Det er denne metoden fra dette objektet som kalles når convertButton
        // blir trykket. For å holde koden konsis benytter vi her prinsippet med anonyme klasser til å opprette og
        // definere implementasjonen av actionPerformed() i samme handling. Det er dermed det vi definerer
        // innenfor actionPerformed-overriden som er koden som utføres for et gitt knappetrykk.
        createPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Det er her vi kommer til å definere kodelogikken for knappetrykk. (Blir gjennomgått i neste
                // forelesning)
            }
        });
    }
}
