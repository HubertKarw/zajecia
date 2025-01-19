package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Publication p1 = new Publication("", "abc");
//        Publication p2 = new Publication("title", "author");
//        Publication p3 = new Publication("123", "");
        Publication b1 = new Book("a", "2", 100);
        Publication b2 = new Book("a", "2", 99);
        Publication m1 = new Magazine("2", "2", 1);
        Publication m2 = new Magazine("1", "2", 2);
////        m1.displayInfo();
///*
//W metodzie main utwórz tablicę Publikacja[] (Publication[]), która przechowuje kilka obiektów typu Ksiazka (Book) i
//Czasopismo (Magazine). Wykorzystaj pętlę for do wywołania metody wyswietlInformacje() (displayInfo())
//dla każdego elementu tablicy. Zademonstruj polimorfizm oraz użyj instrukcji instanceof,
//aby dla każdego obiektu określić jego konkretny typ i wyświetlić dodatkowy komunikat.
// */
//        Publication[] publications = new Publication[]{b1, m1, m2, b2};
//        for (Publication p : publications
//        ) {
//            if (p instanceof Book) {
//                Book book = (Book) p;
//                book.displayInfo();
//            } else if (p instanceof Magazine) {
//                Magazine mag = (Magazine) p;
//                mag.displayInfo();
//            }
//        }
//        System.out.println(b1);
        /*
        Zadanie 12
W metodzie main utwórz tablicę Uzytkownik[] (User[]), dodaj do niej obiekty klas Bibliotekarz (Librarian) i Czytelnik (Reader).
Użyj pętli for do wywołania metody pokazUprawnienia() (showPrivileges()) dla każdego obiektu.
Dodaj instrukcję warunkową, która dodatkowo wyświetla specjalny komunikat dla bibliotekarza.
         */
//        User[] users = new User[]{new Librarian("1","2"),new Reader("2","3")};
//        for (User u: users) {
//            u.showPrivilages();
//            if(u instanceof Librarian){
//                System.out.println("librarian");
//            }
//        }
//        ((Book) b1).borrow();
//        ((Book) b1).borrow();
//
//        ((Book) b1).returnResource();
//        User user = new Reader("123","234");
//        ((Book) b1).reserve(user);
//        User[] reservedForB1 = ((Book) b1).getReservedList();
//        for (User u: reservedForB1) {
//            System.out.println(u);
//        }
//        Publication e1 = new Ebook("1","2");
//        user.setHasAccount(false);
//        ((Ebook) e1).download(user);
//        user.setHasAccount(true);
//        ((Ebook) e1).download(user);
//
//        ((Ebook) e1).borrow();
//        ((Ebook) e1).borrow();
//        ((Ebook) e1).borrow();
//
        /*
Zadanie 17
Porównaj klasy abstrakcyjne i interfejsy w swoim kodzie.
Napisz krótki program w metodzie main, który zademonstruje różnice między nimi.
Na przykład, utwórz tablicę mieszanych obiektów implementujących interfejs ZasobBiblioteczny oraz dziedziczących po
klasie abstrakcyjnej MediaElektroniczne (ElectronicMedia), a następnie użyj pętli i
instrukcji warunkowych do wywołania odpowiednich metod.
                //KLASA ABSTRAKCYJNA ELECTRONIMEDIA DOPIERO W ZADANIU 23
 */
        Publication a = new Auidobook("A", "A");
        Publication e = new Ebook("e", "e");
        Publication b = new Book("book", "book", 123);
        Publication m = new Magazine("m", "m", 222);

        Publication[] publications = new Publication[]{a, e, b, m};
        for (Publication p : publications) {
            if (p instanceof Auidobook) {
                ((Auidobook) p).play();
            } else if (p instanceof Ebook) {
                ((Ebook) p).play();
            } else if (p instanceof Book) {
                ((Book) p).borrow();
            } else if (p instanceof Magazine) {
                ((Magazine) p).borrow();
            }
            if (p instanceof LibraryResource) {
                p.archive();
            }
            if (p instanceof ElectronicMedia) {
                ((ElectronicMedia) p).play();
            }
        }
//        User u1 = new Librarian("123","222");
//        User u2 = new Reader("223","122");
//        u1.introduceYourself();
//        u2.introduceYourself();
//        Librarian l1 = new Librarian("1","2");
//        l1.introduceYourself();
//
//        Publication book = new Book("book","author",100);
//        Publication book2 = new Book("book","author",100);
//        Publication book3 = new Book("title","author",123);
//        Publication book4 = new Book("title2","mickiewicz",123);
//        Publication book5 = new Book("title3","mickiewicz",123);
//        Publication pub = new Publication("title3","mickiewicz");
//
//        if (book.equals(book2)){
//            System.out.println("they are the same book");
//        }
//        ArrayList<Publication> publications = new ArrayList<>();
//        publications.add(book);
//        publications.add(book3);
//        for (Publication p: publications) {
//            if(p.hashCode()==book2.hashCode()){
//                System.out.println(true);
//            }else{
//                System.out.println(false);
//            }
//        }
//        System.out.println(publications);
//        publications.add(book2);
//        publications.add(book4);
//        publications.add(book5);
//        Stream<Publication> stream = publications.stream();
//        PublicationFilter mickiewiczBooks = p -> p.author.equals("mickiewicz");
//        Object[] mickiewiczs = stream.filter(mickiewiczBooks::filter).toArray();
//        Arrays.stream(mickiewiczs).forEach(System.out::println);
//
//        book.load();
//        book.archive();
//        book.save();
//        book.load();
//        book.archive();
//        pub.archive();
//        ElectronicMedia e = new Ebook("1","2");
//        ElectronicMedia a = new Auidobook("2","3");
//        e.play();
//        a.play();
//        MultifunctionDevice md = new MultifunctionDevice();
//        md.print();
//        md.scan();
    }

}
