package OOP;

public abstract class ElectronicMedia extends Publication {
    public ElectronicMedia(String title, String author) {
        super(title, author);
    }

    public abstract void play();
}
