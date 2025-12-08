package woche3._11_tag_comparator_strings_stringBuffer.comparator;

import java.util.Comparator;

public class LieferantBewertungComparator implements Comparator<Lieferant> {
    @Override
    public int compare(Lieferant lieferant1, Lieferant lieferant2) {
        return Double.compare(lieferant2.getBewertung(), lieferant1.getBewertung());
    }
}
