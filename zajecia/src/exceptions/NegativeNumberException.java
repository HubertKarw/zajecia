package exceptions;

/*
nie 4
Rzucanie własnego wyjątku

Zdefiniuj własny wyjątek NegativeNumberException, który dziedziczy po Exception. Napisz metodę calculateSumToN(int n),
która oblicza sumę liczb od 1 do n. Jeśli n jest ujemne, metoda powinna rzucić NegativeNumberException z komunikatem
"Number cannot be negative". W metodzie main wywołaj tę metodę i obsłuż ewentualny wyjątek za pomocą try-catch.

 */
public class NegativeNumberException extends Exception {
    public NegativeNumberException(String errorMessage) {
        super(errorMessage);
    }
}
