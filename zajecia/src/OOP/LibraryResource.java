package OOP;

/*
Zadanie 13
Utwórz interfejs ZasobBiblioteczny (LibraryResource) z metodami wypozycz() (borrow()) i zwróć() (returnResource()).
Niech klasy Ksiazka (Book) i Czasopismo (Magazine) implementują ten interfejs.
W klasach tych dodaj pole boolean dostepny (available), które będzie śledzić dostępność zasobu.
W metodzie wypozycz() dodaj logikę sprawdzającą, czy zasób jest dostępny; jeśli tak, zmień jego status na niedostępny,
w przeciwnym razie wyświetl komunikat "Zasób jest aktualnie niedostępny".

 */
/*
Zadanie 14
Dodaj domyślną metodę zarezerwuj() (reserve()) w interfejsie ZasobBiblioteczny (LibraryResource),
która wyświetla komunikat "Zasób został zarezerwowany". W klasie Ksiazka (Book) przesłoń tę metodę,
dodając funkcjonalność polegającą na dodaniu użytkownika do tablicy rezerwacji.
W metodzie main wywołaj tę metodę na obiekcie Ksiazka i wyświetl zawartość tablicy rezerwacji.
 */
public interface LibraryResource {
    void borrow();

    void returnResource();

    default void reserve() {
        System.out.println("zasob zostal zarezerwowany");
    }
}
