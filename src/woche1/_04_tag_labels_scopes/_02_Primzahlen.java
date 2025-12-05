package woche1._04_tag_labels_scopes;

import javax.swing.*;

public class _02_Primzahlen {
    public static void main(String[] args) {

        int maximum = Integer.parseInt(JOptionPane.showInputDialog("Gib die obere Grenze ein (max 10000"));
        int zahler = 0;
        String ausgabe = "";

        for (int zuUeberpruefendeZahl = 2; zuUeberpruefendeZahl <= maximum; zuUeberpruefendeZahl++){
            boolean istPrimzahl = true;
            for (int teilendeZahl = 2; teilendeZahl < zuUeberpruefendeZahl; teilendeZahl++) {
                if (zuUeberpruefendeZahl % teilendeZahl == 0) {
                    istPrimzahl = false;
                    break;
                }
            }
            if (istPrimzahl) {
                zahler++;
                ausgabe += zuUeberpruefendeZahl + " ";
                if (zahler % 20 == 0) {
                    ausgabe += "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, ausgabe);
    }
}
