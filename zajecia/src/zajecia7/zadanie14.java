package zajecia7;

/*Zadanie 14
Napisz program, który mnoży dwie macierze 2x2 i wyświetla wynik.

 */
public class zadanie14 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };
        int[][] matrix3 = new int[2][2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                for (int k = 0; k < matrix3.length; k++) {
//                    System.out.println(matrix1[i][k]);
//                    System.out.println(matrix2[k][j]);
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
