package tag4;

import javax.swing.*;
import java.util.Random;

public class _01_Zahlenraten {
    public static void main(String[] args) {
        Random random = new Random();
        int zahl = (random.nextInt(6) + 1) * 5;
        System.out.println(zahl);
        int gerateneZahl;
        int versuche = 0;

        final int VERSUCHE_BIS_TIPP = 5;
        final int VERSUCHE_BIS_BEENDEN_FRAGE = 2;
        final int VERSUCHE_BIS_AUTOMATISCH_ENDE = 30;

        boolean spielBeenden = false;


        while (!spielBeenden) {
            // Benutzer  Input holen
            String benutzerInput = JOptionPane.showInputDialog("Bitte gib deine Zahl ein");

            // Checke, ob Input leer ist
            while (benutzerInput.isEmpty()) {
                benutzerInput = JOptionPane.showInputDialog("Leerer Wert! Bitte gib deine Zahl ein");
            }
            versuche++;
            System.out.println(versuche);

            gerateneZahl = Integer.parseInt(benutzerInput);
            System.out.println(gerateneZahl);

            // Prüfe, ob Zahl stimmt
            if (gerateneZahl == zahl) {
                JOptionPane.showMessageDialog(null, "Erfolgreich erraten! Bis zum nächsten Mal!");
                spielBeenden = true;
            } else {

                switch (versuche) {
                    case VERSUCHE_BIS_TIPP:
                        JOptionPane.showMessageDialog(null, "Kleiner Tipp, die Zahl muss zwischen 1 und 30 liegen.");
                        break;
                    case VERSUCHE_BIS_BEENDEN_FRAGE:
                        JOptionPane.showMessageDialog(null, "Deine Zahl war falsch! Bitte versuche es erneut!");

                        String antwort = JOptionPane.showInputDialog("Möchtest du abbrechen? Antworte mit ja oder nein.").toLowerCase();
                        while (!"ja".equals(antwort) && (!"nein".equals(antwort))) {
                            antwort = JOptionPane.showInputDialog("Bitte antworte mit ja oder nein");
                        }
                        break;
                    case VERSUCHE_BIS_AUTOMATISCH_ENDE:
                        JOptionPane.showMessageDialog(null, "Deine Zahl war falsch! Bitte versuche es erneut!");
                        JOptionPane.showMessageDialog(null, "Leider nicht gewonnen. Bis zum nächsten Mal.");
                        spielBeenden = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Deine Zahl war falsch! Bitte versuche es erneut!");

                }
            }
        }

    }
}
