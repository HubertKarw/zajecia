package OOP;

public class Librarian extends User {

    public Librarian(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showPrivilages() {
        System.out.println("Librarian privilages");
    }
}
