package _10_tag_abstrakte_klassen_interfaces;

public abstract class Produkt {

    // Geschützte Attribute (sichtbar für Unterklassen)
    protected String name;
    protected double preis;

    // Konstruktor
    public Produkt(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    // Konkrete Methode
    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                '}';
    }

    // Abstrakte Methode
    public abstract void kaufen();
}
