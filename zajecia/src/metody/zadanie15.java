package metody;

/*
Zadanie 15
Napisz metodę divide(int a, int b), która zwraca wynik dzielenia a / b. Metoda powinna sprawdzać, czy b nie jest zerem.
Jeśli jest, powinna wyświetlić komunikat o błędzie i zwrócić 0. W funkcji main przetestuj metodę z różnymi wartościami.
 */
public class zadanie15 {
    public static double divide(int a, int b) {
        if (b == 0) {
            System.err.println("Dzielenie przez 0");
//            Exception e = new IllegalArgumentException("Dzielenie przez 0");
//            throw e;
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println(divide(1, 2));
        System.out.println(divide(1, 0));


    }
}
