package zajecia7;

import java.util.Scanner;

/*
Zadanie 8
Napisz program, który kopiuje jedną tablicę liczb całkowitych do drugiej w odwrotnej kolejności (odwraca kolejność elementów).
 */
public class zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        System.out.println("1st array");
        for (int i = 0; i < arraySize; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("second array");
        for (int i = arraySize - 1; i >= 0; i--) {
            array2[i] = array1[arraySize - 1 - i];
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array2[i]);
        }
    }
}
