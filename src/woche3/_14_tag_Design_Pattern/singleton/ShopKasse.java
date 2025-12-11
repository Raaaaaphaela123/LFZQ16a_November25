package woche3._14_tag_Design_Pattern.singleton;

// Singleton-Klasse: Es darf nur EINE Kasse geben
public class ShopKasse {
    // statische Variable, die eine EINZIGE Instanz
    private static ShopKasse instance;

    // Instanzattribute
    private int kassenbonNummer;

    // Privater Konstruktor -> verhindert, dass jemand von außen new ShopKasse() verwenden kann
    private ShopKasse(){
        kassenbonNummer = 1;
    }

    // Statische Methode zum Abrufen der einzigen Instanz
    public static ShopKasse getInstance() {
        if (instance == null) {
            instance = new ShopKasse();
        }
        return instance;
    }

    // Methode zum Abfragen der Kassenbon Nummer -> zählt nach Herausgabe der aktuellen Nummer 1 hoch
    public int erhalteKassenbonNummer() {
        return kassenbonNummer++;
    }

}
