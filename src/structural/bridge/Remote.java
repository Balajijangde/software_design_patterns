package structural.bridge;

public class Remote {
    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    void turnOn(){
        device.turnOn();
    }

    void turnOff(){
        device .turnOff();
    }


}
