package zajecia6;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        int exit = 1;
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("input option 1-add 2-minus 3- exit");

            int n = 0;
            n = scanner.nextInt();
            switch (n){
                case 1:
                    System.out.println("opcja1");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    System.out.println(x+y);
                    break;
                case 2:
                    System.out.println("opcja2");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    System.out.println(x-y);
                    break;
                case 3:
                    exit = 0;
                    break;
            }
        }while(exit != 0);
    }
}
