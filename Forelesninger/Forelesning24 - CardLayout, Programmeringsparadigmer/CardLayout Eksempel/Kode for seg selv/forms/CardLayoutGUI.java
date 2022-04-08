package no.hiof.oleedvao.forelesning24.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel cardLayoutPanel;
    private JButton navigateToPage2Button;
    private JPanel page1Panel;
    private JPanel page2Panel;
    private JButton navigateToPage1Button;

    public CardLayoutGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        // Binder knappen i page1Panel til å "navigere" til page2Panel.
        // Med andre ord, vi oppdaterer cardLayoutPanel til å vise page2Panel når knappen trykkes.
        navigateToPage2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll(); // Fjerner alt innhold i cardLayoutPanel
                cardLayoutPanel.add(page2Panel); // Spesifiserer at vi nå skal vise page2Panel
                // disse to linjene oppdaterer GUI-et til å vise det nylig tillagte panelet (page2Panel)
                // i cardLayoutPanel
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }
        });

        // Binder knappen i page2Panel til å "navigere" til page1Panel.
        // Med andre ord, vi oppdaterer cardLayoutPanel til å vise page1Panel når knappen trykkes.
        navigateToPage1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayoutPanel.removeAll(); // Fjerner alt innhold i cardLayoutPanel
                cardLayoutPanel.add(page1Panel); // Spesifiserer at vi nå skal vise page1Panel
                // disse to linjene oppdaterer GUI-et til å vise det nylig tillagte panelet (page1Panel)
                // i cardLayoutPanel
                cardLayoutPanel.repaint();
                cardLayoutPanel.revalidate();
            }
        });
    }
}
