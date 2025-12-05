package woche2._09_tag_vererben_mit_extends;

public class App {
    public static void main(String[] args) {

        // Instanz der Elternklasse
        Kunde kunde1 = new Kunde("Max", "Muster", 500);
        //  kunde1.anzeigen(); -> wir würden eher die toString() Methode überschreiben und für unsere Zwecke anpassen

        // 2. Instanz der Elternklasse
        Kunde kunde2 = new Kunde("Anna", "Muster", 500);

        // Instanz der Kindklasse
        Premiumkunde meinPremiumKunde = new Premiumkunde("Raphaela", "Dohrmann", 1000, 10.0);

        // toString() wird implizit aufgerufen, wir müssen nicht toString() schreiben
        System.out.println("Premiumkunde " + meinPremiumKunde);
        System.out.println("Normaler Kunden mit überschriebener toString(): " + kunde1);

        System.out.println(kunde1.sagHallo());
        System.out.println(meinPremiumKunde.sagHallo());

        // Aufruf von statischem Attribut und statischer Methode - 3 Kunden weil 2x Kunde und 1x PremiumKunde
        System.out.println("Ich habe aktuell " + Kunde.getKundenZaehler() + " Kunden.");


    }
}
