package zajecia7;

/*
Zadanie 15
Napisz program, który transponuje podaną macierz (zamienia wiersze z kolumnami).
 */
public class zadanie15 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int temp = 0;
        int[][] outputMatrix = new int[matrix[1].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                outputMatrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < outputMatrix.length; i++) {
            for (int j = 0; j < outputMatrix[i].length; j++) {
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
