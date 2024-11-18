package metody;

/*
Zadanie 3
Napisz metodę sum(int a, int b),
która przyjmuje dwie liczby całkowite i zwraca ich sumę. W funkcji main wywołaj tę metodę i wyświetl wynik.
 */
public class zadanie3 {
    public static void main(String[] args) {
        System.out.println("Result = " + sum(1, 2));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
