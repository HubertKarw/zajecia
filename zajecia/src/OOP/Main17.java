package OOP;

public class Main17 {
    /*
Zadanie 17
Porównaj klasy abstrakcyjne i interfejsy w swoim kodzie.
Napisz krótki program w metodzie main, który zademonstruje różnice między nimi.
Na przykład, utwórz tablicę mieszanych obiektów implementujących interfejs ZasobBiblioteczny oraz dziedziczących po
klasie abstrakcyjnej MediaElektroniczne (ElectronicMedia), a następnie użyj pętli i
instrukcji warunkowych do wywołania odpowiednich metod.
        //KLASA ABSTRAKCYJNA ELECTRONIMEDIA DOPIERO W ZADANIU 23
*/
    public static void main(String[] args) {
        Publication a = new Auidobook("A", "A");
        Publication e = new Ebook("e", "e");
        Publication b = new Book("book", "book", 123);
        Publication m = new Magazine("m", "m", 222);
//              //EM MA KONSTRUKTOR a LR nie ma
        LibraryResource lr = new Book("1", "2", 1);
        ElectronicMedia em = new Ebook("1", "2");
        User user = new Librarian("123", "222");
//                System.out.println(user);

        //aby uzywac metod z publikacji w er er musi extendowac publikacje z czego robi sie lancuch dziedziczenia publikacja -> electronicMedia -> ebook
        //aby uzywac metod z publikacji w lr klasa moze extendowac publikacje  i implementowac lr
        Publication[] publications = {a, e, b, m};
        for (Publication p : publications) {
            if (p instanceof LibraryResource) {
                //p.borrow()
                //((LibraryResource)p).borrow();
                //((LibraryResource)p).reserve();
                if (p instanceof Book) {
                    ((Book) p).reserve(user);
                    ((Book) p).printReservedList();
                }
                if (p instanceof Ebook) {
                    ((Ebook) p).download(user);
                    ((Ebook) p).borrow();

                    //ebook implementuje 2 interfejsy wiec mozemy uzyc obie metody
                }
                //audiobook nie dziedziczy library resource wieć są 3 wywołanne metody z czego 2 są defaultowe
                // jeżeli wywołamy reserve ovveride na ksiązce dostaniemy liste rezerwacji
            }
//                    if (p instanceof ElectronicMedia){
//                        ((ElectronicMedia) p).play();
//                    }


        }
        String text = "texttt1 ";
        String text2 = "texttt1";
    }
}
