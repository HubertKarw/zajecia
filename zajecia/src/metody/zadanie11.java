package metody;

/*
Zadanie 11
Napisz metodę userInfo(String name, int age, char gender), która przyjmuje imię, wiek i płeć użytkownika,
a następnie wyświetla komunikat w formacie: "Imię: [name], Wiek: [age], Płeć: [gender]".
 */
public class zadanie11 {
    public static void main(String[] args) {
        String name = "hubert";
        int age = 25;
        String gender = "male";
        userInfo(name, age, gender);
    }

    private static void userInfo(String name, int age, String gender) {
        String toPrint = String.format("Imię: [%s], Wiek: [%d], Płeć: [%s]", name, age, gender);
        System.out.println(toPrint);
    }
}
