package tag6_mehrdimensionale_arrays_arrayList.oop_Einstieg;

public class Artikel {
    // Attribute (Eigenschaften eines Artikels)
    String name;
    double preis;
    int lagerbestand;

    // Konstruktoren -> kommen morgen!

    // Methode zur Ausgabe
    void anzeigen() {
        System.out.println("Artikel: " + name + ", Preis: " + preis + " €, Lagerbestand: " + lagerbestand);
    }

    // Methode zur Berechnung des Gesamtpreises bei gegebener Stückzahl
    double berechnePreis(int menge) {
        return preis * menge;
    }

}
