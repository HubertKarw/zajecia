package zajecia7;

import java.util.Scanner;

/*
Zadanie 7
Napisz program, który tworzy dwie tablice liczb całkowitych o tej samej długości, pobiera wartości od użytkownika,
a następnie tworzy trzecią tablicę, która jest sumą odpowiednich elementów pierwszych dwóch tablic.
 */
public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        int[] outputArray = new int[arraySize];
        System.out.println("1st array");
        for (int i = 0; i < arraySize; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("2nd array");
        for (int i = 0; i < arraySize; i++) {
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            outputArray[i] = (array1[i] + array2[i]);
            System.out.print(outputArray[i] + " ");


        }
    }
}
