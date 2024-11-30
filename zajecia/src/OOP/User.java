package OOP;

/*
Zadanie 11
Utwórz klasę abstrakcyjną Uzytkownik (User) z polami imie (String firstName) i nazwisko (String lastName).
Dodaj abstrakcyjną metodę pokazUprawnienia() (showPrivileges()), która wyświetla uprawnienia użytkownika.
Utwórz klasy Bibliotekarz (Librarian) i Czytelnik (Reader),
które dziedziczą po Uzytkownik i implementują metodę pokazUprawnienia(), wyświetlając różne uprawnienia w zależności od roli.
 */
public abstract class User extends Person {

    private boolean hasAccount;

    public User(String firstName, String lastName) {
        super(firstName, lastName);


    }

    public boolean isHasAccount() {
        return hasAccount;
    }

    public void setHasAccount(boolean hasAccount) {
        this.hasAccount = hasAccount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        if (this instanceof Reader) {
            System.out.println("im reader");
        } else if (this instanceof Librarian) {
            System.out.println("im librarian");
        }
    }

    public abstract void showPrivilages();
}
