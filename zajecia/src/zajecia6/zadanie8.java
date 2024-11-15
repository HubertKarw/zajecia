package zajecia6;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        int exit = 1;
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("input option \"+\"-add \"-\"-minus, \"*\"-multiply, \"\\\"divide \"x\"- exit");

            String n = "c";
            n = scanner.nextLine();
            switch (n){
                case "+":
                    System.out.println("add");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    System.out.println(x+y);
                    scanner.nextLine();
                    break;
                case "-":
                    System.out.println("subtract");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    System.out.println(x-y);
                    scanner.nextLine();
                    break;
                case "*":
                    System.out.println("multiply");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(x*y);
                    break;
                case "/":
                    System.out.println("divide");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    scanner.nextLine();
                    if (y==0){
                        System.out.println("cant divide by zero");
                        break;
                    }
                    System.out.println(x/y);
                    break;
                case "x":
                    exit = 0;
                    break;
                default:
                    System.out.println("character not recognised");

            }
        }while(exit != 0);
    }
}
