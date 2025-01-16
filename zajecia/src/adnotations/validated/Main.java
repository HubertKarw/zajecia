package adnotations.validated;

public class Main {
    public static void main(String[] args) {

        UserInput user1 = new UserInput("alice@example.com", "Alice", "password");
        UserInput user2 = new UserInput("alice@example.com", "Alice", "Pass123!");

        try {
            ValidationProcessor.validateObject(user1);
            System.out.println("user1 OK");
        } catch (ValidationException e) {
            System.out.println("Błąd walidacji user1: " + e.getMessage());
        }

        try {
            ValidationProcessor.validateObject(user2);
            System.out.println("user2 OK");
        } catch (ValidationException e) {
            System.out.println("Błąd walidacji user2: " + e.getMessage());
        }

    }
}
