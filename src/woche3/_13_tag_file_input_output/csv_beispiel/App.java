package woche3._13_tag_file_input_output.csv_beispiel;

import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        File csvDatei = new File("produkte.csv");

        // Beispiel-Daten
        String[][] produkte = {
                {"1001", "Laptop", "999.99", "1"},
                {"1002", "Maus", "19.99", "2"},
                {"1003", "Tastatur", "49.99", "1"}
        };

        // CSV SCHREIBEN
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvDatei, true))) {

            for (String[] p : produkte) {
                bw.write(String.join(",", p));
                bw.newLine();
            }

            System.out.println("CSV erfolgreich geschrieben!");

        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben: " + e.getMessage());
        }


        // CSV AUSLESEN
        ArrayList<Produkt> produktListe = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvDatei))) {

            String zeile;

            br.readLine(); // liest erste Zeile schon - Header wollen wir ja nicht einem Objekt zuweisen

            while ((zeile = br.readLine()) != null) {
                // Zeilen, die nur Leerzeichen enthalten, überspringen
                if (zeile.trim().isEmpty()) {
                    continue;
                }

                String[] teile = zeile.split(",");

                // Zeilen überspringen, die nicht 4 Felder haben
                if (teile.length < 4) {
                    System.out.println("Ungültige Zeile übersprungen: " + zeile);
                    continue;
                }

            // CSV → Produkt-Objekt
            Produkt p = new Produkt(teile[0], teile[1], Double.parseDouble(teile[2]), Integer.parseInt(teile[3]));

            produktListe.add(p);
        }
        System.out.println("\nProdukte aus der CSV:");
        for (Produkt p : produktListe) {
            System.out.println(p);
        }

    } catch(
    IOException e)

    {
        System.out.println("Fehler beim Lesen: " + e.getMessage());
    }
}
}
