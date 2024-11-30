package klasy;

public class Singleton {
    /*
    Zadanie 18
    Napisz klasę Singleton, która ma prywatny konstruktor i publiczną statyczną metodę getInstance(),
    zwracającą jedyną instancję tej klasy. W metodzie main spróbuj utworzyć obiekt klasy Singleton bezpośrednio
    (powinno to być niemożliwe) oraz za pomocą metody getInstance().
     */
    private static Singleton single_instance = null;
    public String s;

    private Singleton() {
        s = "Singleton Class String";
    }

    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}