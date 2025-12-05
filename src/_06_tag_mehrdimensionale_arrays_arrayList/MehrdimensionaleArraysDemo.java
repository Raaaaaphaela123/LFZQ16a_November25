package _06_tag_mehrdimensionale_arrays_arrayList;

import java.util.Arrays;

public class MehrdimensionaleArraysDemo {
    public static void main(String[] args) {

        //  1. Initialisierung mit Größe: 3 Zeilen, 3 Spalten, Werte sind automatisch 0
        // die Länge des äußersten Arrays muss mitgegeben werden, der Rest kann auch später definiert werden
        int[][] array2D = new int[3][3];

        array2D[0][0] = 1;

        // Ausgabe Arrays.deepToString()
        System.out.println(Arrays.deepToString(array2D));

        // Ausgabe for-i Schleife
        for (int zeile = 0; zeile < array2D.length; zeile++) {
            for (int spalten = 0; spalten < array2D[zeile].length; spalten++) {
                System.out.print(array2D[zeile][spalten] + " ");
            }
            System.out.println();
        }

        // Ausgabe for-each/enhanced for loop
        System.out.println("\nEnhanced for loop");
        for (int[] zeilen : array2D) {
            for (int spaltenWert : zeilen) {
                System.out.print(spaltenWert + " ");
            }
            System.out.println();
        }

        // 2. Initialisierung mit direkten Werten
        int[][] array2Dbefuellt = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nDirekt befüllt");
        print2DArray(array2Dbefuellt);


        // 3. Jagged (unregelmäßiges) Array (Zeilen unterschiedlich lang)

        int[][] jagged2DArray = new int[3][];
        jagged2DArray[0] = new int[2];
        jagged2DArray[1] = new int[4];
        jagged2DArray[2] = new int[1];

        System.out.println("\n Jagged:");
        print2DArray(jagged2DArray);

        // Kopie von mehrdimensionalem Array
        int[][] originalArray = {{1, 2}, {3, 4}};
        int[][] kopieArray = new int[originalArray.length][];

        for (int i = 0; i < originalArray.length; i++) {
            kopieArray[i] = Arrays.copyOf(originalArray[i], originalArray[i].length);
        }

        kopieArray[0][0] = 10;
        System.out.println("\n Kopie");
        print2DArray(kopieArray);

        // Original ist gleich geblieben:
        System.out.println("\nOriginal:");
        print2DArray(originalArray);


        /*-------------------------------------------------------------------------------------------*/

        //1. Deklaration eines 3D-Arrays
        int[][][] array3D = new int[3][3][3];

        System.out.println("\n3D Array");
        print3DArray(array3D);

    }

    // Helfermethode: Ausgabe von 2D Arrays
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Heldermethode: Ausgabe von 3D-Arrays
    public static void print3DArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Schicht " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
