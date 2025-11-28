package tag2_if_switch_ternary;

public class _02_Switch_case {
    public static void main(String[] args) {
        // Beispiel: Produktkategorie ausgeben auf Basis einer Zahl
        int produktKategorie = 3;

        switch (produktKategorie) {
            case 1:
                System.out.println("Kategorie: Elektronik");
                break;
            case 2:
                System.out.println("Kategorie: Kleidung");
                break;
            case 3:
                System.out.println("Kategorie: Bücher");
                break;
            case 4:
                System.out.println("Kategorie: Lebensmittel");
                break;
            default:
                System.out.println("Ungültige Kategorie – bitte Zahl von 1 bis 4 verwenden.");
        }

        // Beispiel: Reaktion auf Kundenbefehl
        String kundenBefehl = "hilfe";

        switch (kundenBefehl) {
            case "start":
                System.out.println("Willkommen im Shop!");
                break;
            case "hilfe":
                System.out.println("Hier findest du Hilfe zu unserem Shop.");
                break;
            case "ende":
                System.out.println("Shop wird geschlossen.");
                break;
            default:
                System.out.println("Unbekannter Befehl.");
        }

        /* -------------------------------------------------------------- */
        /* Beispiel: Fall-Through (break vergessen)                       */
        /* -------------------------------------------------------------- */
        int rabattStufe = 2;

        System.out.println("\nBeispiel: Vergessenes 'break' bei Rabattstufe = " + rabattStufe);

        switch (rabattStufe) {
            case 1:
                System.out.println("Rabatt: 5%");
                // kein break!
            case 2:
                System.out.println("Rabatt: 10%");
                // kein break!
            case 3:
                System.out.println("Rabatt: 15%");
                break;
            default:
                System.out.println("Kein Rabatt");
        }

        // Ausgabe zeigt Fall-Through: Nach case 2 wird auch case 3 ausgeführt.

        /* -------------------------------------------------------------- */
        /* Gruppierung von Monaten zu Versandkostenzeiten                 */
        /* -------------------------------------------------------------- */
        int monat = 12;
        String versandSaison = "";

        switch (monat) {
            case 12, 1, 2:
                versandSaison = "Winterversand";
                break;
            case 3, 4, 5:
                versandSaison = "Frühlingversand";
                break;
            case 6, 7, 8:
                versandSaison = "Sommerversand";
                break;
            case 9, 10, 11:
                versandSaison = "Herbstversand";
                break;
            default:
                versandSaison = "Ungültiger Monat";
        }

        System.out.println("Monat " + monat + " → " + versandSaison);

        /* -------------------------------------------------------------- */
        /* Enhanced Switch (ab Java 17)                                   */
        /* -------------------------------------------------------------- */
        String tag = "Monday";

        // Klassischer Switch
        int tagNummer;
        switch (tag) {
            case "Monday":
                tagNummer = 1;
                break;
            case "Tuesday":
                tagNummer = 2;
                break;
            case "Wednesday":
                tagNummer = 3;
                break;
            default:
                tagNummer = 0;
        }
        System.out.println("\nKlassischer Switch: " + tag + " = " + tagNummer);

        // Enhanced Switch
        int newTagNummer = switch (tag) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            default -> 0;
        };
        System.out.println("Enhanced Switch: " + tag + " = " + newTagNummer);

        /*
         * Erklärung:
         * - Klassischer Switch: Man braucht 'break', sonst Fall-Through.
         * - Enhanced Switch: Kein break nötig, jeder Fall ist ein eigener Ausdruck.
         * - Vorteil: kürzer, übersichtlicher, verhindert unbeabsichtigtes Durchlaufen weiterer Fälle.
         */
    }
}
