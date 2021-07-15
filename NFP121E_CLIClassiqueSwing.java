package NFP121E;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CLIClassiqueSwing {

    final JFrame window = new JFrame("IHM pour CLI");
    final private JButton creuse = new JButton("Creuse (C)");
    final private JButton pleine = new JButton("Pleine (P)");
    final private JButton ajouterK = new JButton("+");
    final private JButton ajouterA = new JButton("+");
    final private JButton ajouterE = new JButton("+");

    final private JTextField textK = new JTextField(10);
    final private JTextField textA = new JTextField(10);
    final private JTextField textE = new JTextField(10);

    final private JTextField cliDisplay = new JTextField(50);

    public CLIClassiqueSwing() {
        Container c = window.getContentPane();
        c.setLayout(new BorderLayout());

        JPanel boutons = new JPanel(new FlowLayout());
        boutons.add(creuse);
        boutons.add(pleine);
        c.add(boutons, BorderLayout.NORTH);

        JPanel informations = new JPanel(new GridLayout(3,3));
        informations.add(new JLabel("Valeur de l'indice (K)", SwingConstants.RIGHT));
        informations.add(textK);
        informations.add(ajouterK);
        informations.add(new JLabel("Valeur de l'alpha (A)", SwingConstants.RIGHT));
        informations.add(textA);
        informations.add(ajouterA);
        informations.add(new JLabel("Valeur de l'epsilon (E)", SwingConstants.RIGHT));
        informations.add(textE);
        informations.add(ajouterE);
        c.add(informations, BorderLayout.CENTER);

        c.add(cliDisplay, BorderLayout.SOUTH);

        creuse.addActionListener(new ActionAjouterCreuse());
        pleine.addActionListener(new ActionAjouterPleine());
        ajouterK.addActionListener(new ActionAjouterK());
        ajouterA.addActionListener(new ActionAjouterA());
        ajouterE.addActionListener(new ActionAjouterE());


        window.pack();
        window.setVisible(true);
    }

    private class ActionAjouterCreuse implements  ActionListener {
        public void actionPerformed(ActionEvent ev) {
            String oldCLI = cliDisplay.getText();
            cliDisplay.setText(oldCLI + "-C ");
        }
    }

    private class ActionAjouterPleine implements  ActionListener {
        public void actionPerformed(ActionEvent ev) {
            String oldCLI = cliDisplay.getText();
            cliDisplay.setText(oldCLI + "-P ");
        }
    }

    private class ActionAjouterK implements ActionListener {

        public void actionPerformed(ActionEvent ev) {
            String textKText = textK.getText();
            String oldCLI = cliDisplay.getText();
            cliDisplay.setText(oldCLI + "-K " + textKText);

        }
    }
    private class ActionAjouterA implements ActionListener {

        public void actionPerformed(ActionEvent ev) {
            String textAText = textA.getText();
            String oldCLI = cliDisplay.getText();
            cliDisplay.setText(oldCLI + "-A " + textAText);

        }
    }

    private class ActionAjouterE implements ActionListener {

        public void actionPerformed(ActionEvent ev) {
            String textEText = textE.getText();
            String oldCLI = cliDisplay.getText();
            cliDisplay.setText(oldCLI + "-E " + textEText);

        }
    }

    public static void main(String[] args) {
        new CLIClassiqueSwing();
    }
}
