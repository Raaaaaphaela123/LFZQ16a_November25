package _07_tag_oop_konstruktoren_modifier_encapsulation;

public class Kunde {
    // Instanzattribute
    private String vorname;
    public String nachname;
    private double guthaben;

    // Default Konstruktor
    public Kunde () {
    }

    // Alternativer Konstruktor
    public Kunde(String vorname, double guthaben) {
        this.vorname = vorname;
        this.guthaben = guthaben;
    }

    public Kunde(String vorname, String nachname, double guthaben) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.guthaben = guthaben;
    }

    // Methode ohne Parameter / ohne Rückgabe
    public void anzeigen() {
        System.out.println("Vorname: " + vorname + ", Nachname: " + nachname + ", Guthaben: " + guthaben);
    }

    // Methode mit Parameter / mit Rückgabe
    public void einkaufen(double betrag) {
        if (betrag <= guthaben) {
            guthaben -= betrag;
            System.out.println(betrag + " € wurden abgezogen. Restbetrag Guthaben: " + guthaben);
        } else {
            System.out.println("Nicht genug Guthaben für den Betrag von " + betrag + " €.");
        }
    }

    // Getter und Setter
    public String getVorname(){
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public void setGuthaben(double guthaben) {
        this.guthaben = guthaben;
    }

}
