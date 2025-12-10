package woche3._12_tag_exceptions.beispiel2;

public class OnlineShop {

    public static void main(String[] args) {

        Artikel laptop = new Artikel("Laptop", 10,999.90);

        try {
            hierKaufen(laptop);
            // löst Exception aus
            laptop.setName("Ar");
        } catch (LagerbestandException e) {
            System.out.println("Exception gefangen: " + e.getMessage());
        } catch (NameZuKurzException e) {
            System.out.println("Name zu kurz: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // checked Exception - muss in der Methodendefinition mitgegeben werden
    static void hierKaufen(Artikel artikel) throws LagerbestandException {
        artikel.kaufen(6);
        // artikel.kaufen(5); // dadurch würde eine Exception ausgelöst werden
    }

}
