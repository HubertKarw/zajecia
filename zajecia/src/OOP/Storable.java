package OOP;

/*
Zadanie 21
Utwórz interfejs Przechowywalny (Storable), który deklaruje metody zapisz() (save()) i wczytaj() (load()).
Zmień klasę Publikacja (Publication), aby implementowała ten interfejs. W metodach zapisz() i wczytaj()
dodaj logikę symulującą zapis i odczyt danych (np. użyj zmiennej boolean zapisano (saved) do śledzenia stanu).
Wyświetl odpowiednie komunikaty w zależności od stanu.
 */
/*
Zadanie 22
Dodaj domyślną metodę archiwizuj() (archive()) w interfejsie Przechowywalny (Storable), która wyświetla komunikat "Publikacja została zarchiwizowana".
W klasie Ksiazka (Book) przesłoń tę metodę, dodając logikę sprawdzającą, czy publikacja była wcześniej zapisana; jeśli nie, wyświetl komunikat
"Nie można zarchiwizować niezapisanej publikacji".
W metodzie main zademonstruj działanie obu wersji metody archiwizuj().
 */
public interface Storable {
    void save();

    void load();

    default void archive() {
        System.out.println("Publikacja została zarchiwizowana");
    }
}
