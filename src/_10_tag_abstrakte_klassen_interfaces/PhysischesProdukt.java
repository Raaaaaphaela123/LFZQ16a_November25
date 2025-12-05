package _10_tag_abstrakte_klassen_interfaces;

public class PhysischesProdukt extends Produkt {

    // Attribute
    private double versandKosten;

    // Konstruktor
    public PhysischesProdukt (String name, double preis, double versandKosten) {
        super(name, preis);
        this.versandKosten = versandKosten;
    }

    @Override
    public void kaufen() {
        System.out.println("Das physische Produkt " + name + "wurde gekauft.");
        System.out.println("Versandkosten: " + versandKosten);
        System.out.println("Gesamtpreis: " + (preis + versandKosten) + " €.");
    }
}
