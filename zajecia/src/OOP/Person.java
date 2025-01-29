package OOP;

/*
Zadanie 18
Utwórz klasę Osoba (Person), która ma metodę przedstawSie() (introduceYourself()),
wyświetlającą imię i nazwisko. Klasa Uzytkownik (User) powinna dziedziczyć po klasie Osoba.
Użyj słowa kluczowego super, aby wywołać metodę przedstawSie() z klasy Osoba w metodzie przedstawSie() klasy Uzytkownik,
dodając informacje o roli użytkownika (np. "Jestem czytelnikiem").
ablicy).
 */
public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void introduceYourself() {
        String toPrint = String.format("Name: [%s], Last Name:[%s]", firstName, lastName);
        System.out.println(toPrint);
    }
}
