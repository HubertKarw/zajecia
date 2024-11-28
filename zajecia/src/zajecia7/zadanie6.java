package zajecia7;

/*
Zadanie 6
Napisz program, który dla podanej tablicy liczb całkowitych znajduje i wyświetla największą i najmniejszą wartość.
 */
public class zadanie6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10, 20, 3, 5, 14};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max: " + max + " min: " + min);
    }
}
