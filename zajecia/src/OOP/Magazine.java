package OOP;

/*
Zadanie 3
Utwórz klasę Czasopismo (Magazine), która dziedziczy po klasie Publikacja (Publication).
Dodaj pole numerWydania (int issueNumber).
Napisz konstruktor inicjalizujący wszystkie pola.
W konstruktorze sprawdź, czy numerWydania jest dodatni; jeśli nie, ustaw wartość na 1.
Przesłoń metodę wyswietlInformacje() (displayInfo()), aby dodatkowo wyświetlała numer wydania.
 */
public class Magazine extends Publication implements LibraryResource {
    private int issueNumber;
    private boolean available;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        if (issueNumber >= 0) {
            this.issueNumber = issueNumber;
        } else {
            this.issueNumber = 1;
        }
        this.available = true;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (!hasEmpty()) {
            System.out.println("Issue Number: " + issueNumber);
        }
    }

    @Override
    public String description() {
        return super.description() + "issue Number:" + issueNumber;
    }

    @Override
    public void borrow() {
        if (this.available) {
            this.available = false;
            System.out.println("borrowed");
        } else {
            System.out.println("not available");
        }
    }

    @Override
    public void returnResource() {
        this.available = true;
    }
}
