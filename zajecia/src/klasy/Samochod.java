package klasy;

public class Samochod {
    /*
    Zadanie 1
    Napisz klasę Samochod, która ma publiczne pola marka i model.
    W metodzie main utwórz obiekt tej klasy, przypisz wartości do pól, a następnie wyświetl informacje o samochodzie.
     */
//    public String marka;
//    public String model;
    /*
    Zadanie 3
    Zmień pola marka i model w klasie Samochod na prywatne.
    Dodaj publiczne metody getMarka(), setMarka(), getModel(), setModel() do dostępu i modyfikacji tych pól.
    W metodzie main utwórz obiekt klasy Samochod, ustaw wartości pól za pomocą setterów i
    wyświetl informacje za pomocą getterów.
     */
    private String marka;
    private String model;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /*
    Zadanie 2
    Dodaj konstruktor do klasy Samochod, który przyjmuje parametry marka i model i inicjalizuje pola obiektu.
    W metodzie main utwórz obiekt, używając tego konstruktora, i wyświetl informacje o samochodzie.
    */
//    Samochod(String marka, String model){
//        this.model = model;
//        this.marka = marka;
//    }
    /*
    Zadanie 4
    Dodaj do klasy Samochod statyczne pole liczbaSamochodow, które zlicza liczbę utworzonych obiektów tej klasy.
    Zwiększaj jego wartość w konstruktorze. Dodaj statyczną metodę pobierzLiczbeSamochodow(),
    która zwraca wartość tego pola. W metodzie main utwórz kilka obiektów klasy Samochod i
    wyświetl liczbę utworzonych samochodów.
     */
    private static int liczbaSamochodow = 0;

    Samochod(String marka, String model) {
        this.model = model;
        this.marka = marka;
        liczbaSamochodow++;
    }

    public static int pobierzLiczbeSamochodow() {
        return liczbaSamochodow;
    }
    /*
    Zadanie 5
    Dodaj do klasy Samochod konstruktor bez parametrów, który ustawia domyślne wartości pól marka i model.
    Wykorzystaj słowo kluczowe this do wywołania innego konstruktora tej samej klasy.
    W konstruktorach użyj this do odwołania się do pól obiektu. W metodzie main utwórz obiekt, używając konstruktora bez parametrów,
    i wyświetl informacje o samochodzie.
     */

    Samochod() {
        this("Unknown Model", "Unknown Marka");
    }

    /*
    Zadanie 6
    Dodaj do klasy Samochod metodę instancyjną wyswietlInformacje(),
    która wyświetla markę i model samochodu. Porównaj jej użycie z metodą statyczną pobierzLiczbeSamochodow().
    W metodzie main wywołaj obie metody.
     */
    public void wyswietlInformacje() {
        System.out.println("Marka: " + this.getMarka() + "\nModel: " + this.getModel());
    }

    /*
    Zadanie 7
    Dodaj do klasy Samochod metodę przyspiesz(), która przyjmuje parametr predkosc typu int. Następnie przeciąż tę metodę,
    aby przyjmowała parametr predkosc typu double. Obie wersje metody powinny wyświetlać informację o przyspieszeniu do podanej prędkości.
    W metodzie main przetestuj obie wersje metody.
     */
    public void przyspiesz(int predkość) {
        System.out.println("twój samochód marki" + this.getMarka() + "jedzie z prędkoscia: " + predkość);
    }

    public void przyspiesz(double predkość) {
        System.out.println("twój samochód marki" + this.getMarka() + "jedzie z prędkoscia: " + predkość);
    }

    /*
    Zadanie 14
W klasie Samochod dodaj metodę start(), która wyświetla komunikat "Samochód uruchomiony". Następnie dodaj metodę jedz(),
która najpierw wywołuje start() (używając this.start()), a następnie wyświetla komunikat "Samochód jedzie".
W metodzie main utwórz obiekt i wywołaj metodę jedz().
     */
    public void start() {
        System.out.println("samochod uruchomiony");
    }

    public void jedz() {
        this.start();
        System.out.println("samochod jedzie");
    }

    /*
    Zadanie 15
Dodaj do klasy Samochod statyczny blok inicjalizacyjny, który wyświetla komunikat "Klasa Samochod została załadowana".
Obserwuj, kiedy ten komunikat jest wyświetlany podczas działania programu.
     */
    public static String komunikat = "Klasa Samochod została załadowana";

    static {
        System.out.println(komunikat);
    }

    /*
    Zadanie 16
Dodaj do klasy Samochod blok inicjalizacyjny instancji, który wyświetla komunikat "Nowy samochód został utworzony".
Sprawdź, kiedy ten komunikat jest wyświetlany w porównaniu do konstruktora.
     */ {
        System.out.println("Nowy samochód został utworzony");
    }
}
