package OOP;
/*
Zadanie 25
Utwórz interfejsy Drukowalny (Printable) z metodą drukuj() (print()) oraz Skanowalny (Scannable) z metodą skanuj() (scan()).
Utwórz klasę UrzadzenieWielofunkcyjne (MultifunctionDevice), która implementuje oba interfejsy. W metodach drukuj()
i skanuj() dodaj logikę symulującą drukowanie i skanowanie (np. użyj pętli for do wyświetlania postępu operacji).
W metodzie main zademonstruj możliwość wykorzystania wielodziedziczenia interfejsów, wywołując metody na
obiekcie UrzadzenieWielofunkcyjne.

 */

public interface Scannable {
    void scan();
}
