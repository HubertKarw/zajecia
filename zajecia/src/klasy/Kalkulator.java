package klasy;

public class Kalkulator {
    /*
    Zadanie 9
Napisz klasę Kalkulator, która ma publiczną metodę obliczSume(int a, int b), zwracającą sumę dwóch liczb.
Implementacja tej metody powinna używać prywatnej metody dodaj(int a, int b).
W metodzie main utwórz obiekt klasy Kalkulator i oblicz sumę dwóch liczb.
     */
    private int dodaj(int a, int b) {
        return a + b;
    }

    public void obliczSume(int a, int b) {
        System.out.println(this.dodaj(a, b));
    }
}
