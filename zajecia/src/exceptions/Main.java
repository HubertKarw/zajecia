package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        try {
//            System.out.println(calculateSumToN(-9));
//        } catch (NegativeNumberException e) {
//            e.printStackTrace();
//        }
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        try {
//            System.out.println(convertStringToInt(string));
//        } catch (NumberFormatException nfe) {
//            System.out.println("wrong string format");
//        }
//        try {
//            System.out.println(divide(1, 0));
//        } catch (ArithmeticException ae) {
//            ae.printStackTrace();
//        }
        int[] array = {0, 1, 2, 3, 4, 5};
//        try {
//            System.out.println(getElement(array, 4));
//        } catch (InvalidIndexException iie) {
//            iie.printStackTrace();
//        }
//        methodA();
    /*
    Zadanie 9
Wielokrotne catch

Napisz program, który pobiera od użytkownika dwa indeksy i zwraca sumę elementów tablicy o tych indeksach. Obsłuż dwa możliwe wyjątki:

ArrayIndexOutOfBoundsException – jeśli któryś z indeksów jest poza zakresem tablicy.
InputMismatchException – jeśli użytkownik wprowadził nieprawidłowe dane.
W obu przypadkach wyświetl odpowiedni komunikat błędu.

     */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj 2 indexy");
//
//        try{
//            int n1 = scanner.nextInt();
//            int n2 = scanner.nextInt();
//            System.out.println(array[n1] + array[n2]);
//        }catch (InputMismatchException ime){
//            ime.printStackTrace();
//            System.out.println("zly input");
//        } catch (ArrayIndexOutOfBoundsException exception) {
//            exception.printStackTrace();
//            System.out.println("index nie istniwjw");
//        }
        /*
        Zadanie 10
Zagnieżdżone bloki try-catch

Napisz program, który przetwarza tablicę liczb całkowitych. Program powinien:

Poprosić użytkownika o podanie indeksu elementu tablicy.
W bloku try, wyświetlić wartość elementu o podanym indeksie.
Wewnątrz tego bloku try, zagnieżdżony blok try powinien obliczyć odwrotność tej liczby (1 podzielone przez wartość elementu).
Obsłuż ArrayIndexOutOfBoundsException, jeśli indeks jest poza zakresem.
W zagnieżdżonym bloku try obsłuż ArithmeticException, jeśli wartość elementu to zero.
         */
////        System.out.println(1/0);
//        int index = scanner.nextInt();
//        try {
//            System.out.println(array[index]);
//            try {
//                System.out.println( 1/array[index]);
//            }catch (ArithmeticException ae){
//                ae.printStackTrace();
//                System.out.println("arithmetic error");
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("no such index");
//        }
//        try {
//            System.out.println(fibonacci(5));
//            System.out.println(fibonacci(-1));
//        }catch (IllegalArgumentException iae){
//            iae.printStackTrace();
//        }
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        try {
            checkLogin(login);
        } catch (SecurityException se) {
            System.out.println("login cannot be empty");
        }
        System.out.println("koniec programu");
    }

    public static int calculateSumToN(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        } else {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }

    /*
    Zadanie 5
Hierarchia wyjątków: różnica między checked i unchecked

Napisz program, który konwertuje łańcuch znaków podany przez użytkownika na liczbę całkowitą za pomocą metody Integer.parseInt().
Obsłuż wyjątek NumberFormatException (wyjątek niekontrolowany) za pomocą try-catch. Zademonstruj różnicę między wyjątkiem
kontrolowanym a niekontrolowanym, wyjaśniając, dlaczego NumberFormatException nie musi być zadeklarowany w sygnaturze metody.
        NumberFormatExCEPTION NIE MUSI BYĆ ZADEKLAROWANY PONIEWAŻ JEST TO UNCHECKED Exception.
        Z drugiej strony Checked exception musi mieć sygnature throws w swojej metodzie aby pokazać, że może wystąpić taki exception
        unchecked Exception jest zazwyczaj kojażony ze złym inputem/ błędem w programie
     */
    public static int convertStringToInt(String numberString) {
        int number = Integer.parseInt(numberString);

        return number;
    }

    /*
    Zadanie 6
Deklarowanie wyjątków za pomocą throws

Napisz metodę divide(int a, int b), która zwraca wynik dzielenia a przez b. Jeśli b jest zerem, metoda powinna rzucić
ArithmeticException. Zadeklaruj ten wyjątek za pomocą słowa kluczowego throws. W metodzie main wywołaj tę metodę i obsłuż wyjątek.
     */
    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return (double) a / b;
    }

    public static int getElement(int[] array, int index) throws InvalidIndexException {
        if (index >= array.length) {
            throw new InvalidIndexException();
        } else {
            return array[index];
        }
    }

    /*
    Zadanie 8
Przekazywanie wyjątków dalej

Napisz metodę methodA(), która wywołuje methodB(). Metoda methodB() rzuca wyjątek NullPointerException.
W metodzie methodA() zadeklaruj ten wyjątek za pomocą throws, ale go nie obsługuj. W metodzie main wywołaj methodA()
i obsłuż wyjątek.
     */
    public static void methodA() throws NullPointerException {
        System.out.println("Method A");
        methodB();
    }

    public static void methodB() {
        System.out.println("Method B");
        throw new NullPointerException("msg");
    }

    /*
        Zadanie 11
        Propagacja wyjątków

        Napisz metodę rekurencyjną fibonacci(int n), która zwraca n-ty wyraz ciągu Fibonacciego. Jeśli n jest mniejsze niż 0,
        metoda powinna rzucić IllegalArgumentException. Nie obsługuj wyjątku w tej metodzie; pozwól, aby został przekazany
        do miejsca wywołania. W metodzie main wywołaj fibonacci() i obsłuż ewentualny wyjątek.


     */
    private static int fibonacci(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /*
    Zadanie 12
    Użycie słowa kluczowego throw

    Napisz metodę checkLogin(String login), która rzuca wyjątek SecurityException z komunikatem "Login cannot be empty",
    jeśli login jest pustym łańcuchem znaków. W metodzie main pobierz login od użytkownika, wywołaj checkLogin() i obsłuż wyjątek.
     */
    public static void checkLogin(String login) {
        if (login.isEmpty()) {
            throw new SecurityException();
        }
    }
}