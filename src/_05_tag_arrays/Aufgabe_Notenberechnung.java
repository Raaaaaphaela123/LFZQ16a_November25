package _05_tag_arrays;

import javax.swing.*;

public class Aufgabe_Notenberechnung {
    public static void main(String[] args) {

        int anzahlNoten = Integer.parseInt(JOptionPane.showInputDialog("Wie viele Noten möchtest du eingeben?"));

        double[] noten = new double[anzahlNoten];

        double summe = 0.0;
        double durchschnitt = 0;

        String ausgabe = "";

        for (int i = 0; i < anzahlNoten; i++) {
            noten[i] = Double.parseDouble(JOptionPane.showInputDialog("Bitte gib die " + (i + 1) + ". Note ein:").replace(",", "."));
            summe += noten[i];

        }
        durchschnitt = summe / anzahlNoten;

        for (int i = 0; i < noten.length; i++) {
            if (i == noten.length - 1) {
                ausgabe += noten[i];
            } else {
                ausgabe += noten[i] + ", ";
            }
        }

        JOptionPane.showMessageDialog(null, "Die eingegebenen Noten betragen : " + ausgabe + "\nMein Durchschnitt ist: " + String.format("%.2f", durchschnitt));
    }
}
