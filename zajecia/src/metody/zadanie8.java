package metody;

import java.util.Arrays;

/*
Zadanie 8
Napisz metodę printArray(int[] array), która wypisuje elementy tablicy liczb całkowitych na ekranie,
oddzielone przecinkami. Wywołaj tę metodę w funkcji main.
 */
public class zadanie8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 32, 4, 5};
        printArray(array);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array)
                .forEach(s -> {
                    System.out.print(s);
                    System.out.print(", ");
                });
    }
}
