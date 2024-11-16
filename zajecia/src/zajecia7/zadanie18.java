package zajecia7;

import java.util.Scanner;

/*
Zadanie 18*
Napisz program, który obraca kwadratową macierz NxN o 90 stopni zgodnie z ruchem wskazówek zegara.
 */
public class zadanie18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PODAJ n");
        int n = scanner.nextInt();
        System.out.println("podaj macierz");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int[][] outputMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                outputMatrix[i][j] = matrix[n - j - 1][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
