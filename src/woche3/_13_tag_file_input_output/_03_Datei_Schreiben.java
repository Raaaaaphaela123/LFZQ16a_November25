package woche3._13_tag_file_input_output;

import java.io.*;

public class _03_Datei_Schreiben {
    public static void main(String[] args) {
        // Ziel-Datei
        File datei = new File("bestellungen.txt");

        // Beispielinhalt: Shop-Bestellung
        String[] bestellung = {
                "Kunde: Anna Mustermann",
                "Artikel: TV, 1 Stueck, 999.99 €",
                "Artikel: Maus, 2 Stueck, 19.99 €",
                "Gesamtsumme: 999.97 €"
        };

        String eingabe = "Bestellung wurde erledigt.";

        // Schreiben in die Datei - für append Modus true anhängen
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(datei, true))){
//            writer.write(eingabe);
//            writer.newLine(); // Zeilenumbruch
            for (String zeile : bestellung) {
                writer.write(zeile);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben der Datei." + e.getMessage());
        }

    }
}
