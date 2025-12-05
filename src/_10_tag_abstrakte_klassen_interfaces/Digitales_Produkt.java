package _10_tag_abstrakte_klassen_interfaces;

// erbt von Produkt
public class Digitales_Produkt extends Produkt implements Downloadbar {

    // Attribute
    private double dateigroesseMB;

    public Digitales_Produkt(String name, double preis, double dateigroesseMB) {
        super(name, preis);
        this.dateigroesseMB = dateigroesseMB;
    }

    // Methode überladen - statische Polymorphie
    public void gibInfos(String name) {
        System.out.println("Name " + name);
    }

    public void gibInfos(String name, double preis) {
        System.out.println("Name " + name + ", Preis: " + preis);
    }

    @Override
    public void kaufen() {
        System.out.println("Das digitale Produkt " + name + " wurde gekauft.");
        System.out.println("Preis: " + preis);
    }

    @Override
    public void downloaden() {
        System.out.println("Download von " + name + " startet ...,  Dateigröße: " + dateigroesseMB);
    }

}
