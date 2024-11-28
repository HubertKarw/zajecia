package metody;

/*
Zadanie 9
Napisz program, który pokazuje, że zmienne lokalne w różnych metodach są od siebie niezależne.
Utwórz metodę testScope(int x), która zmienia wartość parametru x i wyświetla ją.
W funkcji main zadeklaruj zmienną x, wywołaj metodę testScope, a następnie wyświetl wartość x w main.

 */
public class zadanie9 {
    public static void main(String[] args) {
        int x = 10;
        testScope(x);
        System.out.println(x);
    }

    private static void testScope(int x) {
        x++;
        System.out.println(x);
    }
}
