package OOP;

public class Reader extends User {

    public Reader(String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public void showPrivilages() {
        System.out.println("reader privilages");
    }
}
