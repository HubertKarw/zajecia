public class zad7 {
    public static void main(String[] args) {
        /*
        Zadanie 7
Napisz program, który na podstawie wieku kwalifikuje osobę do kategorii: poniżej 12 - "Dzieci", 12-17 - "Młodzież",
18-65 - "Dorośli", powyżej 65 - "Seniorzy". Użyj else if do klasyfikacji wieku.
         */
        int age = 18;
        if (age < 12) {
            System.out.println("dzieci");
        } else if (age > 12 && age < 18) {
            System.out.println("mlodziez");
        } else if (age > 17 && age < 66) {
            System.out.println("dorosli");
        } else if (age > 65) {
            System.out.println("senior");
        }
    }
}
