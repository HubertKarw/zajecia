package OOP;

/*
Zadanie 20
Utwórz interfejs funkcyjny FiltrPublikacji (PublicationFilter) z metodą boolean filtruj(Publikacja p) (boolean filter(Publication p)).
W metodzie main stwórz tablicę publikacji i za pomocą wyrażeń lambda oraz interfejsu FiltrPublikacji przefiltruj publikacje
według określonych kryteriów (np. tylko książki autora "Adam Mickiewicz"). Użyj pętli for do wyświetlenia wyników.


 */
public interface PublicationFilter {
    public boolean filter(Publication p);
}
