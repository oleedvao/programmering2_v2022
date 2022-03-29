package no.hiof.oleedvao.forelesning21;

import no.hiof.oleedvao.forelesning21.forms.MoonWeightGUI;

public class MoonWeightMain {
    public static void main(String[] args) {
        // Oppretter og synligjør GUI-vinduet for å beregne månevekt.
        MoonWeightGUI moonWeightGUI = new MoonWeightGUI("Moon Weight");
        moonWeightGUI.setVisible(true);
    }
}
