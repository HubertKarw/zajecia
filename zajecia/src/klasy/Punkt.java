package klasy;

public class Punkt {
    /*
    adanie 8
    Napisz klasę Punkt, która ma pola x i y typu int, oznaczone jako final. Dodaj konstruktor inicjalizujący te pola.
    Spróbuj zmienić wartości tych pól w innej metodzie (powinno to spowodować błąd).
    W metodzie main utwórz obiekt klasy Punkt i wyświetl jego współrzędne.
     */
    private final int x;
    private final int y;


    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Punkt{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

}
