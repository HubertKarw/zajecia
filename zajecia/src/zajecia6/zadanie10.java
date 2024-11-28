package zajecia6;
import java. util.*;
//Zadanie 10
// Napisz program, który losuje liczbę od 1 do 100 i pozwala użytkownikowi ją odgadnąć.
// Po każdej próbie program podpowiada, czy liczba jest za duża, czy za mała. Użyj pętli while, instrukcji if i klasy Random.
public class zadanie10 {


    public static void main(String[] args) {
        var number = (int)(Math.random()*100);
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int guess;
        do{
            guess = scanner.nextInt();
            if(guess > number){
                System.out.println("za duza");
            }
            if(guess < number){
                System.out.println("za mala");
            }
        }
        while(guess!=number);
        System.out.println("zgadłes");

    }
}
