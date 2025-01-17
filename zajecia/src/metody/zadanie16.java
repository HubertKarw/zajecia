package metody;

/*
Zadanie 16
Napisz metodę isSorted(int[] array), która przyjmuje tablicę liczb całkowitych i zwraca true,
 jeśli tablica jest posortowana rosnąco, lub false w przeciwnym razie.
 W funkcji main przetestuj tę metodę z różnymi tablicami i wyświetl wyniki.
 */
public class zadanie16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7};
        int[] array2 = {2, 65, 1, 3, 5, 2, 1, 3, 7};
        System.out.println(isSorted(array));
        System.out.println(isSorted(array2));
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }

        }
        return true;
    }
}
