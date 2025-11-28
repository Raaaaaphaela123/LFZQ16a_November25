package tag3_schleifen;

public class _04_For_Schleife {
    public static void main(String[] args) {

        // Was ist eine for-Schleife?
        // Sie wiederholt Anweisungen, solange eine Bedingung erfüllt ist.
        // Klassische for-Schleife: Startwert, Bedingung, Schrittweite

        for (int i = 0; i < 5; i++) {
            System.out.println("i ist gerade " + i);
        }

        // Beispiel 1: Ausgabe der Produkte im Warenkorb
        String[] warenkorb = {"Laptop", "Buch", "Kamera", "T-Shirt", "Kaffeemaschine"};

        System.out.println("Produkte im Warenkorb (klassische for-Schleife):");
        for (int i = 0; i < warenkorb.length; i++) {
            // i = Index des aktuellen Elements (0-basiert)
            System.out.println((i + 1) + ". " + warenkorb[i]);
        }

        // Enhanced For-Loop (For-Each)
        System.out.println("\nProdukte im Warenkorb (Enhanced For-Loop):");

        int nummer = 1;
        for (String produkt : warenkorb) {
            // "produkt" bekommt nacheinander jedes Element aus dem Array "warenkorb"
            System.out.println(nummer + ". " + produkt);
            nummer++;
        }
        // Vorteil: Kein Index nötig, kürzerer und übersichtlicherer Code
    }
}
