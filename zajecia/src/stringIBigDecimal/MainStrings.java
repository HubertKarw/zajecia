package stringIBigDecimal;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class MainStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        zadanie1(scanner);
//        zadanie2(scanner);
//        zadanie3(scanner);
//        zadanie4(scanner);
//        zadanie5(scanner);
//        zadanie6(scanner);
//        zadanie7(scanner);
//        zadanie8(scanner);
//        zadanie9(scanner);
        zadanie10(scanner);
    }

    public static void zadanie1(Scanner scanner) {
                /*
        Zadanie 1
Podstawowe operacje na Stringach

Napisz program, który:

Pobiera od użytkownika dwa łańcuchy znaków (String) i zapisuje je w zmiennych str1 i str2.
Wyświetla długość obu łańcuchów (użyj metody length()).
Sprawdza, czy oba łańcuchy są identyczne (użyj metody equals()).
Łączy oba łańcuchy w jeden i wyświetla wynik.
         */

        System.out.println("---ZADANIE 1---");
        System.out.println("input 2 Strings");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(String.format("String 1 length: %d, String 2 length: %d", str1.length(), str2.length()));
        System.out.println(String.format("String 1 and 2 are the same: %b String 1: %s, String 2: %s", str1.equals(str2), str1, str2));
        System.out.println(String.format("String 1 and 2 connected are:%s", str1.concat(str2)));
    }

    public static void zadanie2(Scanner scanner) {
        /*
        Zadanie 2
        Manipulacja znakami w Stringu

        Napisz program, który:

        Pobiera od użytkownika łańcuch znaków str.
        Wyświetla pierwszy i ostatni znak tego łańcucha (użyj metody charAt()).
                Tworzy podłańcuch zawierający znaki od trzeciego do szóstego (użyj metody substring()).
                Wyświetla podłańcuch.

                */
        System.out.println("---ZADANIE 2---");
        System.out.println("Input String");
        String str = scanner.nextLine();
        if(str.length()==0){
            throw new IllegalArgumentException();
        }
        System.out.println(String.format("First char is: %c, Last char is: %c", str.charAt(0), str.charAt((int) str.length() - 1)));
        try {
            System.out.println(String.format("substring between 3 and 6: %s", str.substring(2, 6)));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("string too small");
        }
    }

    public static void zadanie3(Scanner scanner) {
        /*
Zadanie 3
Zmiana wielkości liter i usuwanie spacji

Napisz program, który:

Pobiera od użytkownika łańcuch znaków str.
Usuwa początkowe i końcowe spacje z łańcucha (użyj metody trim()).
Konwertuje łańcuch na wielkie litery (użyj metody toUpperCase()).
Wyświetla wynik
 */
        System.out.println("---ZADANIE 3---");
        System.out.println("input String");
        String str = scanner.nextLine();
        String bigStr = str.toUpperCase(Locale.ROOT);
        //Dodałem nawiasy, żeby było widać usunięte spacje
        System.out.println(String.format("Trimmed String: [%s]", str.trim()));
        System.out.println(String.format("To Upper Case String: [%s]", bigStr));
        System.out.println(String.format("Converted String: [%s]", bigStr));
    }

    public static void zadanie4(Scanner scanner) {
        /*
Zadanie 4
Wyszukiwanie podłańcucha

Napisz program, który:

Pobiera od użytkownika łańcuch znaków text oraz podłańcuch subtext.
Sprawdza, czy text zawiera subtext (użyj metody contains()).
Jeśli tak, wyświetla indeks pierwszego wystąpienia subtext w text (użyj metody indexOf()).
Jeśli nie, wyświetla odpowiedni komunikat.
 */
        System.out.println("---ZADANIE 4---");
        System.out.println("input text");
        String text = scanner.nextLine();
        System.out.println("input subtext");
        String subtext = scanner.nextLine();
        if (text.contains(subtext)) {
            System.out.println(String.format("The subtext in your text starts at index : %d", text.indexOf(subtext)));
        } else {
            System.out.println(String.format("There is no subtext: %s, in String: %s", subtext, text));
        }
    }

    public static void zadanie5(Scanner scanner) {
        /*
        Zadanie 5
Zamiana znaków w Stringu

Napisz program, który:

Pobiera od użytkownika łańcuch znaków str.
Zamienia wszystkie wystąpienia litery a na literę e (użyj metody replace()).
Wyświetla oryginalny i zmodyfikowany łańcuch.
         */
        System.out.println("---ZADANIE 5---");
        System.out.println("Input String");
        String str = scanner.nextLine();
        System.out.println(String.format("Your string: %s, string where a is replaced with e: %s", str, str.replace("a", "e")));
    }

    public static void zadanie6(Scanner scanner) {
        /*
        Zadanie 6
        Porównywanie Stringów

        Napisz program, który:

        Pobiera od użytkownika dwa łańcuchy znaków str1 i str2.
                Sprawdza, czy łańcuchy znaków są takie same bez względu na wielkość liter (użyj metody equalsIgnoreCase()).
        Wyświetla odpowiedni komunikat.
                */
        System.out.println("---ZADANIE 6---");
        System.out.println("input 2 Strings");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(String.format("String 1 and 2 are the same: %b String 1: %s, String 2: %s", str1.equalsIgnoreCase(str2), str1, str2));
    }

    public static void zadanie7(Scanner scanner) {
        /*
        Zadanie 7
Sprawdzenie prefiksu i sufiksu

Napisz program, który:

Pobiera od użytkownika łańcuch znaków filename.
Sprawdza, czy filename zaczyna się od "data_" i kończy na ".txt" (użyj metod startsWith() i endsWith()).
Wyświetla odpowiedni komunikat.
         */
        System.out.println("---ZADANIE 7---");
        System.out.println("Input filename");
        String filename = scanner.nextLine();
        System.out.println(String.format("String: %s contains \"data_\" at the start : %b, and \".txt\" at the end: %b",
                filename, filename.startsWith("data_"), filename.endsWith(".txt")));
    }

    public static void zadanie8(Scanner scanner) {
        /*
Zadanie 8
Rozbijanie Stringa na tablicę

Napisz program, który:

Pobiera od użytkownika łańcuch znaków zawierający listę słów oddzielonych przecinkami, np. "jabłko,banan,gruszka".
Rozbija łańcuch na tablicę słów (użyj metody split()).
Wyświetla każde słowo w osobnej linii.
         */
        System.out.println("---ZADANIE 8---");
        System.out.println("Input list");
        String listString = scanner.nextLine();
        String[] list = listString.split(",");
        if(list.length == 0){
            throw new IllegalArgumentException();
        }
        Arrays.stream(list).forEach(System.out::println);
    }

    public static void zadanie9(Scanner scanner) {
        /*
        Zadanie 9
Palindrom

Napisz program, który:

Pobiera od użytkownika łańcuch znaków str.
Usuwa z łańcucha wszystkie spacje i zamienia litery na małe (użyj metod replaceAll() i toLowerCase()).
Sprawdza, czy str jest palindromem (czytany od przodu i od tyłu jest taki sam).
Wyświetla odpowiedni komunikat.
         */
        System.out.println("---ZADANIE 9---");
        System.out.println("Input String");
        String str = scanner.nextLine();
        String palindromeString = str.toLowerCase(Locale.ROOT).replaceAll(" ", "");
        String reversed = new StringBuilder(palindromeString).reverse().toString(); System.out.println(String.format("String is a palindrome: %b", palindromeString.equals(reversed)));

    }

    public static void zadanie10(Scanner scanner) {
        /*
        Zadanie 10
Zliczanie wystąpień słowa

Napisz program, który:

Pobiera od użytkownika łańcuch znaków text oraz słowo word.
Zlicza, ile razy word występuje w text.
Wyświetla wynik.
         */
        System.out.println("---ZADANIE 10---");
        System.out.println("Input text");
        String text = scanner.nextLine();
        System.out.println("Input word");
        String word = scanner.nextLine();
        Pattern patern = Pattern.compile(word,Pattern.CASE_INSENSITIVE);
        Matcher matcher = patern.matcher(text);
        int counter = 0;
        for (String w: text.split(" ")) {
            if (matcher.find()){
                counter++;
            }
        }
        System.out.println(String.format("Text : \"%s\" contains word \"%s\" [%d] times", text, word, counter));
        //  !zostawiam zakomentowane do potestowania!
//        System.out.println(String.format("Text : \"%s\" contains word \"%s\" [%d] times", text, word,
//                ("\"" + text + "\"")
//                        .toLowerCase(Locale.ROOT)
//                        .split(word)
//                        .length - 1
//        ));
        //Jeżeli poszukujemy słowa i wiemy, że będzie ono rodzielone spacją moża użyć streamu/pętli
        // który/która zlicza pojawienia się danego słowa w arrayu zesplitowanym spacją przykład na dole,
        //ale mamy użyć jak najwięcej moetod Stringa
        //                                           |
        //                                           V
//        String[] textArray = text.split(" ");
//        System.out.println();
//        System.out.println(String.format("Text : \"%s\" contains word \"%s\" [%d] times", text, word,
//                Arrays.stream(textArray)
////                        .peek(s -> System.out.println("peeked:" + s))
//                        .filter(s -> s.equals(word))
////                        .peek(s -> System.out.println("filtered: " +s))
//                        .count()
//        ));
    }

}
