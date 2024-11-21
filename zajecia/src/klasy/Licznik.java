package klasy;

public class Licznik {
    /*
    Zadanie 20
Napisz klasę Licznik, która ma pole instancyjne liczbaInstancji oraz pole statyczne liczbaObiektow.
Inkrementuj liczbaInstancji w konstruktorze i liczbaObiektow w statycznym bloku inicjalizacyjnym.
W metodzie main utwórz kilka obiektów klasy Licznik i wyświetl wartości obu pól dla każdego obiektu.
     */
    //Liczba instancji i obiektóó w tym przypadku nie liczy tego co powinna ale pewnie zauważenie tego było celem zadania
    private int liczbaInstancji;
    private static int liczbaObiektow = 0;

    Licznik(){
        liczbaInstancji++;
    }

    public int getLiczbaInstancji() {
        return liczbaInstancji;
    }

    public static int getLiczbaObiektow() {
        return liczbaObiektow;
    }

    static {
        liczbaObiektow++;
    }
}
