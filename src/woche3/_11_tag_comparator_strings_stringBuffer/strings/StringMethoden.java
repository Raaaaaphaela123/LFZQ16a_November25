package woche3._11_tag_comparator_strings_stringBuffer.strings;

public class StringMethoden {
    public static void main(String[] args) {

        // Beispiel-Strings im Shop-Kontext
        String artikelName = "Laptop";
        String artikelKategorie = "Elektronik";
        String leerString = "";
        String leerMitSpaces = "   ";

        // 1. concat(): Verknüpft zwei Strings
        String vollName = artikelKategorie.concat(" - ").concat(artikelName);
        System.out.println("concat(): " + vollName);

        // 2. length(): Länge des Strings
        System.out.println("length(): " + artikelName.length());

        // 3. equals(): Prüft auf exakte Gleichheit
        System.out.println("equals(): " + artikelName.equals("Laptop")); // true
        System.out.println("equals(): " + artikelName.equals("laptop")); // false

        // 4. equalsIgnoreCase(): Gleichheit ohne Berücksichtigung von Groß/Kleinschreibung
        System.out.println("equalsIgnoreCase(): " + artikelName.equalsIgnoreCase("laptop")); // true

        // 5. compareTo(): lexikographischer Vergleich
        System.out.println("compareTo(): " + artikelName.compareTo("Smartphone")); // negativ, da L < S

        // 6. charAt(): Liefert Zeichen an bestimmtem Index
        System.out.println("charAt(): " + artikelName.charAt(0)); // 'L'

        // 7. toUpperCase(): Großbuchstaben
        System.out.println("toUpperCase(): " + artikelName.toUpperCase());

        // 8. trim(): Entfernt führende und nachgestellte Leerzeichen
        System.out.println("trim(): '" + leerMitSpaces.trim() + "'");

        // 9. indexOf(): Index eines Zeichens oder Substrings
        System.out.println("indexOf(): " + artikelName.indexOf("top")); // 3

        // 10. isEmpty(): Prüft, ob String leer ist
        System.out.println("isEmpty(): " + leerString.isEmpty()); // true

        // 11. isBlank(): Prüft, ob String leer oder nur Whitespace ist
        System.out.println("isBlank(): " + leerMitSpaces.isBlank()); // true

        // 12. valueOf(): Wandelt andere Typen in String um
        int anzahl = 5;
        String anzahlStr = String.valueOf(anzahl);
        System.out.println("valueOf(): " + anzahlStr);

        // 13. endsWith(): Prüft, ob String mit einem bestimmten Suffix endet
        System.out.println("endsWith(): " + artikelName.endsWith("top")); // true

        // 14. substring(): Teilstring ausgeben
        System.out.println("substring(): " + artikelName.substring(0, 3)); // 'Lap'

        // 15. replace(): Zeichen oder Teilstrings ersetzen
        System.out.println("replace(): " + artikelName.replace("Lap", "Desk")); // 'Desktop'
    }
}
