package tag9_vererben_mit_extends;

public class Kunde {
    // Instanzattribute
    protected String vorname;
    protected String nachname;
    protected double guthaben;

    // statisches Attribut, das an die Klasse gebunden ist, es muss kein Objekt erzeugt werden
    private static int kundenZaehler = 0;



    public Kunde() {

    }

    // Konstruktor mit 3 Parametern (Endpunkt der Verkettung)
    public Kunde(String vorname, String nachname, double guthaben) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.guthaben = guthaben;

        // Bei der Erzeugung von einem Objekt (auch Objekte der Kindklasse) wird der Zähler um 1 erhöht
        kundenZaehler++;
    }

    @Override
    public String toString() {
        return "Vorname: " + vorname + ", Nachname: " + nachname + ", Guthaben: " + guthaben;
    }

    public String sagHallo() {
        return "Hiiiiii";
    }

    // Getter und Setter
    // statische Methode zum Zugreifen auf das statische Attribut
    public static int getKundenZaehler() {
        return kundenZaehler;
    }

    public String getVorname() {
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

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }
}
