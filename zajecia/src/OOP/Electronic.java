package OOP;
/*
Zadanie 15
Utwórz interfejs Elektroniczny (Electronic) z metodą pobierz() (download()).
Utwórz klasę Ebook, która dziedziczy po Publikacja (Publication) i implementuje interfejsy ZasobBiblioteczny (LibraryResource)
oraz Elektroniczny (Electronic). Zaimplementuj metody, dodając logikę: w metodzie pobierz() sprawdź,
czy użytkownik ma uprawnienia do pobrania (np. posiada aktywne konto); jeśli nie, wyświetl komunikat o braku dostępu.
 */

public interface Electronic {
    void download(User user);
}
