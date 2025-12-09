package woche3._12_tag_exceptions;

public class Artikel {
    private String name;
    private int lagerbestand;
    private double preis;

    public Artikel(String name, int lagerbestand, double preis) {
        this.name = name;
        this.lagerbestand = lagerbestand;
        this.preis = preis;
    }

    // Methode, die eine eigene Exception wirft
    // checked Exception - muss in der Methodendefinition mitgegeben werden
    public void kaufen(int menge) throws LagerbestandException {
        if (menge > lagerbestand) {
            throw new LagerbestandException("Nicht genug Lagerbestand für die gewünschte Menge: " + menge);
        }
        lagerbestand -= menge;
        System.out.println(menge + " gekauft. Verbleibender Lagerbestand: " + lagerbestand);
    }

    public void setName(String name) {
        if (name.length() < 3) {
            // RuntimeException - muss nicht in der Methodendefinition mitgegeben werden
            throw new NameZuKurzException("Der Name des Artikels muss mind. 3 Zeichen haben");
        }
        this.name = name;
    }
}
