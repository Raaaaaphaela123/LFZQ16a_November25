package tag5_arrays;

import javax.swing.*;

// GFN Folien: Tag 11_ Packages Imports Arrays
public class _01_Eindimensionale_Arrays {
    // Arrays sind Containerklassen zur Speicherung von Elementen
    // Können primitive Daten oder Referenztypen aufnehmen
    // Elemente müssen im selben Datentyp vorliegen
    // Werte im Array sind veränderbar, die Größe ist jedoch fest

    // Anwendundungszwecke:
    // Anzahl der Elemente steht fest, z.B. Wochentage
    // sind schneller als Listen: Zugriffsgeschwindigkeit, Speicherverbrauch und brauchen kein Autoboxing bei primitiven Typen
    // -> z.B. Spiele Engines nutzen häufig Arrays
    // können mit primitiven Datentypen arbeiten
    // für multidimensionale Datenstrukturen, Einsatz für Raster, Pixel, Matrizen, Spielekarten

    // im Alltag benutzen wir eher Listen

    // DANACH AUFGABEN 1-5
    public static void main(String[] args) {
        // Deklaration eines Arrays
        String artikel [];

        // Initialisierung mit fester Größe
        artikel = new String[3];

        // Deklaration und Initialisierung in einer Zeile
        String[] bestellungen = new String[5];

        // Hinzufügen von Elementen
        // Zugriff über Index
        artikel[0] = "Laptop";
        artikel[1] = "Maus";
        artikel[2] = "Tastatur";

        System.out.println("Artikel an erster Stelle im Array: " + artikel[0] + ", Artikel an 2. Stelle im Array: " + artikel[1]);

        // Länge kann via array.length ermittelt werden
        // Ausgabe der einzelnen Werte via for-Schleife über den Index
        for (int i = 0; i < artikel.length; i++) {
            System.out.println("Produkt: " + artikel[i]);
        }

        // Enhanced For-Schleife (for-each)
        for (String produkt: artikel) {
            System.out.println("Produkt2: " + produkt);
        }

        // Direkte Deklaration und Initialisierung (Array-Literal)
        double[] preise = {700.99, 19.99, 69.99};

        // Ausgabe von 2 Arrays
        for (int i = 0; i < artikel.length; i++) {
            System.out.println("Das Produkt " + artikel[i] + " kostet " + preise[i] + " Euro.");
        }

        // Anonyme Arrays (direkte Übergabe an Methode)
        printDoubleArray(new double[]{100.99, 20.99});

        // Fehlerbeispiel: ArrayIndexOutOfBoundsException
        // Kann nicht ausgegeben werden: System.out.println(artikel[3]);

        // Berechnung – Gesamtwert des Lagers
        String[] vornamen = new String[3];

        // Befüllung von Werten in einem Array durch Nutzereingabe - Beispiel
        for (int i = 0; i < vornamen.length ; i++) {
            vornamen[i] = JOptionPane.showInputDialog("Bitte Vornamen eingeben: ");
            System.out.println(vornamen[i]);
        }

        // Alternative AUSGABE-Möglichkeit
        for (String vorname : vornamen) {
            System.out.println(vorname);
        }

        // Ersetzen eines Werts im Array
        artikel[0] = "TV";

        // Array vergößern
        int neueLaenge = 5 + artikel.length;
        String[] neuesArray = new String[neueLaenge];

        // alte Werte in mein neues Array füllen
        for (int i = 0; i < artikel.length; i++) {
            neuesArray[i] = artikel[i];
        }
        System.out.println("Neues Array: ");
        printStringArray(neuesArray);

        // Präsentation Seite 17: Standard Werte und ArrayIndexOutOfBoundsException anschauen

        // JETZT AUFGABEN 1-5

    }

    // Methode zum Ausgeben eines Arrays mit doubles
    public static void printDoubleArray(double[] zahlen) {
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
    // Methode zum Ausgeben eines Arrays mit Strings

    public static void printStringArray(String[] zahlen) {
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }

}
