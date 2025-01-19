package OOP;

/*
Zadanie 16
W klasie Ebook przesłoń metodę wypozycz() (borrow()), tak aby wyświetlała komunikat "Ebook został wypożyczony elektronicznie".
 Dodaj pole liczbaKopii (copyCount) i logikę sprawdzającą, czy liczba dostępnych kopii cyfrowych jest większa od zera;
 jeśli tak, zmniejsz liczbę dostępnych kopii, w przeciwnym razie wyświetl komunikat "Brak dostępnych kopii".
 W metodzie main utwórz obiekt Ebook i wywołaj na nim metodę wypozycz().

 */
public class Ebook extends ElectronicMedia implements LibraryResource, Electronic {
    private int copyCount;

    public Ebook(String title, String author) {
        super(title, author);
        this.copyCount = 2;
    }

    @Override
    public void play() {
        System.out.println("Ebook is now playing on your device");
    }


    public void download(User user) {
        if (user.isHasAccount()) {
            System.out.println("Downloading");
        } else {
            System.out.println("no access");
        }
    }

    @Override
    public void borrow() {
        if (isAvailable()) {
            System.out.println("Ebook został wypożyczony elektronicznie");
            this.copyCount--;
        } else {
            System.out.println("brak dostepnych kopii");
        }

    }

    public boolean isAvailable() {
        if (copyCount > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void returnResource() {
        System.out.println("returned");

    }

    @Override
    public void reserve() {
        LibraryResource.super.reserve();
    }
    //Oznaczenie klasy jako final saprawia ze nie moze być ona dziedziczona
}
