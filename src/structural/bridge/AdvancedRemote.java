package structural.bridge;

public class AdvancedRemote extends Remote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    void changeChannel(int n){
        device.setChannel(n);
    }
}
