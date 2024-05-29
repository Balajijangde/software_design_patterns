package revision.creational.factory;

//we will need product interface
abstract class Vehicle {
    public abstract void printVehicle();
}

//Concrete products
class TwoWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}
class FourWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

//Factory interface
interface VehicleFactory {
    Vehicle createVehicle();
}

//Concrete creators
class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

//Client
class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory factory){
        vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
public class Main {

    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}
