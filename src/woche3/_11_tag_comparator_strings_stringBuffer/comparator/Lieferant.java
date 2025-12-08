package woche3._11_tag_comparator_strings_stringBuffer.comparator;

public class Lieferant {

    private String name;
    private double bewertung;
    private int lieferzeitInWochen;

    public Lieferant(String name, double bewertung, int lieferzeitInWochen) {
        this.name = name;
        this.bewertung = bewertung;
        this.lieferzeitInWochen = lieferzeitInWochen;
    }

    @Override
    public String toString() {
        return "Lieferant{" +
                "name='" + name + '\'' +
                ", bewertung=" + bewertung +
                ", lieferzeitInWochen=" + lieferzeitInWochen +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBewertung() {
        return bewertung;
    }

    public void setBewertung(double bewertung) {
        this.bewertung = bewertung;
    }

    public int getLieferzeitInWochen() {
        return lieferzeitInWochen;
    }

    public void setLieferzeitInWochen(int lieferzeitInWochen) {
        this.lieferzeitInWochen = lieferzeitInWochen;
    }
}
