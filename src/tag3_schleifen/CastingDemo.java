package tag3_schleifen;

public class CastingDemo {


    public static void main(String[] args) {

        // Implizites Casting (Widening) – automatisch, kein Informationsverlust
        int a = 100;
        double b = a; // int -> double
        System.out.println("int -> double: " + b);

        // Explizites Casting (Narrowing) – manuell, Informationsverlust möglich
        double d = 9.75;
        int e = (int) d; // double -> int
        System.out.println("double -> int: " + e);

        // Char und int Cast
        char c = 'A'; // 'A' = 65
        int ascii = c; // char -> int
        System.out.println("char -> int: " + ascii);

        int code = 66;
        char c2 = (char) code; // int -> char
        System.out.println("int -> char: " + c2);
    }

}
