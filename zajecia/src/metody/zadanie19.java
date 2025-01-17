package metody;

/*
Zadanie 19
Napisz metodę insertionSort(int[] array), która sortuje przekazaną tablicę liczb całkowitych rosnąco,
używając algorytmu sortowania przez wstawianie (insertion sort). Nie używaj wbudowanych metod sortujących.
W funkcji main utwórz tablicę z nieposortowanymi liczbami, wywołaj metodę insertionSort,
a następnie wyświetl posortowaną tablicę.
 */
public class zadanie19 {
    public static void main(String[] args) {
        int[] array = {10, 1, 12, 4, 5};
        int[] sortedArray = insertionSort(array);
        printArray(sortedArray);
    }

    private static void printArray(int[] array) {
        for (int i : array
        ) {
            System.out.print(i + ", ");

        }
    }

    private static int[] insertionSort(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
        return array;

    }

}
