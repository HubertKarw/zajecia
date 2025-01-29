package zajecia5;

public class zadanie3 {
    public static void main(String[] args) {
        /*
        Zadanie 3
Napisz program, który na podstawie podanej temperatury wyświetla komunikat: poniżej 0 - "Mróz", 0-10 - "Zimno",
11-20 - "Chłodno", 21-30 - "Ciepło", powyżej 30 - "Gorąco". Wykorzystaj wiele else if do klasyfikacji.
         */
        int tempertaure = 0;
        if (tempertaure > 30) {
            System.out.println("gorąco");
        } else if (tempertaure > 20) {
            System.out.println("ciepło");
        } else if (tempertaure > 10) {
            System.out.println("chłodno");
        } else if (tempertaure >= 0) {
            System.out.println("zimno");
        } else {
            System.out.println("mróz");
        }
    }
}