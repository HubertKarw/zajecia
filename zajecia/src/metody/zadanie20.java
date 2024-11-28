package metody;

/*
Zadanie 20
Napisz następujące metody do analizy łańcucha znaków:

int countVowels(String text) – zwraca liczbę samogłosek w podanym tekście.
int countConsonants(String text) – zwraca liczbę spółgłosek w podanym tekście.
String reverseString(String text) – zwraca odwrócony łańcuch znaków.
boolean isPalindrome(String text) – sprawdza, czy podany tekst jest palindromem (ignorując wielkość liter i spacje).
W funkcji main pobierz tekst od użytkownika, wywołaj powyższe metody i wyświetl wyniki.
 */
public class zadanie20 {
    private static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' ||
                    text.charAt(i) == 'e' ||
                    text.charAt(i) == 'i' ||
                    text.charAt(i) == 'o' ||
                    text.charAt(i) == 'u' ||
                    text.charAt(i) == 'ą' ||
                    text.charAt(i) == 'ę' ||
                    text.charAt(i) == 'ó' ||
                    text.charAt(i) == 'y'
            ) {
                count++;
            }

        }
        return count;
    }

    private static int countConsonants(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 'a' &&
                    text.charAt(i) != 'e' &&
                    text.charAt(i) != 'i' &&
                    text.charAt(i) != 'o' &&
                    text.charAt(i) != 'u' &&
                    text.charAt(i) != 'ą' &&
                    text.charAt(i) != 'ę' &&
                    text.charAt(i) != 'ó' &&
                    text.charAt(i) != 'y'
            ) {
                count++;
            }

        }
        return count;
    }

    private static String reverseString(String text) {
        return zadanie17.reverseString(text);
    }

    //zad 10 zaj6
    private static boolean isPalindrome(String text) {
        char[] charArray = text.toCharArray();
        boolean palindrome = true;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String text = "kajak";
        System.out.println(countConsonants(text));
        System.out.println(countVowels(text));
        System.out.println(reverseString(text));
        System.out.println(isPalindrome(text));
    }
}
