package zajecia7;

/*
Zadanie 13
Napisz program, który znajduje drugą co do wielkości wartość w tablicy liczb całkowitych.

 */
public class zadanie13 {
    public static void main(String[] args) {
        int highest = 0;
        int secondHighest = 0;
        int[] array = {1, 2, 3, 4, 5, 5, 10, 3, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            }
            if (secondHighest < array[i] && array[i] != highest) {
                secondHighest = array[i];
            }
        }

        System.out.println(secondHighest);
    }
}
