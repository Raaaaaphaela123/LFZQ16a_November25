package tag3;

public class _05_While_Schleife {
    public static void main(String[] args) {

        // Was ist eine while-Schleife?
        // Wiederholt den Codeblock, solange die Bedingung true ist.
        // Kopfgesteuerte Schleife: Bedingung wird vor jedem Durchlauf geprüft
        // continue: kann genutzt werden um in die nächste Iteration zu springen
        // break: beendet die Schleifenausführung

        int counter = 0;
        while (counter < 5) {
           if (counter == 3) {
               counter++;
              continue;
           } else {
               System.out.println(counter);
           }
           counter++;
        }

        // Beispiel 1: Produkte im Warenkorb anzeigen
        String[] warenkorb = {"Laptop", "Buch", "Kamera", "T-Shirt", "Kaffeemaschine"};
        int index = 0;

        System.out.println("Produkte im Warenkorb (while-Schleife):");
        while (index < warenkorb.length) { // Bedingung prüfen
            System.out.println((index + 1) + ". " + warenkorb[index]);
            index++; // Zähler erhöhen, sonst unendliche Schleife
        }

        // Hinweis:
        // - Bedingung wird vor jedem Durchlauf geprüft
        // - Ohne Erhöhung des Zählers würde die Schleife unendlich laufen
        // - Ideal, wenn die Anzahl der Durchläufe nicht vorher bekannt ist
    }
}
