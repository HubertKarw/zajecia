package zajecia7;

import java.util.Scanner;

/*Zadanie 3
Napisz program, który tworzy tablicę 5 liczb rzeczywistych,
pobiera wartości od użytkownika, a następnie oblicza i wyświetla sumę oraz średnią tych liczb.

 */
public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[5];
        System.out.println("Give 5 real numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextFloat();
        }
        float sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArray += array[i];
        }
        System.out.println("sum: " + sumOfArray);
        System.out.println("average: " + (float) sumOfArray / array.length);

    }
}
