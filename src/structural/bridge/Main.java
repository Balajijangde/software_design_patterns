package structural.bridge;

public class Main {
    public static void main(String[] args) {
        new Remote(new SonyRemote()).turnOff();
        new AdvancedRemote(new SonyRemote()).changeChannel(5);
    }
}
