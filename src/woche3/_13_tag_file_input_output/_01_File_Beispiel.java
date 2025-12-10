package woche3._13_tag_file_input_output;

import java.io.File;
import java.io.IOException;

public class _01_File_Beispiel {
    public static void main(String[] args) {
        // Dateiobjekt anlegen
        File file = new File("bestellungen.txt");

        try {
            // Prüfen, ob Datei existiert, wenn ja, neue Datei erstellen
            if (file.exists()) {
                System.out.println("Datei existiert.");
            } else {
                boolean wurdeErstellt = file.createNewFile();
                System.out.println("Neue Datei erstellt: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Erstellen oder Bearbeiten der Datei: " + e.getMessage());
        }

        // Informationen zur Datei ausgeben
            System.out.println("\nDateiinformationen");
            System.out.println("Pfad: " + file.getAbsolutePath());
            System.out.println("Dateiname: " + file.getName());
            System.out.println("Existiert: " + file.exists());
            System.out.println("Lesbar: " + file.canRead());
            System.out.println("Schreibbar: " + file.canWrite());
            System.out.println("Größe (Bytes): " + file.length());

        // Datei löschen
           //  boolean geloescht = file.delete();
        //System.out.println("Datei wurde gelöscht: " + (geloescht ? "JA" : "NEIN"));
    }
}
