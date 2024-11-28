package metody;

/*
Zadanie 13
Napisz metodę displaySecretMessage(), która wewnątrz wywołuje prywatną metodę getSecretMessage().
Metoda getSecretMessage() powinna zwracać napis "To jest tajna wiadomość".
Metoda displaySecretMessage() wyświetla tę wiadomość. Wywołaj metodę displaySecretMessage() w funkcji main.
 */
public class zadanie13 {
    public static void main(String[] args) {
        displaySecretMessage();
    }

    public static String getSecretMessage() {
        return "To jest tajna wiadomość";
    }

    public static void displaySecretMessage() {
        System.out.println(getSecretMessage());
    }
}
