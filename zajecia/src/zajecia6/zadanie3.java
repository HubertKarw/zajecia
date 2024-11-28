package zajecia6;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println("number " + number + " * " + i + " = " + i * number);
        }

    }
}
