package OOP;

/*
Zadanie 2
Utwórz klasę Ksiazka (Book), która dziedziczy po klasie Publikacja (Publication).
Dodaj pole liczbaStron (int pageCount). Napisz konstruktor inicjalizujący wszystkie pola. W konstruktorze sprawdź,
czy liczbaStron jest większa od zera; jeśli nie, ustaw domyślną wartość 100. Przesłoń metodę wyswietlInformacje()
(displayInfo()), aby dodatkowo wyświetlała liczbę stron.
 */
/*
Zadanie 6
Użyj słowa kluczowego super w klasie Ksiazka (Book), aby odwołać się do konstruktora klasy bazowej Publikacja
(Publication). Upewnij się, że konstruktor Ksiazka wywołuje konstruktor Publikacja za pomocą super.
Dodaj w konstruktorze Ksiazka instrukcję warunkową,
która sprawdza, czy tytuł zawiera więcej niż 3 znaki; jeśli nie, ustaw tytuł na "Nieznany".
 */
public class Book extends Publication implements LibraryResource {
    private int pageCount;
    private boolean available;
    private User[] reservedList = new User[10];

    public User[] getReservedList() {
        return reservedList;
    }

    public void reserve(User user) {
        LibraryResource.super.reserve();
        for (int i = 0; i < reservedList.length; i++) {
            if (reservedList[i] == null) {
                reservedList[i] = user;
                break;
            }
        }
    }

    public Book(String title, String author, int pageCount) {
        super(title.length() < 3 ? "nieznany" : title, author);
        if (pageCount > 0) {
            this.pageCount = pageCount;
        } else {
            this.pageCount = 100;
        }
        this.available = true;
    }

    @Override
    public void archive() {
        if (isSaved) {
            super.archive();
        } else {
            System.out.println("cant archivise unsaved book");
        }
    }

    public boolean hasEmpty() {
        if (title.equals("") || title.isEmpty() || author.equals("") || author.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (!this.hasEmpty()) {
            System.out.println("Num of pages: " + pageCount);
        }
    }

    @Override
    public String description() {
        return super.description() + "page count:" + pageCount;
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
