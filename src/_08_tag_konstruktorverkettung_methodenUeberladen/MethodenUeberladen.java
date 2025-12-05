package _08_tag_konstruktorverkettung_methodenUeberladen;

public class MethodenUeberladen {
    // Methode 1: nimmt einen int
    public static void printNumber(int n) {
        System.out.println("int-Version: " + n);
    }

    // Methode 2: gleiche Methode, aber mit double
    public static void printNumber(double n) {
        System.out.println("double-Version: " + n);
    }

    // Methode 3: gleiche Methode, aber mit zwei Parametern
    public static void printNumber(int a, int b) {
        System.out.println("zwei int-Parameter: " + a + ", " + b);
    }

    public static void main(String[] args) {


        printNumber(5);        // ruft die int-Version auf
        printNumber(5.5);      // ruft die double-Version auf
        printNumber(3, 7);     // ruft die Version mit zwei Parametern auf
    }
}
