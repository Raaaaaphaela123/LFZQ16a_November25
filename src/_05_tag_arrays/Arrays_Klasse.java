package _05_tag_arrays;

import java.util.Arrays;

public class Arrays_Klasse {
    public static void main(String[] args) {

        int[] bestand = {5, 20, 10, 15, 8};

        // Arrays.toString() gibt uns eine einfache Möglichkeit der Ausgabe
        System.out.println("Ausgabe mit Arrays.toString(): " + Arrays.toString(bestand));

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

        // Arrays.binarySearch() – Suche nach einem Wert Beispiel: [19, 49, 59, 299, 999]
        // Funktioniert nur bei sortierten Arrays korrekt
        int suchPreis = 49;
        int index = Arrays.binarySearch(preise, suchPreis); // Index des Wertes
        System.out.println("\nIndex des Preises " + suchPreis + " €: " + index);

        // Unsortiertes Array -> Ausgabe nicht zuverlässig
        int[] preise2 = {300, 500, 200, 500, 700, 300, 500};
        printArray(preise2);
        int suche = 500;
        int index2 = Arrays.binarySearch(preise2, suche);
        System.out.println("Index: " + index2);

        // Beispiel: Wert nicht vorhande, Beispiel: sortierte Array: [19, 49, 59, 299, 999]
        int fehlenderPreis = 100;
        int indexFehler = Arrays.binarySearch(preise, fehlenderPreis);
        System.out.println("Index eines fehlenden Preises " + fehlenderPreis + " €: " + indexFehler);
        // eine negative Zahl bedeutet, dass der Wert nicht vorhanden ist
        // -> zeigt an, an welcher Position der Wert im Array (nicht an welchem Index!) zu finden wäre

        // Arrays.equals() – Vergleich zweier Arrays
        int[] warenkorb1 = {1, 2, 3};
        int[] warenkorb2 = {1, 2, 3};
        int[] warenkorb3 = {1, 2, 4};

        System.out.println("\nVergleich von Warenkörben:");
        System.out.println("warenkorb1 gleich wie warenkorb2? " + Arrays.equals(warenkorb1, warenkorb2));
        System.out.println("warenkorb1 gleich wie warenkorb3? " + Arrays.equals(warenkorb1, warenkorb3));

        // Arrays.mismatch() – erstes unterschiedliches Element finden
        int unterschied = Arrays.mismatch(warenkorb1, warenkorb3);
        System.out.println("\nErster Unterschied zwischen warenkorb1 und warenkorb3: Index " + unterschied);
        // Gibt -1 zurück, wenn Arrays gleich sind

        // Kopie erstellen
        int[] warenkorb4 = Arrays.copyOf(warenkorb1, warenkorb1.length);
        System.out.println(Arrays.toString(warenkorb1));

        // verweist aufs gleiche Objekt, das Original wird auch verändert
        int[] warenkorb5 = warenkorb1;
        warenkorb5[0] = 8;
        System.out.println(Arrays.toString(warenkorb1));

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
