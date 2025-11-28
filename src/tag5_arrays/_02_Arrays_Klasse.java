package tag5_arrays;

import java.util.Arrays;

// Danach Aufgabe 6
public class _02_Arrays_Klasse {
    public static void main(String[] args) {

        int[] bestand = {5, 20, 10, 15, 8};

        System.out.println("Ursprüngliche Bestände:");
        printArray(bestand); // Hilfsmethode zum Ausgeben des Arrays

        // Arrays.fill() – alle Werte auf einen festen Wert setzen
        System.out.println("\nAlle Bestände auf 0 setzen mit Arrays.fill():");
        Arrays.fill(bestand, 0); // Alle Elemente werden auf 0 gesetzt
        printArray(bestand);

        // Arrays.sort() – sortieren
        int[] preise = {999, 19, 49, 299, 59}; // Preise für Artikel
        System.out.println("\nPreise unsortiert:");
        printArray(preise);

        Arrays.sort(preise); // Sortiert das Array aufsteigend
        System.out.println("Preise sortiert:");
        printArray(preise);

        // Arrays.binarySearch() – Suche nach einem Wert
        // Funktioniert nur bei sortierten Arrays korrekt
        int suchPreis = 49;
        int index = Arrays.binarySearch(preise, suchPreis); // Index des Wertes
        System.out.println("\nIndex des Preises " + suchPreis + " €: " + index);

        // Beispiel: Wert nicht vorhanden
        int fehlenderPreis = 100;
        int indexFehler = Arrays.binarySearch(preise, fehlenderPreis);
        System.out.println("Index eines fehlenden Preises " + fehlenderPreis + " €: " + indexFehler);
        // Negative Zahl bedeutet, dass der Wert nicht vorhanden ist

        // Arrays.equals() – Vergleich zweier Arrays
        int[] warenkorb1 = {1, 2, 3};
        int[] warenkorb2 = {1, 2, 3};
        int[] warenkorb3 = {1, 2, 4};

        System.out.println("\nVergleich von Warenkörben:");
        System.out.println("warenkorb1 == warenkorb2? " + Arrays.equals(warenkorb1, warenkorb2));
        System.out.println("warenkorb1 == warenkorb3? " + Arrays.equals(warenkorb1, warenkorb3));

        // Arrays.mismatch() – erstes unterschiedliches Element finden
        int unterschied = Arrays.mismatch(warenkorb1, warenkorb3);
        System.out.println("\nErster Unterschied zwischen warenkorb1 und warenkorb3: Index " + unterschied);
        // Gibt -1 zurück, wenn Arrays gleich sind


    }

    // Hilfsmethode zum Ausgeben von Arrays
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
