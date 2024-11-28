package OOP;

/*
Zadanie 25
Utwórz interfejsy Drukowalny (Printable) z metodą drukuj() (print()) oraz Skanowalny (Scannable) z metodą skanuj() (scan()).
Utwórz klasę UrzadzenieWielofunkcyjne (MultifunctionDevice), która implementuje oba interfejsy. W metodach drukuj()
i skanuj() dodaj logikę symulującą drukowanie i skanowanie (np. użyj pętli for do wyświetlania postępu operacji).
W metodzie main zademonstruj możliwość wykorzystania wielodziedziczenia interfejsów, wywołując metody na
obiekcie UrzadzenieWielofunkcyjne.

 */
public class MultifunctionDevice implements Printable, Scannable {
    @Override
    public void print() {
        for (int i = 0; i < 100; i += ((int) (Math.random() * 100))) {
            System.out.println(String.format("Print progress: %d", i));
        }
        System.out.println(String.format("Print progress: %d", 100));
    }

    @Override
    public void scan() {
        for (int i = 0; i < 100; i += ((int) (Math.random() * 100))) {
            System.out.println(String.format("Scan progress: %d", i));
        }
        System.out.println(String.format("Print progress: %d", 100));
    }
}
