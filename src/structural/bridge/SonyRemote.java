package structural.bridge;

public class SonyRemote implements Device{
    @Override
    public void turnOn() {
        System.out.println("Turn on sony tv");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off sony tv");
    }

    @Override
    public void setChannel(int n) {
        System.out.println("changing channel to "+n);
    }
}
