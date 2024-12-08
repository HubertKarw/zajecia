package klasy;

public class Matematyka {
    /*
    Zadanie 13
Napisz klasę Matematyka, która ma statyczną metodę dodaj(int a, int b),
zwracającą sumę dwóch liczb, oraz metodę instancyjną pomnoz(int a, int b),
zwracającą iloczyn. W metodzie main wywołaj obie metody.
     */
    public static int dodaj(int a, int b) {
        return a + b;
    }

    public static int dodaj(int a, int b, int c) {
        return a + b + c;
    }

    public static double dodaj(double a, double b) {
        return a + b;
    }

    public int pomnoz(int a, int b) {
        return a * b;
    }
    /*
    Zadanie 17
W klasie Matematyka dodaj przeciążone metody statyczne dodaj(),
które przyjmują różne liczby parametrów (np. dwie liczby, trzy liczby).
W metodzie main wywołaj różne wersje metody dodaj.
     */
}
