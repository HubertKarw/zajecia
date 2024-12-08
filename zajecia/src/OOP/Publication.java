package OOP;

import java.util.Objects;

/*
Zadanie 1
Utwórz klasę Publikacja (Publication) z polami tytul (String title) i autor (String author).
Napisz konstruktor inicjalizujący te pola. Dodaj metodę wyswietlInformacje() (displayInfo()),
która wyświetla informacje o publikacji. Jeśli tytuł lub autor nie są ustawione (null lub puste),
metoda powinna wyświetlić komunikat "Brak danych o publikacji".

 */
public /*final*/ class Publication implements Storable {
    protected final String title;
    protected final String author;
    protected boolean isSaved;

    public Publication(String title, String author) {
        this.title = title;
        this.author = author;
        this.isSaved = false;
    }

    public boolean hasEmpty() {
        return title.equals("") || title.isEmpty() || author.equals("") || author.isEmpty();
    }

    /*
    Zadanie 24
    W klasie Publikacja (Publication) oznacz metodę wyswietlInformacje() (displayInfo()) jako final.
    Następnie spróbuj przesłonić tę metodę w klasach Ksiazka (Book) i Czasopismo (Magazine). Zademonstruj,
    że metoda oznaczona jako final nie może być przesłonięta. W komentarzu wyjaśnij,
    dlaczego w niektórych sytuacjach warto używać modyfikatora final przy metodach, np. aby zapewnić spójność wyświetlanych informacji.
     */
    //modyfikator final na metodach jest użyteczny w momencie kiedy chcemy aby metoda była zaimplementowana tak samo w każdej
    //podklasie bez względu na to czy mte podklasy się różnią. np jeżeli mamy klasę urządzenie i chcemy odwołac się do urządzenia
    // a nie np telefonu lub laptopa. przykladem tego może być ładowanie baterii do pełne bo w każdej z podklas bateria ma maksymalnie 1000%
    public void displayInfo() {
        if (hasEmpty()) {
            System.out.println("Brak danych o publikacji");
        } else {
            System.out.println("author: " + author + "\ntitle: " + title);
        }
    }

    /*
    Zadanie 5
Nadpisz metodę toString() w klasie Publikacja (Publication), aby zwracała informacje o tytule i autorze.
W metodzie main utwórz obiekt Ksiazka (Book) i użyj System.out.println(),
aby wyświetlić jego reprezentację tekstową. Zademonstruj, że klasa Ksiazka dziedziczy metodę toString() z klasy Publikacja.
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Publication{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /*
    Zadanie 7
Dodaj metodę opis() (description()) w klasie Publikacja (Publication), która zwraca łańcuch znaków z informacjami o publikacji.
W klasach Ksiazka (Book) i Czasopismo (Magazine) przesłoń tę metodę, wykorzystując super.opis(),
aby dołączyć informacje specyficzne dla tych klas (np. liczba stron, numer wydania).\
W metodzie main wyświetl opisy wszystkich publikacji z tablicy, używając pętli.
     */
    public String description() {
        return "tytuł: " + title + "author: " + author;
    }
    /*
    Zadanie 8
W klasie Publikacja (Publication) oznacz pola tytul i autor jako final.
Spróbuj zmienić wartości tych pól w klasach pochodnych lub w metodach. Zademonstruj, że pola oznaczone jako final
nie mogą być zmieniane po inicjalizacji.
Dodaj metodę, która próbuje zmienić te pola i obsłuż wynikający z tego błąd kompilacji, dodając komentarz z wyjaśnieniem.
     */
//Stringi są niezmienialne więc zmienienie final stringa jest nie mozliwe.
//    public void setAuthor(String author) {
//        this.author = author;

    /*
    Zadanie 9
Oznacz klasę Publikacja (Publication) jako final. Spróbuj dziedziczyć po tej klasie, tworząc nową klasę Ebook.
Zademonstruj, że klasa oznaczona jako final nie może być dziedziczona. W komentarzu wyjaśnij, dlaczego występuje błąd.
     */
    /*
    Zadanie 19
Zademonstruj przesłanianie metod equals() i hashCode() w klasie Publikacja (Publication).
Dwie publikacje są równe, jeśli mają ten sam tytuł i autora. W metodzie equals() dodaj instrukcje warunkowe sprawdzające te warunki.
W metodzie main utwórz dwie publikacje z takimi samymi danymi i porównaj je.
Dodaj je do tablicy, aby zademonstrować działanie metody hashCode() (np. unikaj duplikatów w tablicy).
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;
        Publication that = (Publication) o;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public void save() {
        this.isSaved = true;
        System.out.println("saved");
    }

    @Override
    public void load() {
        if (this.isSaved) {
            System.out.println("saved publication: blablavla");
        } else {
            System.out.println("this publication wasnt saved");
        }
    }
}
