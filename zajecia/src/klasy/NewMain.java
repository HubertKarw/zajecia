package klasy;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        /*
        zad8
         */
        Punkt punkt = new Punkt(10,10);
        System.out.println(punkt.toString());
        /*
        zad 9
         */
        Kalkulator calc = new Kalkulator();
        calc.obliczSume(10,10);
        /*
        zad10
         */
        DzienTygodnia dzis = DzienTygodnia.CZWARTEK;
        dzis.printDay();
        System.out.println(dzis);
        /*
        zad11
         */
        Kolor czerwony = Kolor.RED;
        Kolor niebieski = Kolor.BLUE;
        System.out.println(czerwony.name());
        System.out.println(czerwony.getKodKoloru());
        /*
        Zadanie 12
Pokaż, że wartości enum można porównywać za pomocą operatora ==.
Napisz program, który porównuje dwie zmienne typu Kolor i wyświetla odpowiedni komunikat w zależności od wyniku porównania.
         */
        if(czerwony == niebieski){
            System.out.println("ten sam kolor");
        }else{
            System.out.println("inny kolor");
        }
        /*
        zad13
         */
        Matematyka matematyka = new Matematyka();
        System.out.println(Matematyka.dodaj(1,2));
        System.out.println(matematyka.pomnoz(1,2));
        /*
        zad17
         */
        System.out.println(Matematyka.dodaj(1.1,1.2));
        System.out.println(Matematyka.dodaj(1,1,1));
        /*
        zad 18
         */
//        Singleton singleton= new Singleton();
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.s);
        /*
        zad19
         */
//        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        scanner.nextLine();
//        String znak = scanner.nextLine();
//        if (znak.equals("+")){
//            System.out.println(Operacja.DODAJ.wykonaj(a,b));
//        }else if (znak.equals("-")){
//            System.out.println(Operacja.ODEJMIJ.wykonaj(a,b));
//        }else if (znak.equals("*")){
//            System.out.println(Operacja.POMNÓŻ.wykonaj(a,b));
//        }else if (znak.equals("/")){
//            System.out.println(Operacja.PODZIEL.wykonaj(a,b));
//        }else{
//            System.out.println("zly znaK");
//        }
    /*
    ZAD 20
     */
        Licznik l =new Licznik();
        Licznik l1 =new Licznik();
        Licznik l2 =new Licznik();
        Licznik l3 =new Licznik();
        System.out.println(Licznik.getLiczbaObiektow());
        System.out.println(l.getLiczbaInstancji());
    }


}
