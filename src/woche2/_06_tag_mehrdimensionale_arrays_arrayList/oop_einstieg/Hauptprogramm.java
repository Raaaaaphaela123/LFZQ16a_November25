package woche2._06_tag_mehrdimensionale_arrays_arrayList.oop_einstieg;

public class Hauptprogramm {
    public static void main(String[] args) {

        // 1. Erstellen von Objekten (Instanzen)
        Artikel artikel = new Artikel();

        // 2. Zugriff auf Attribute und Methoden
        artikel.name = "ASUS Laptop";
        artikel.preis = 799.99;
        artikel.lagerbestand = 10;

        artikel.anzeigen();

        double gesamtPreis = artikel.berechnePreis(2);
        System.out.println("Gesamtpreis: " + gesamtPreis);

        // Füge Lieferant hinzu
        Lieferant laptopLieferant = new Lieferant();
        laptopLieferant.name = "Lieferant X";

        artikel.fuegeLieferantHinzu(laptopLieferant);

        System.out.println("Lieferant für Artikel: " + artikel.lieferant.name);

    }
}
