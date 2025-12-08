package woche3._11_tag_comparator_strings_stringBuffer.comparator;

import java.util.ArrayList;
import java.util.Comparator;
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

        System.out.println("Nach der Umdrehung der sortierten Liste (ohne permanente Änderung:");
        System.out.println(lieferanten.reversed());


        /* EXKURS */
        // Alternative für einfachen Comparator mit Lambdas
        // Liste von Lieferanten erstellen
        List<Lieferant> lieferanten2 = new ArrayList<>();
        lieferanten2.add(new Lieferant("Testlieferant", 2.5, 2));
        lieferanten2.add(new Lieferant("Neulieferant", 4.9, 5));
        lieferanten2.add(new Lieferant("Stammlieferant", 3.9, 3));

        // Variante 1: funktionale Programmierung mit Lambda (eine Art Mini-Methode, die direkt inline geschrieben wird)
        lieferanten2.sort(Comparator.comparingDouble(l -> l.getBewertung()));

        System.out.println("Lieferanten 2 mit Lambda: " + lieferanten2);
        // Variante 2: funktionale Programmierung mit Method Reference (quasi kürzere Schreibweise für Lambdas)
        lieferanten2.sort(Comparator.comparingDouble(Lieferant::getBewertung));

        //lieferanten2.sort(Comparator.comparing(Lieferant::getName));
        System.out.println("Nach name sortiert" + lieferanten2);

    }
}
