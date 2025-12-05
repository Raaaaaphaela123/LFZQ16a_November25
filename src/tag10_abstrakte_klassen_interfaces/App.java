package tag10_abstrakte_klassen_interfaces;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        /*  1. Abstrakte Klassen
         * - Eine abstrakte Klasse kann nicht direkt instanziert werden.
         * - Sie kann Attribute und Methoden definieren, sowie abstrakte Methoden.
         * - Abstrakte Methoden müssen von Unterklassen implementiert werden.
         */

        // Produkt produkt1 = new Produkt("Zeitung", 1.5); -> funktioniert nicht, die Klasse ist abstract

        PhysischesProdukt meineZeitung = new PhysischesProdukt("GEO Magazin", 7.90, 2);

        meineZeitung.kaufen();

        Digitales_Produkt digitalesProdukt = new Digitales_Produkt("PDF Java Basics", 9.99, 250);

        // Methode aus der Elternklasse
        digitalesProdukt.kaufen();

        // Methode aus dem implementierten Interface
        digitalesProdukt.downloaden();


        /* 2. Polymorphie über Basistyp
         * - Die Referenzvariable hat den Typ der Basisklasse (Produkt)
         * - Die konkrete Implementierung der Methode wird zur Laufzeit anhand
         *   des tatsächlichen Objekts gewählt (dynamische Bindung).
         */

        Produkt laptop = new PhysischesProdukt("Laptop", 999.99, 7.9);
        Produkt software = new Digitales_Produkt("Anti-Viren Scanner", 39.99, 800);


        laptop.kaufen();
        software.kaufen();


        // Iteration durch Liste -> mit dynamischer Polymorphie wird die passende Methode der Kindsklasse zur Laufzeit ermittelt
        ArrayList<Produkt> produkte = new ArrayList<>();
        produkte.add(laptop);
        produkte.add(software);

        for (Produkt produkt : produkte) {
            produkt.kaufen();
        }

        /* 3. Zugriff auf Interface-Methoden
         * - Die Referenzvariable software ist vom Typ Produkt.
         * - Die Methode downloaden() ist nur im Interface Downloadbar definiert.
         * - Deshalb kann software.downloaden() NICHT direkt aufgerufen werden.
         */

        // software.downloaden(); // Fehler! _01_Produkt kennt diese Methode nicht

        /*  4. Casting und instanceof
         * - Mit instanceof prüfen wir, ob ein Objekt das Interface implementiert.
         * - Durch explizites Casting können wir dann die Interface-Methoden aufrufen.
         */
        if (software instanceof Downloadbar) {
            ((Downloadbar) software).downloaden();
        }

        /*  5. Interface als Referenztyp
         * - Wir können auch direkt eine Variable vom Interface-Typ anlegen.
         * - Dann stehen nur die Methoden des Interfaces zur Verfügung.
         */

        Downloadbar downloadbar = new Digitales_Produkt("Dig Produkt", 100, 50);
        downloadbar.downloaden();


    }
}
