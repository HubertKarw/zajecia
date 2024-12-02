package exceptions;

public class InvalidIndexException extends Exception {
    /*
Zadanie 7
Tworzenie własnego wyjątku

Zdefiniuj własny wyjątek InvalidIndexException, który dziedziczy po Exception. Napisz metodę getElement(int[] array, int index),
która zwraca element tablicy o podanym indeksie. Jeśli indeks jest poza zakresem tablicy, metoda powinna rzucić
InvalidIndexException z odpowiednim komunikatem. W metodzie main wywołaj tę metodę i obsłuż wyjątek.

 */
    public InvalidIndexException() {
        super();
    }
}
