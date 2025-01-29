package zajecia5;

public class zad11 {
    public static void main(String[] args) {
        /*
        Zadanie 11
Napisz program, który porównuje dwie liczby i wyświetla komunikat, która z nich jest większa lub czy są równe.
Wykorzystaj if, else if, else.
         */
        int number1 = 10;
        int number2 = 10;
        if (number1 == number2) {
            System.out.println("rowne");
        } else if (number1 > number2) {
            System.out.println("num1 wiekszy");
        } else {
            System.out.println("num2 wiekszy");
        }
    }
}
