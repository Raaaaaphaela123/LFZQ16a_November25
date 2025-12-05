package woche1._04_tag_labels_scopes;

public class Labels {
    public static void main(String[] args) {
        // Labels können verwendet werden, um bestimmte Codeblöcke zu markieren
        // Häufigster Einsatz: In Kombination mit break oder continue in geschachtelten Schleifen eingesetzt.
        // Labels sollten sparsam eingesetzt werden, da sie den Code schwerer lesbar machen können

        // Dies ist ein Label:
        outerLoop:
        for (int aussen = 0; aussen < 3; aussen++) {
            System.out.println("außen vor innen");
            innerLoop:
            for (int innen = 0; innen < 3; innen++) {
                if (innen == 1) {
                    break outerLoop; // mit break verlässt die innere und die äußere Schleife und geht weiter im Code,
                    // continue outerLoop wurde in der äußeren Schleife weitermachen
                }
                System.out.println("innen");
            }
            System.out.println("außen nach innen");
        }
        System.out.println("Wir sind raus aus der Schleife.");

    }
}
