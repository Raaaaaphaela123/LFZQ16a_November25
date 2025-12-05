package _02_tag_if_switch_ternary;

public class _01_If_Anweisungen {

    public static void main(String[] args) {

        // Beispiel 1: Einfache Bedingung
        double temperatur = 30; // z.B. für eine saisonale Aktion
        if (temperatur > 25) {
            System.out.println("Sommeraktion aktiv: kühle Getränke im Angebot!");
        }

        // Beispiel 2: if-else
        int kundenAlter = 17;
        if (kundenAlter >= 18) {
            System.out.println("Du darfst alkoholische Produkte kaufen.");
        } else {
            System.out.println("Alkoholische Produkte nur ab 18 Jahren.");
        }

        // Beispiel 3: if-else if-else (mehrere Bedingungen)
        int warenkorbPunkte = 85;
        if (warenkorbPunkte >= 90) {
            System.out.println("Rabatt: 20%");
        } else if (warenkorbPunkte >= 75) {
            System.out.println("Rabatt: 15%");
        } else if (warenkorbPunkte >= 60) {
            System.out.println("Rabatt: 10%");
        } else {
            System.out.println("Kein Rabatt verfügbar.");
        }

        // Beispiel 4: Logische Operatoren
        boolean istOnline = true;
        boolean istAngemeldet = false;

        if (istOnline && istAngemeldet) {
            System.out.println("Zugriff auf exklusive Angebote erlaubt.");
        } else {
            System.out.println("Bitte anmelden, um exklusive Angebote zu sehen.");
        }

        /* Versandkosten / Premiumkunden */
        double warenkorbWert = 35.00;
        boolean istPremiumKunde = false;

        System.out.println("\nWarenkorbwert: " + warenkorbWert + " €");
        System.out.println("Premiumkunde: " + istPremiumKunde);

        // Versandkostenfrei ab 50 € Bestellwert
        if (warenkorbWert >= 50) {
            System.out.println("Versandkostenfrei (ab 50 €).");
        } else {
            System.out.println("Versandkosten fallen an.");
        }

        // Premiumkunden erhalten immer kostenlosen Versand
        if (istPremiumKunde) {
            System.out.println("Versandkostenfrei für Premiumkunden.");
        }

        // Kombination von Bedingungen
        if (warenkorbWert >= 50 || istPremiumKunde) {
            System.out.println("Bestellung ist versandkostenfrei.");
        } else {
            System.out.println("Versandkosten werden berechnet.");
        }

        // Bonus: Neukunden-Gutschein
        boolean istNeukunde = true;
        if (istNeukunde) {
            System.out.println("Willkommensgutschein wird automatisch angewendet.");
        }

        /* ------------------------------------------------------------ */
        /* SCHLECHTES BEISPIEL – Wie man If-Bedingungen NICHT schreiben sollte */
        /* ------------------------------------------------------------ */

        int produktAnzahl = 10;
        int artikelWert = 20;

        // Schlechter Stil: unnötig verschachtelt
        if (produktAnzahl > 5) {
            if (produktAnzahl < 15) {
                if (artikelWert > 10) {
                    if (artikelWert < 30) {
                        System.out.println("Produktanzahl und Artikelwert sind im gültigen Bereich.");
                    }
                }
            }
        }

        // Noch schlechter: alles in einer riesigen Bedingung
        if (((produktAnzahl > 5 && produktAnzahl < 15) && (artikelWert > 10 && artikelWert < 30))
                || (produktAnzahl == 10 && artikelWert == 20 && !istNeukunde && !istPremiumKunde)) {
            System.out.println("Unlesbare Bedingung – besser vermeiden!");
        }

        // Besser: klar strukturierte Bedingungen
        boolean mengeImBereich = (produktAnzahl > 5 && produktAnzahl < 15);
        boolean wertImBereich = (artikelWert > 10 && artikelWert < 30);

        if (mengeImBereich && wertImBereich) {
            System.out.println("Besser lesbar: Produktanzahl und Artikelwert im gültigen Bereich.");
        }

        /* ------------------------------------------------------------ */
        /* Verschachtelte Ifs (Nested Ifs) im Shop-Kontext */
        /* ------------------------------------------------------------ */

        boolean hatRabattCode = true;
        boolean hatGuthaben = true;
        boolean istVIP = false;

        if (hatRabattCode) {
            System.out.println("\nRabattcode vorhanden. Überprüfung läuft...");

            if (hatGuthaben) {
                System.out.println("Genügend Guthaben vorhanden.");

                if (istVIP) {
                    System.out.println("Willkommen, VIP-Kunde! Zusätzlicher Rabatt aktiviert.");
                } else {
                    System.out.println("Standard-Rabatt für reguläre Kunden aktiviert.");
                }

            } else {
                System.out.println("Nicht genügend Guthaben – Rabatt kann nicht angewendet werden!");
            }

        } else {
            System.out.println("Kein Rabattcode – reguläre Preise werden berechnet.");
        }
    }
}
