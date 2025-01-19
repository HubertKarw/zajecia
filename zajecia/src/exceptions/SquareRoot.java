package exceptions;

import java.util.Scanner;

/*
Zadanie 1
Podstawowe rzucanie wyjątku

Napisz program, który pobiera od użytkownika liczbę całkowitą i oblicza jej pierwiastek kwadratowy.
Jeśli użytkownik poda liczbę ujemną, program powinien rzucić IllegalArgumentException z komunikatem "Number cannot be negative".


 */
/*
Zadanie 2
Obsługa wyjątku w funkcji

Zmodyfikuj program z Zadania 1 tak, aby przenieść logikę obliczeń do osobnej funkcji calculateSquareRoot(int number).
Wewnątrz tej funkcji obsłuż wyjątek IllegalArgumentException za pomocą bloku try-catch. W przypadku wystąpienia wyjątku,
zwróć wartość -1 i wyświetl komunikat "Error: Number cannot be negative".


 */
/*
Zadanie 3
Blok finally

Dodaj do programu z Zadania 2 blok finally w funkcji calculateSquareRoot(int number),
który wyświetli komunikat "Calculation completed". Upewnij się, że komunikat ten wyświetla się niezależnie od tego,
czy wyjątek wystąpił, czy nie.

 */
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(calculateSquareRoot(number));
    }

    public static double calculateSquareRoot(int number) {
        double sqrt = -1;
        try {
            assertValidArgument(number);
            sqrt = Math.sqrt(number);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        } finally {
            System.out.println("Calculation completed");
        }
        return sqrt;

    }
    public static void assertValidArgument(int number){
         if(number < 0){
             throw new IllegalArgumentException("Error: Number cannot be negative");
         }
    }
}

