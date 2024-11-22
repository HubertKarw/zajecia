public class zad12 {
    public static void main(String[] args) {
        int weight = 18;
        /*
        Zadanie 12
Napisz program, który na podstawie wagi boksera określa jego kategorię: poniżej 52 kg - "Kategoria lekka",
52-81 kg - "Kategoria średnia", powyżej 81 kg - "Kategoria ciężka". Użyj

         */

        if (weight > 52) {
            System.out.println("lekka");
        } else if (weight >= 52 && weight <= 81) {
            System.out.println("srednia");
        } else if (weight > 81) {
            System.out.println("ciezka");
        }
    }
}
