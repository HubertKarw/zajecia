package metody;

import java.util.Arrays;

/*
Zadanie 7
Napisz metodę average(int[] numbers), która przyjmuje tablicę liczb całkowitych i zwraca ich średnią jako liczbę rzeczywistą.
W funkcji main utwórz tablicę, wywołaj metodę i wyświetl wynik.
 */
public class zadanie7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 3};
        System.out.println(average(numbers));
    }

    private static double average(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(Double.NaN);
    }
}
