package generics;
/*
Zadanie 2
Klasa generyczna z jednym polem

Utwórz klasę generyczną Holder<T> przechowującą pojedynczą wartość typu T.
Dodaj metody setValue(T value) i getValue() do ustawiania i pobierania wartości.
W main utwórz obiekt Holder<String> oraz Holder<Integer>, ustaw wartości i wyświetl je.
 */
public class Holder <T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
