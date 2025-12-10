package woche3._13_tag_file_input_output;

import java.io.*;

public class _02_Datei_Lesen {
    public static void main(String[] args) {
        // Dateiobjekt auf die bereits verschobene Datei
        File datei = new File("bestellungen.txt");
        StringBuilder dateiInhalt = new StringBuilder();

        // Prüfen, ob die Datei existiert
//        if (!datei.exists()) {
//            System.out.println("Datei existiert nicht.");
//            return;
//        }

        try (BufferedReader reader = new BufferedReader(new FileReader(datei))){
            String zeile;
            while ((zeile = reader.readLine()) != null) {
                // einfache Ausgabe jeder Zeile
                // System.out.println(zeile);

                // Zusammenfügen der ausgelesenen Datei mit Zeilenumbruch
                dateiInhalt.append(zeile).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Auslesen der Text-Datei: " + e.getMessage());
        }

        System.out.println(dateiInhalt);



        // Textausgabe


    }
}
