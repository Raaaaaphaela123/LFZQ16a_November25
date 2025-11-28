package tag1_grundlagen;

public class _02_Arithmetische_Operatoren {
    public static void main(String[] args) {
        // Preise von Produkten im Warenkorb
        double preisProdukt1 = 10.0;
        double preisProdukt2 = 3.0;

        // Grundlegende Berechnungen
        System.out.println("Preis Produkt 1 + Produkt 2 = " + (preisProdukt1 + preisProdukt2) + " €");
        System.out.println("Preis Produkt 1 - Rabatt Produkt 2 = " + (preisProdukt1 - preisProdukt2) + " €");
        System.out.println("Preis Produkt 1 * Anzahl Produkte 2 = " + (preisProdukt1 * preisProdukt2) + " €");
        System.out.println("Preis Produkt 1 / Produkt 2 = " + (preisProdukt1 / preisProdukt2));
        System.out.println("Rest bei Preis Produkt 1 % Produkt 2 = " + (preisProdukt1 % preisProdukt2));

        // Kombinierte Operatoren: Gesamtpreis für mehrere Produkte
        int anzahlProdukt3 = 2;
        System.out.println("Preis Produkt1 + Preis Produkt2 * Menge Produkt3 = "
                + (preisProdukt1 + preisProdukt2 * anzahlProdukt3) + " €");

        /* Zuweisungsoperatoren für Warenkorbberechnung */
        double warenkorbWert = 10.0;
        System.out.println("\nStartwert Warenkorb: " + warenkorbWert + " €");

        // += Beispiel: Kunde legt Produkt im Wert von 5 € in den Warenkorb
        warenkorbWert += 5; // warenkorbWert = warenkorbWert + 5
        System.out.println("Nach Hinzufügen von 5 €: " + warenkorbWert + " €");

        // -= Beispiel: Rabatt von 3 € abziehen
        warenkorbWert -= 3;
        System.out.println("Nach Rabatt von 3 €: " + warenkorbWert + " €");

        // *= Beispiel: Sonderaktion, doppelter Warenkorbwert
        warenkorbWert *= 2;
        System.out.println("Nach Verdopplung (Aktion): " + warenkorbWert + " €");

        // /= Beispiel: Aufteilung auf 4 Personen
        warenkorbWert /= 4;
        System.out.println("Warenkorb auf 4 Personen verteilt: " + warenkorbWert + " € pro Person");
    }
}
