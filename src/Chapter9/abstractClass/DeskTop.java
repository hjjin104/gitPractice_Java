package Chapter9.abstractClass;

public class DeskTop extends Computer {
    @Override
    public void display() {
        System.out.println("DeskTop Display");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop Typing");
    }

    public void turnOn() {
        System.out.println("DeskTop Turn On.");
    }
}
