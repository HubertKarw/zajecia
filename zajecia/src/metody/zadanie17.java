package metody;
/*
Zadanie 17
Napisz rekurencyjną metodę reverseString(String str), która przyjmuje łańcuch znaków i zwraca jego odwróconą wersję.
W funkcji main pobierz łańcuch od użytkownika, wywołaj metodę i wyświetl wynik.
 */
public class zadanie17 {
    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }else{
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String resultantSting1 = reverseString("JAVATPOINT");
        String resultantSting2 = reverseString("COMPUTER");
        String resultantSting3 = reverseString("INDIA");
        System.out.println(resultantSting1);
        System.out.println(resultantSting2);
        System.out.println(resultantSting3);
    }
}
