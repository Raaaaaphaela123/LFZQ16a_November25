package tag6_mehrdimensionale_arrays_arrayList.oop_Einstieg;

public class Hauptprogramm {
    public static void main(String[] args) {

        // 1. Erstellen von Objekten (Instanzen)
        // Instanzattribute = Variablen, die zu jedem Objekt gehören
        // Referenzvariable = Variable, die auf ein Objekt zeigt
        // Referenztyp = Typ der Referenzvariable (z.B. Artikel)

        // 2. Zugriff auf Attribute und Methoden
        Artikel artikel = new Artikel();
        artikel.name = "ASUS Laptop";
        artikel.preis = 799.99;
        artikel.lagerbestand = 10;

        artikel.anzeigen();

        double gesamtPreis = artikel.berechnePreis(2);

        System.out.println("Gesamtpreis: " + gesamtPreis);
    }
}
