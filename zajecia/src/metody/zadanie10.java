package metody;
/*
Zadanie 10
Napisz rekurencyjną metodę fibonacci(int n), 
która zwraca n-ty wyraz ciągu Fibonacciego. W funkcji main pobierz od użytkownika liczbę n, 
wywołaj metodę i wyświetl wynik.
 */
public class zadanie10 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n==1){
            return 0;
        }else if (n==2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
