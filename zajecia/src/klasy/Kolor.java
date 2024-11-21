package klasy;

public enum Kolor {
    /*
    Zadanie 11
Zdefiniuj enum Kolor, który ma wartości RED, GREEN, BLUE, każda z nich powinna mieć pole kodKoloru (np. #FF0000 dla RED).
Dodaj konstruktor do enumu, który inicjalizuje pole kodKoloru. Napisz metodę getKodKoloru(), która zwraca kod koloru.
W metodzie main użyj enumu i wyświetl nazwę koloru oraz jego kod.
     */
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
    String kodKoloru;

    Kolor(String kodKoloru) {
        this.kodKoloru = kodKoloru;
    }

    public String getKodKoloru() {
        return kodKoloru;
    }
}
