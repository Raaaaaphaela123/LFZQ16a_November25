package woche3._12_tag_exceptions.beispiel1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // try-with-resources: Scanner wird automatisch geschlossen

        // Anzahl der Artikel abfragen
        // Preis pro Artikel abfragen
        // Könnte InputMismatchException auslösen

        try (Scanner scanner = new Scanner(System.in)) {

            // Plan: Durchschnittspreis der gekauften Artikel ermitteln

            System.out.print("Gib die Anzahl der Artikel ein: ");
            int anzahlArtikel = scanner.nextInt();

            double summePreise = 0;

            // Preise für jeden Artikel abfragen
            // -> wenn anzahl null ist, kommen keine Durschnittspreise, wir springen direkt in die
            // berechneDurchschnittsPreis- Methode und schmeißen die Exception
            for (int i = 1; i <= anzahlArtikel; i++) {
                System.out.print("Gib den Preis für Artikel " + i + " ein: ");
                double preis = scanner.nextDouble();

                if (preis < 0) {
                    System.out.println("Preis darf nicht negativ sein.");
                    return;
                }

                summePreise += preis;
            }

            double durchschnittspreis = berechneDurchschnittsPreis(anzahlArtikel, summePreise);
            System.out.println("Durchschnittspreis: " + durchschnittspreis);

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Gib eine gültige Zahl ein.");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgument: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unerwarteter Fehler.");
        }

        System.out.println("Programm beendet.");

    }

    public static double berechneDurchschnittsPreis(int anzahl, double summeDerPreise) {
        if (anzahl <= 0) {
            throw new IllegalArgumentException("Du musst mindestens 1 Artikel bestellen.");
        }

        return summeDerPreise / anzahl;
    }
}
