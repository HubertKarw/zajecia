package zajecia6;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        for(int i =1; i<=n;i++){
            for (int j = n;j>i;j--){
                System.out.print(" ");
            }
            for (int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        int h =  scanner.nextInt();
        for(int i =1; i<=h;i++){
            for (int j = h;j>i;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = i-1; k>0; k--) {
                System.out.print("**");

            }
            System.out.println("");
        }
    }

}
