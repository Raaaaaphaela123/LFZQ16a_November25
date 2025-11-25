package tag2;

public class _03_Ternaerer_Operator {
    public static void main(String[] args) {
        // Was ist der Konditionaloperator?
        // Kurzform für einfache if-else-Entscheidungen:
        // Syntax: Bedingung ? WertWennTrue : WertWennFalse

        // Beispiel 1: Altersprüfung für Kauf bestimmter Produkte
        int kundenAlter = 20;
        String zugang = (kundenAlter >= 18) ? "Kauf erlaubt" : "Kauf verweigert";
        System.out.println("Altersprüfung: " + zugang);

        // Beispiel 2: Anzeige je nach Login-Status
        boolean istEingeloggt = false;
        String status = istEingeloggt ? "Logout anzeigen" : "Login anzeigen";
        System.out.println("Benutzerstatus: " + status);

        // Beispiel 3: Rabattanzeige basierend auf Warenkorbwert
        double warenkorbWert = 75.00;
        String rabatt = (warenkorbWert >= 100) ? "10% Rabatt" : "Kein Rabatt";
        System.out.println("Rabattregel: " + rabatt);

        // Beispiel 4: Versandkostenprüfung
        boolean istPremiumKunde = true;
        String versand = (warenkorbWert >= 50 || istPremiumKunde) ? "Versandkostenfrei" : "Versandkosten fallen an";
        System.out.println("Versandregel: " + versand);

        // Hinweis:
        // Der Konditionaloperator ist ideal für einfache, übersichtliche Bedingungen,
        // ersetzt jedoch keine komplexen if-Strukturen.
    }
}
