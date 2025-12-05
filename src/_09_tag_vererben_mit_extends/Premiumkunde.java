package _09_tag_vererben_mit_extends;

public class Premiumkunde extends Kunde {
    // Instanzavriablen
    private double rabatt; // zusätzlich Attribut zur Oberklasse

    // Konstruktor der Unterklasse
    public Premiumkunde(String vorname, String nachname, double guthaben, double rabatt) {
        // ruft den Konstruktor der Basisklasse auf, auf den die mitgegebenen Parameter passen
        // es muss ein passender Konstruktur in der Elternklasse definiert sein
        super(vorname, nachname, guthaben);
//        this.vorname = vorname;
//        this.nachname = nachname;
//        this.guthaben = guthaben;
        this.rabatt = rabatt;
    }

//    // Methoden der Elternklasse wird überschrieben und mit super wird die Implementierung der Elternklasse genutzt und dann hier ergänzt
    @Override
    public String toString() {
        return super.toString() + ", Rabatt: " + rabatt;
    }

    @Override
    public String sagHallo() {
        return "Moin";
    }
}
