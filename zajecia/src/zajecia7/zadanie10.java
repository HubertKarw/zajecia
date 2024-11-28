package zajecia7;

import java.util.Scanner;

/*
Zadanie 10
Napisz program, który sprawdza, czy podany przez użytkownika łańcuch znaków jest palindromem, używając tablicy znaków.

 */
public class zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        char[] charArray = userInput.toCharArray();
        boolean palindrome = true;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}
