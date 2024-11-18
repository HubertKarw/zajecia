package metody;
/*
Zadanie 4
Napisz metodę isEven(int number), która przyjmuje liczbę całkowitą i zwraca true, jeśli jest parzysta,
lub false w przeciwnym razie. W funkcji main pobierz liczbę od użytkownika, wywołaj metodę i wyświetl odpowiedni komunikat.

 */
public class zadanie4 {
    public static void main(String[] args) {
        System.out.println(isEven(3));
    }
    private static boolean isEven(int number){
        return number%2==0 ? true : false;
    }
}
