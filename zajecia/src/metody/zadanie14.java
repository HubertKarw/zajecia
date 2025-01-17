package metody;

/*
Zadanie 14
Napisz dwie metody multiply(int a, int b) i multiply(int a).
Pierwsza metoda zwraca iloczyn a * b, a druga zwraca a * 2. W funkcji main wywołaj obie metody i wyświetl wyniki.
 */
public class zadanie14 {
    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int multiply(int a) {
        return a * 2;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2));
        System.out.println(multiply(2, 3));

    }
}
