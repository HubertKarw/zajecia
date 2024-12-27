package stringIBigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Collections;

public class MainBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        zadanie11(scanner);
        zadanie12(scanner);
        zadanie13(scanner);
        zadanie14();
        zadanie15(scanner);
//        //Koniec BigDecimal
        zadanie16(scanner);
        zadanie17(scanner);
        zadanie18(scanner);
        zadanie19(scanner);
        zadanie20(scanner);

    }

    public static void zadanie11(Scanner scanner) {
                /*
        Zadanie 11
        Formatowanie ceny z użyciem BigDecimal

        Napisz program, który:

        Pobiera od użytkownika cenę produktu jako String, np. "19.99".
        Konwertuje cenę na obiekt BigDecimal.
        Dodaje podatek VAT 23% do ceny (użyj metody multiply() i odpowiedniego RoundingMode).
        Wyświetla cenę brutto z dokładnością do dwóch miejsc po przecinku.
         */
        System.out.println("---ZADANIE 11---");
        System.out.println("Input Price");
        String price = scanner.nextLine();
        BigDecimal p = new BigDecimal(price);
        BigDecimal vat = new BigDecimal(1.23);
        p = p.multiply(vat).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Your price = " + p);
    }

    public static void zadanie12(Scanner scanner) {
            /*
        Zadanie 12
        Przeliczanie walut z użyciem BigDecimal

        Napisz program, który:

        Pobiera od użytkownika kwotę w dolarach amerykańskich (USD) jako String, np. "100.00".
        Konwertuje kwotę na obiekt BigDecimal.
        Przelicza kwotę na euro (EUR) przy założeniu stałego kursu wymiany, np. 1 USD = 0.85 EUR (użyj metody multiply()).
        Zaokrągla wynik do dwóch miejsc po przecinku (użyj metody setScale() i RoundingMode).
        Wyświetla kwotę w euro.
         */
        System.out.println("---ZADANIE 12---");
        System.out.println("Input amount in dollars");
        BigDecimal money = new BigDecimal(scanner.nextLine());
        BigDecimal usdToEuroExchangeRate = new BigDecimal(0.85);
        money = money.multiply(usdToEuroExchangeRate).setScale(2, RoundingMode.HALF_UP);
        System.out.println("ammount in euros = " + money + "euro");

    }

    public static void zadanie13(Scanner scanner) {
                /*
        Zadanie 13
        Porównywanie wartości BigDecimal

        Napisz program, który:

        Tworzy dwa obiekty BigDecimal o wartościach "0.1" i 0.1 (pierwszy jako String, drugi jako double).
        Porównuje je za pomocą metody equals() i wyświetla wynik.
        Porównuje je za pomocą metody compareTo() i wyświetla wynik.
         */
        System.out.println("---ZADANIE 13---");
        System.out.println("Two BigDecimals \"0.1\" and 0.1");
        BigDecimal bigDecString = new BigDecimal("0.1");
        BigDecimal bigDecDouble = new BigDecimal(0.1);
        System.out.println(bigDecString);
        System.out.println(bigDecDouble);
        System.out.println(bigDecString.equals(bigDecDouble));
        System.out.println(bigDecString.compareTo(bigDecDouble));

    }

    public static void zadanie14() {
                /*
        Zadanie 14
        Operacje na BigDecimal bez utraty precyzji

        Napisz program, który:

        Oblicza sumę dziesięciu wartości 0.1 dodanych do siebie na trzy sposoby:
        Używając typu double.
        Używając BigDecimal, tworząc obiekty z typu double.
        Używając BigDecimal, tworząc obiekty z typu String.
        Wyświetla wyniki wszystkich trzech obliczeń.

         */
        System.out.println("---ZADANIE 14---");
        BigDecimal stringForAddition = new BigDecimal("0.1");
        BigDecimal stringForAddition2 = new BigDecimal(0.1);
        System.out.println("doubles: " + (0.1 + 0.1 + 0.1));
        System.out.println("doubles in BigDecimal(value of): " + (BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.1)))));
        System.out.println("Str in BigDecimal: " + (stringForAddition.add(stringForAddition).add(stringForAddition)));
        System.out.println("double in BigDecimal: " + (stringForAddition2.add(stringForAddition2).add(stringForAddition2)));

    }

    public static void zadanie15(Scanner scanner) {
        /*
        Zadanie 15
        Podział kwoty na równe części

        Napisz program, który:

        Pobiera od użytkownika kwotę do podziału (jako String) oraz liczbę osób (int).
        Konwertuje kwotę na BigDecimal.
        Dzieli kwotę na równe części między osoby, zaokrąglając do dwóch miejsc po przecinku (użyj metody divide() z odpowiednim RoundingMode).
        Oblicza resztę, która pozostaje po podziale.
                Wyświetla, ile każda osoba powinna otrzymać oraz jaka kwota pozostaje niepodzielona.
                */
        System.out.println("---ZADANIE 15---");
        System.out.println("input money to split and how many people to split it between");
        String moneyToSplitString = scanner.nextLine();
        //int precision = moneyToSplitString.length()+2;
        //System.out.println(precision);
        BigDecimal moneyToSplit = new BigDecimal(moneyToSplitString);
        int peopleToSplit = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Everyone gets: " + moneyToSplit.divide(BigDecimal.valueOf(peopleToSplit), 2, RoundingMode.DOWN));
        System.out.println("there is: " +
                moneyToSplit.subtract((moneyToSplit
                        .divide(BigDecimal.valueOf(peopleToSplit), 2, RoundingMode.DOWN))
                        .multiply(BigDecimal.valueOf(peopleToSplit)))
                + " left");
        System.out.println("Every1 gets: "
                + moneyToSplit.multiply(BigDecimal.valueOf(100)).divideAndRemainder(BigDecimal.valueOf(peopleToSplit))[0].movePointLeft(2)
                + "left: "
                + moneyToSplit.multiply((BigDecimal.valueOf(100))).divideAndRemainder(BigDecimal.valueOf(peopleToSplit))[1].movePointLeft(2));

    }

    public static void zadanie16(Scanner scanner) {
        /*
        walidacja numeru ISBN


        Napisz program, który:

        Pobiera od użytkownika łańcuch znaków reprezentujący numer ISBN-10 (10 cyfr).
        Sprawdza, czy numer jest prawidłowy, stosując algorytm weryfikacji ISBN-10.
        Wyświetla odpowiedni komunikat.
                */
        System.out.println("---ZADANIE 16---");
        System.out.println("input ISBN");
        BigDecimal isbn = new BigDecimal(scanner.nextLine());
        int sum = 0;
        try{
            for (int i = 0; i < 10; i++) {
                sum += (int) isbn.toPlainString().charAt(i) * i;
            }
            if (sum % 11 == 0) {
                System.out.println("valid ISBN");
            } else {
                System.out.println("not valid");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("wrong length");
        }


    }

    public static void zadanie17(Scanner scanner) {
        /*
        Zadanie 17
        Formatowanie tekstu

        Napisz program, który:

        Pobiera od użytkownika łańcuch znaków text.
        Usuwa z text wszystkie znaki interpunkcyjne (kropki, przecinki, wykrzykniki, pytajniki itp.).
        Zamienia wielokrotne spacje na pojedyncze (użyj metody replaceAll() z wyrażeniami regularnymi).
        Wyświetla sformatowany tekst.

         */
        System.out.println("---ZADANIE 17---");
        System.out.println("input STRING");
        String text = scanner.nextLine();
        System.out.println(text.replaceAll("[!.,\"\'?]", "").replaceAll("\s+", "\s"));
    }

    public static void zadanie18(Scanner scanner) {
        /*
        Zadanie 18
        Zliczanie samogłosek i spółgłosek

        Napisz program, który:

        Pobiera od użytkownika łańcuch znaków text.
        Zlicza liczbę samogłosek i spółgłosek w text.
        Wyświetla wyniki.
         */
        System.out.println("---ZADANIE 18---");
        System.out.println("input STRING");
        String text = scanner.nextLine();
        //[a-z]^[samogłoski]
        Matcher matcher = Pattern.compile("[aeouiąęó]").matcher(text.toLowerCase(Locale.ROOT));
        Matcher matcher2 = Pattern.compile("[^aeouiąęó]").matcher(text.toLowerCase(Locale.ROOT));// \w
        System.out.println(matcher.results().count());
        System.out.println(matcher2.results().count());
    }

    public static void zadanie19(Scanner scanner) {
        /*
        Zadanie 19
        Znajdowanie najczęściej występującego słowa

        Napisz program, który:

        Pobiera od użytkownika łańcuch znaków text.
        Znajduje i wyświetla słowo, które występuje najczęściej w text.
        Wyświetla liczbę wystąpień tego słowa.
         */
        System.out.println("---ZADANIE 19---");
        System.out.println("input STRING");
        String text = scanner.nextLine();
        String[] textSplit = text.split("\s");
        Map<String, Long> result = Arrays.stream(textSplit).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(Collections.max(result.entrySet(), Map.Entry.comparingByValue()).getKey());
        System.out.println(Collections.max(result.entrySet(), Map.Entry.comparingByValue()).getValue());
    }

    public static void zadanie20(Scanner scanner) {
        /*
                Zadanie 20
        Dzielenie z różnymi trybami zaokrąglania w BigDecimal

        Napisz program, który:

        Pobiera od użytkownika licznik i mianownik (jako String), np. "10" i "3".
        Konwertuje wartości na obiekty BigDecimal.
        Dzieli licznik przez mianownik, używając różnych trybów zaokrąglania (RoundingMode.HALF_UP, RoundingMode.HALF_DOWN, RoundingMode.CEILING, RoundingMode.FLOOR).
        Wyświetla wyniki dla każdego trybu zaokrąglania z dokładnością do dwóch miejsc po przecinku.

         */
        System.out.println("---ZADANIE 20---");
        System.out.println("input 1st number");
        BigDecimal num1 = new BigDecimal(scanner.nextLine());
        System.out.println("input 2nd number");
        BigDecimal num2 = new BigDecimal(scanner.nextLine());
        System.out.println(num1.divide(num2, 2, RoundingMode.HALF_DOWN));
        System.out.println(num1.divide(num2, 2, RoundingMode.HALF_UP));
        System.out.println(num1.divide(num2, 2, RoundingMode.FLOOR));
        System.out.println(num1.divide(num2, 2, RoundingMode.CEILING));
        System.out.println(num1.divide(num2, 2, RoundingMode.UP));
        System.out.println(num1.divide(num2, 2, RoundingMode.DOWN));
    }

}
