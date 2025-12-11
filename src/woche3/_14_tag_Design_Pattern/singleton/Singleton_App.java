package woche3._14_tag_Design_Pattern.singleton;

public class Singleton_App {

    public static void main(String[] args) {
        // Instanz holen
        ShopKasse kasse = ShopKasse.getInstance();

        // es sind mehrere Referenzen auf die ShopKlasse möglich, aber es gibt nur ein Objekt
        ShopKasse kasse2 = ShopKasse.getInstance();
//        System.out.println("kasse und kasse2 gleich? " + (kasse == kasse2));

        System.out.println("1. Einkauf: Kassenbonnummer " + kasse.erhalteKassenbonNummer());
        System.out.println("2. Einkauf: Kassenbonnummer " + kasse.erhalteKassenbonNummer());
        // gleiche Kasse, nur andere Referenz darauf -> besitzen die gleiche Kassenbonnummer
        System.out.println("3. Einkauf: Kassenbonnummer " + kasse2.erhalteKassenbonNummer());

    }
}
