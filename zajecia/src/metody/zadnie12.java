package metody;

/*
Zadanie 12
Napisz metodę sumVarargs(int... numbers), która przyjmuje zmienną liczbę parametrów typu int i zwraca ich sumę.
Wywołaj tę metodę w funkcji main z różną liczbą argumentów i wyświetl wyniki.
 */
public class zadnie12 {
    private static int sumVarargs(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}
