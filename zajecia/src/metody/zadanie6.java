package metody;

import java.util.Arrays;

/*
Zadanie 6
Napisz dwie metody o nazwie max, które przyjmują różne typy parametrów:
 */
public class zadanie6 {
    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static double max(double a, double b) {
        return a > b ? a : b;
    }

    private static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 32, 2, 1};
        System.out.println(max(array));

        System.out.println(max(10, 2));
    }
}
