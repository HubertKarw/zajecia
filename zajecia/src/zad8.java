public class zad8 {
    public static void main(String[] args) {
        /*
        Zadanie 8
Napisz program, który sprawdza, czy podane hasło ma co najmniej 8 znaków. Użyj if do sprawdzenia długości łańcucha znaków.
         */
        String password = "12345678";
        if (password.length() > 7) {
            System.out.println("8znakow");
        }
    }
}
