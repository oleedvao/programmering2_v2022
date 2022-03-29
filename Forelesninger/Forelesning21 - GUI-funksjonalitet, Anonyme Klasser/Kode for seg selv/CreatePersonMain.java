package no.hiof.oleedvao.forelesning21;

import no.hiof.oleedvao.forelesning21.forms.CreatePersonGUI;

public class CreatePersonMain {
    public static void main(String[] args) {
        // Oppretter og synligjør GUI-vinduet for å opprette Person-objekter.
        CreatePersonGUI createPersonGUI = new CreatePersonGUI("Create Person");
        createPersonGUI.setVisible(true);
    }
}
