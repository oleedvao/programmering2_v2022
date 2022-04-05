package no.hiof.oleedvao.forelesning23.forms;

import no.hiof.oleedvao.forelesning23.models.Person;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePersonGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField fullNameField;
    private JTextField ageField;
    private JButton createPersonButton;
    private JList<Person> personJList;
    private JButton editPersonButton;
    private JButton deletePersonButton;

    private DefaultListModel<Person> personListModel = new DefaultListModel<>();

    public CreatePersonGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        personJList.setModel(personListModel);

        createPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Når vi forsøker å opprette et Person-objekt og legge det til i JListen kan vi støte på problemet
                // at brukeren ikke spesifiserer et tall for Age-feltet. I så fall vil vi få en NumberFormatException
                // når vi forsøker å konverte innholdet i Age-feltet til en int-verdi.
                // Ettersom hele prossessen av å opprette et Person-objekt er avhengig av verdiene hentet fra input-
                // feltene, omfavner vi hele logikken i en try-blokk og fanger opp en eventuell NumberFormatException
                // i catch-blokken.
                try {
                    String fullName = fullNameField.getText();
                    int age = Integer.parseInt(ageField.getText());

                    Person createdPerson = new Person(fullName, age);

                    personListModel.addElement(createdPerson);
                } catch (NumberFormatException numberFormatException) {
                    // Hvis det forekommer en NumberFormatException, skriver vi ut en enkel melding til output
                    // om at formatet for Age-feltet er feil.
                    // Egentlig burde vi vise denne meldingen direkte i GUI-vinduet, men vi holder det enkelt og
                    // ikke gjør dette for dette eksemepelet.
                    System.out.println("You must provide an int value for Age.");
                }

            }
        });

        editPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Når vi forsøker å endre et Person-objekt, kan i igjen støte på problemet at brukeren ikke
                // spesifiserer et tall for Age-feltet, som vil føre til en NumberFormatException når vi forsøker å
                // konvertere innholdet til en int-verdi. Vi kan også få et problem når vi forsøker å redigere,
                // men ikke har selektert et objekt i JListen. Vi vil da få en NullPointerException ettersom
                // objektet vi ønsker å redigere ikke er selektert og dermed er ukjent for Java.
                // Vi kan derfor heller ikke kalle metoder som .setFullName() eller setAge() på dette objektet ettersom
                // det er "null".
                // Vi omfavner koden i en try-blokk og fanger de eventeulle NumberFormat- og NullPointerException-ene.
                try {
                    String fullName = fullNameField.getText();
                    int age = Integer.parseInt(ageField.getText());

                    Person selectedPerson = personJList.getSelectedValue();
                    selectedPerson.setFullName(fullName);
                    selectedPerson.setAge(age);

                    personJList.updateUI();
                }
                // Vi hånderer her hver type exception med en enkel og beskrivende utskrift til output.
                catch (NumberFormatException numberFormatException) {
                    System.out.println("You must provide an int value for Age.");
                } catch (NullPointerException nullPointerException) {
                    System.out.println("No object selected.");
                }

            }
        });

        // Håndterer knappetrykk til å slette det selekterte Person-objektet i JList-en
        deletePersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Når vi sletter et Person-objekt må vi hente ut indexen av det selekterte objektet.
                // Hvis listen er tom eller ingen av objektene er selektert vil det forekomme en
                // IndexOutOfBoundsException. Vi omfavner derfor koden i en try-blokk og fanger denne exceptionen.
                try {
                    //Vi henter ut indexen av det selekterte Person-objektet i JList-en
                    int selectedIndex = personJList.getSelectedIndex();

                    // Fjerner det selekterte objektet basert på index
                    personListModel.remove(selectedIndex);

                    // Tvinger JList-en til å visuelt oppdatere seg
                    personJList.updateUI();
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    // Vi hånderer exceptionen med en enkel og beskrivende utskrift til output.
                    System.out.println("Selected index does not exist.");
                }

            }
        });

        personJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                // Hvis det forekommer en endring i JList-seleksjonen, vil denne kodesekvensen utføres.
                // Det vil da forsøkes å hente ut det selekterte Person-objektet.
                // Det kan forekomme enkelte situasjoner hvor det skjer en endring i seleksjonen uten brukerens input.
                // For eksempel kan dette skje ved sletting av objekter. I dette tilfellet vil Swing automatisk
                // forsøke å selktere et objekt som ikke lenger eksisterer. Det kan dermed forekomme en
                // NullPointerException når vi sletter objektet og oppdaterer listen. Vi omfavner derfor kodesekvensen
                // i en try-blokk og håndterer eventuelle exceptions.
                try {
                    Person selectedPerson = personJList.getSelectedValue();

                    fullNameField.setText(selectedPerson.getFullName());
                    ageField.setText(Integer.toString(selectedPerson.getAge()));
                } catch (NullPointerException nullPointerException) {
                    // Vi hånderer exceptionen med en enkel og beskrivende utskrift til output.
                    System.out.println("No object selected.");
                }


            }
        });
    }
}
