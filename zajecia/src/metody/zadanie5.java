package metody;
/*
Zadanie 5
Napisz metodę factorial(int n), która przyjmuje liczbę całkowitą n i zwraca wartość n!
(silnia z n). Użyj pętli do obliczenia silni. Wywołaj metodę w funkcji main i wyświetl wynik.
 */
public class zadanie5 {
    private static int factorial(int n){
        if(n>=1){
            return n * factorial(n-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
