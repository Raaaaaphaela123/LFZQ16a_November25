package tag6_mehrdimensionale_arrays_arrayList.oop_einstieg;

public class Artikel {
    // Attribute (Eigenschaften eines Artikels)
    String name;
    double preis;
    int lagerbestand;
    Lieferant lieferant;

    // Konstruktoren -> kommen morgen!

    // Methode zur Ausgabe
    void anzeigen() {
        System.out.println("Artikel: " + name + ", Preis: " + preis + " €, Lagerbestand: " + lagerbestand);
    }

    // Methode zur Berechnung des Gesamtpreises bei gegebener Stückzahl
    double berechnePreis(int menge) {
        return this.preis * menge;
    }

    void fuegeLieferantHinzu(Lieferant lieferant) {
        this.lieferant = lieferant;
    }

}
