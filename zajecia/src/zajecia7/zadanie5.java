package zajecia7;

import java.util.Scanner;

/*
Zadanie 5
Napisz program, który zlicza, ile razy dany element (podany przez użytkownika) występuje w tablicy liczb całkowitych.
 */
public class zadanie5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int targetNumber = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (targetNumber == array[i]) {
                counter++;
            }
        }
        System.out.println("n wystepuje: " + counter + " razy");
    }
}
