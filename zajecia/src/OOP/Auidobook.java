package OOP;

public class Auidobook extends ElectronicMedia {
    private int batteryPercentage;

    public Auidobook(String title, String author) {
        super(title, author);
        batteryPercentage = 100;
    }

    @Override
    public void play() {
        if (batteryPercentage > 10) {
            System.out.println("audiobook is played");
        } else {
            System.out.println("low battery\ncharge your device first");
        }
    }
}
