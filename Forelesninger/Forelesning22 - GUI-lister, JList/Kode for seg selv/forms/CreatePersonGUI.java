package no.hiof.oleedvao.forelesning22.forms;

import no.hiof.oleedvao.forelesning22.models.Person;

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
    private JList<Person> personJList; // <-- JList-en i GUI-designet. Vi konfigurerer den spesifikt til å holde på og
    // presentere Person-objekter
    private JButton editPersonButton;
    //private JLabel outputLabel;

    // Oppretter en ListModel som vil holde på JList-ens objekter.
    // Det er denne vi gjør operasjoner på hvis vi ønsker å modifisere innholdet av JListen.
    // Vi må forøvrig også konfigurere JList-en til å benytte denne ListModel-en (Se konstruktøren under).
    private DefaultListModel<Person> personListModel = new DefaultListModel<>();

    public CreatePersonGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        // Vi konfigurerer JList-en til å benytte den tidligere opprettede ListModel-en for å presentere inneholdte
        // objekter.
        personJList.setModel(personListModel);

        // Definerer hva som skal utføres når vi trykker på "Create Person"-knappen.
        // (Oppretter ett nytt Person-objekt basert på input-feltene og legger det til i JList-en)
        createPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Henter ut navn og alder fra intput-feltene
                String fullName = fullNameField.getText();
                int age = Integer.parseInt(ageField.getText());

                // Benytter verdiene fra input-feltene til å opprette et Person-objekt
                Person createdPerson = new Person(fullName, age);

                //outputLabel.setText(createdPerson.toString());

                // Legger til det opprettede Person-objektet i JList-en ved å legge til objektet til JList-ens
                // ListModel.
                personListModel.addElement(createdPerson);
            }
        });

        // Definerer hva som skal utføres når vi trykker på "Edit Person"-knappen
        // (Endrer navn og alder for det selekterte Person-objektet i JList-en til det spesifisert i input-feltene)
        editPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Henter ut navn og alder fra intput-feltene
                String fullName = fullNameField.getText();
                int age = Integer.parseInt(ageField.getText());

                // Henter ut en referanse til det selekterte Person-objektet i JList-en og oppdaterer dets navn og
                // alder til verdiene gitt i input-feltene.
                Person selectedPerson = personJList.getSelectedValue();
                selectedPerson.setFullName(fullName);
                selectedPerson.setAge(age);

                // Tvinger JList-en til å visuelt oppdatere seg
                personJList.updateUI();
            }
        });

        // Definerer hva som skal utføres når vi selekterer et Person-objekt i JList-en.
        // (Setter inn det selekterte Person-objektets navn og alder i de tilsvarende input-feltene.)
        personJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                // Henter ut en referanse til det selekterte Person-objektet.
                Person selectedPerson = personJList.getSelectedValue();

                // Oppdaterer input-feltenes innhold til det selekterte Person-objektets navn og alder.
                fullNameField.setText(selectedPerson.getFullName());
                ageField.setText(Integer.toString(selectedPerson.getAge()));

            }
        });
    }
}
