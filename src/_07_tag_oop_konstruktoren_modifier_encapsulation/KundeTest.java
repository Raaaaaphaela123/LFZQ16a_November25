package _07_tag_oop_konstruktoren_modifier_encapsulation;

public class KundeTest {
    public static void main(String[] args) {

        // Kunden erstellen mit default Konstruktor
        Kunde kunde1 = new Kunde();

        // Kunden erstellen mit eigenem Konstruktor
        Kunde kundeMitKonstruktor = new Kunde("Raphaela", 100.0);

        // Zugriff public: direkter Zugriff möglich
        kundeMitKonstruktor.nachname = "Dohrmann";
        System.out.println(kundeMitKonstruktor.nachname);

        // Zugriffe auf Attribute -> sind jetzt private -> Zugriff nur noch mit Gettern und Settern
        System.out.println("Original-Vorname: " + kundeMitKonstruktor.getVorname());
        kundeMitKonstruktor.setVorname("Patrizia");
        System.out.println("Vornamen nach Änderung: " + kundeMitKonstruktor.getVorname());


        // anzeigen
        kundeMitKonstruktor.anzeigen();

        // einkaufen
        kundeMitKonstruktor.einkaufen(50);
        kundeMitKonstruktor.einkaufen(70);

    }
}
