package klasy;


public class main {
    public static void main(String[] args) {
        /*
        zad1

        Samochod car = new Samochod();
        car.marka = "Volkswagen";
        car.model = "Golf";
        System.out.println("Marka: "+car.marka+"\nModel: "+car.model);
        */
        /*
        zad 2

        Samochod car = new Samochod("Audi", "A4");
        System.out.println("Marka: "+car.marka+"\nModel: "+car.model);
         */
        /*
        zad 3
         */
        Samochod car = new Samochod("Audi", "A4");
        System.out.println("Marka: " + car.getMarka() + "\nModel: " + car.getModel());
        car.setMarka("BMW");
        car.setModel("E36");
        System.out.println("Marka: " + car.getMarka() + "\nModel: " + car.getModel());
        /*
        zad4
         */
        Samochod car2 = new Samochod("Toyota", "Corola");
        int liczbaSamochodow = Samochod.pobierzLiczbeSamochodow();
        System.out.println("liczba samochodów: " + liczbaSamochodow);
        /*
        zajecia5.zad5
         */
        Samochod car3 = new Samochod();
        System.out.println("Marka: " + car3.getMarka() + "\nModel: " + car3.getModel());
        /*
        zajecia5.zad6
         */
        car3.wyswietlInformacje();
        System.out.println(Samochod.pobierzLiczbeSamochodow());
        /*
        zajecia5.zad7
         */
        car3.przyspiesz(100);
        car3.przyspiesz(100.000);
        /*
        zad 14
         */
        car3.start();
        car3.jedz();
    }

}
