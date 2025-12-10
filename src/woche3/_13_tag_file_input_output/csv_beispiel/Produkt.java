package woche3._13_tag_file_input_output.csv_beispiel;

public class Produkt {
    String artikelnummer;
    String name;
    double preis;
    int menge;

    public Produkt(String artikelnummer, String name, double preis, int menge) {
        this.artikelnummer = artikelnummer;
        this.name = name;
        this.preis = preis;
        this.menge = menge;
    }

    @Override
    public String toString() {
        return artikelnummer + " - " + name + " - " + preis + " € - Menge: " + menge;
    }
}
