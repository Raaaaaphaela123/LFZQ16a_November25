package _04_tag_labels_scopes;

public class Scoping {

    public static void main(String[] args) {
        int zahl1 = 5;

        // Scope (Gültigkeitsbereich) beschreibt, wo eine Variable sichtbar und nutzbar ist.
        // Grundprinzip:
        // - Lokale Variablen: nur innerhalb des Blocks { ... } sichtbar
        // - Variablen in Methoden wie main: innerhalb der Methode sichtbar
        // - Variablen in Schleifen oder if-Blöcken: nur innerhalb dieses Blocks nutzbar

        // Variable innerhalb eines Blocks (if)
        int zahl2 = 0;
        if (zahl1 < 5) {
            zahl1++;
            zahl2--;
            int zahl3 = 7;
        }
        // auf zahl2 und zahl1 können wir zugreifen, weil sie außerhalb definiert wurde
        zahl2 = 3;
        zahl1 = 10;
        // folgendes liefert einen Fehler, weil zahl3 nur innerhalb der If-Bedingung genutzt werden kann
        // zahl3 = 6;

        // Variablen innerhalb von Schleifen
        do {
            zahl2++;
            int zahl3 = 8;
        } while (zahl2 < 5);

        // folgendes liefert einen Fehler, weil zahl3 nur innerhalb der If-Bedingung genutzt werden kann
        // zahl3 = 6;

        // Verschachtelte Blöcke
        for (int i = 0; i < 10; i++) {
            int zahl4 = 5;
            for (int j = 0; j < 10; j++) {
                zahl4++;
                int zahl5 = 7; // ist nur innerhalb dieser Schleife erreichbar
            }
            // die außere Schleife hat keine Ahnung von der zahl5 in der inneren Schleife
            int zahl5 = 4;
        }

        // _______________________________________________________________________________________

        // Beispiel 1: Lokale Variable in main
        int warenkorbSumme = 0; // sichtbar innerhalb von main
        System.out.println("Startwert Warenkorb: " + warenkorbSumme + " €");

        // Beispiel 2: Variable innerhalb eines Blocks (if)
        boolean istPremiumKunde = true;

        if (istPremiumKunde) {
            double rabatt = 10.0; // Sichtbar nur innerhalb dieses if-Blocks
            warenkorbSumme += 100; // wir erhöhen die Gesamtsumme
            System.out.println("Premiumkunde Rabatt: " + rabatt + " €");
        }

        // System.out.println(rabatt); // Fehler! 'rabatt' existiert außerhalb des if-Blocks nicht

        // Beispiel 3: Variablen innerhalb von Schleifen
        int[] produktPreise = {50, 20, 150};

        for (int i = 0; i < produktPreise.length; i++) {
            int einzelPreis = produktPreise[i]; // Sichtbar nur innerhalb der Schleife
            warenkorbSumme += einzelPreis;
            System.out.println("Produkt " + (i + 1) + ": " + einzelPreis + " €");
        }

        // System.out.println(einzelPreis); // Fehler! 'einzelPreis' existiert außerhalb der Schleife nicht

        System.out.println("Gesamtsumme Warenkorb: " + warenkorbSumme + " €");

        // Beispiel 4: Verschachtelte Blöcke
        int x = 10; // sichtbar innerhalb von main

        if (x > 5) {
            int y = 20; // sichtbar nur innerhalb dieses if-Blocks
            System.out.println("x = " + x + ", y = " + y);

            if (y > 15) {
                int z = 30; // sichtbar nur innerhalb dieses inneren Blocks
                System.out.println("x = " + x + ", y = " + y + ", z = " + z);
            }

            // System.out.println(z); // Fehler! 'z' existiert nur im inneren Block
        }

        // Beispiel 5: Variable vor Schleife deklarieren, außerhalb nutzbar
        int gesamtRabatt = 0; // außerhalb der Schleife sichtbar
        int[] einkaufsWerte = {20, 50, 120, 80};

        for (int i = 0; i < einkaufsWerte.length; i++) {
            if (einkaufsWerte[i] >= 100) {
                gesamtRabatt += 10;
            }
        }

        System.out.println("Gesamtrabatt: " + gesamtRabatt + " €");
        // Vorteil: Variable ist nach der Schleife noch verfügbar, um Ergebnisse zu nutzen

    }
}


