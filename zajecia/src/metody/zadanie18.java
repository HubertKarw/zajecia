package metody;

/*
Zadanie 18
Napisz metodę transposeMatrix(int[][] matrix), która przyjmuje dwuwymiarową kwadratową tablicę liczb całkowitych
i zwraca jej transponowaną wersję (zamienia wiersze z kolumnami). W funkcji main utwórz macierz, wywołaj metodę
i wyświetl oryginalną oraz transponowaną macierz.
 */
public class zadanie18 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] outputMatrix = transposeMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < outputMatrix.length; i++) {
            for (int j = 0; j < outputMatrix[i].length; j++) {
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] outputMatrix = new int[matrix[1].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                outputMatrix[i][j] = matrix[j][i];
            }
        }
        return outputMatrix;
    }

}
