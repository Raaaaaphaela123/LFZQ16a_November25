package woche3._11_tag_comparator_strings_stringBuffer.strings;

public class StringBuilderMethoden {
    public static void main(String[] args) {
        // Beispiel: Produktbeschreibung im Shop
        StringBuilder beschreibung = new StringBuilder("Laptop");

        // 1. append(): fügt Text hinzu
        beschreibung.append(" - Hochleistungsgerät");
        System.out.println("append(): " + beschreibung);

        // 2. insert(): fügt Text an bestimmter Position ein
        beschreibung.insert(7, "(Gaming) ");
        System.out.println("insert(): " + beschreibung);

        // 3. delete(): löscht Zeichenbereich
        beschreibung.delete(7, 15); // entfernt "(Gaming)"
        System.out.println("delete(): " + beschreibung);

        // 4. replace(): ersetzt Teilstring
        beschreibung.replace(0, 6, "Notebook");
        System.out.println("replace(): " + beschreibung);

        // 5. reverse(): dreht den String um
        beschreibung.reverse();
        System.out.println("reverse(): " + beschreibung);

        // 6. length(): Länge des Strings
        System.out.println("length(): " + beschreibung.length());

        // 7. charAt(): Zeichen an Position 0
        System.out.println("charAt(): " + beschreibung.charAt(0));

        // 8. toString(): in normalen String umwandeln
        String beschreibungStr = beschreibung.toString();
        System.out.println("toString(): " + beschreibungStr);

        // vereinfachtes Beispiel für komplexe Operationen, bei denen StringBuilder eingesetzt werden sollten
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            sb.append(i).append(", ");
        }

        String result = sb.toString();

        System.out.println(result);
    }
}
