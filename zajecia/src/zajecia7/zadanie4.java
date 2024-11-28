package zajecia7;

import java.util.Scanner;

/*
Zadanie 4
Napisz program, który tworzy tablicę 10 liczb całkowitych,
pobiera wartości od użytkownika, a następnie sprawdza, czy podana przez użytkownika liczba znajduje się w tablicy.
 */
public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println("podaj liczbe ktorej szukasz");
        int number = scanner.nextInt();
        boolean numberInArray= false;
        for (int i = 0; i < array.length; i++) {
            if(number==array[i]){
                numberInArray = true;
            }

        }
        System.out.println(numberInArray);
    }

}
