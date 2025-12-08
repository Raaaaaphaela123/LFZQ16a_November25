package woche3._11_tag_comparator_strings_stringBuffer.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Lieferant meinLieferant = new Lieferant("Lieferant 1", 4.5, 3);
        // Liste von Lieferanten erstellen
        List<Lieferant> lieferanten = new ArrayList<>();
        lieferanten.add(meinLieferant);
        lieferanten.add(new Lieferant("Lieferant 2", 2.5, 2));
        lieferanten.add(new Lieferant("Lieferant 3", 3.9, 5));


        //  geht nicht, weil Java nicht weiß, wonach sortiert werden soll
        //Collections.sort(lieferanten);

        // Ausgabe vor Sortierung
        System.out.println("Vor der Sortierung:");
        for (Lieferant lieferant : lieferanten) {
            System.out.println(lieferant.getName() + " - Bewertung: " + lieferant.getBewertung());
        }

        // Liste mit dem erstellten Comparator sortieren
        lieferanten.sort(new LieferantBewertungComparator());

        // Ausgabe nach der Sortierung nach Bewertung, Lieferant mit bester Bewertung zuerst
        System.out.println("Nach der Sortierung:");
        for (Lieferant lieferant : lieferanten) {
            System.out.println(lieferant.getName() + " - Bewertung: " + lieferant.getBewertung());
        }

        // umdrehen mit Collections.reverse();
        lieferanten.reversed();

        System.out.println("Nach der Umdrehung der sortierten Liste (ohne permanente Änderung:");
        System.out.println(lieferanten.reversed());

    }
}
