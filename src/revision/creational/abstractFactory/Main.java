package revision.creational.abstractFactory;

//Abstract products
abstract class Chair {
    abstract void printProduct();
}
abstract class Sofa {
    abstract void printProduct();
}

//Concrete products
class VintageChair extends Chair{
    @Override
    void printProduct() {
        System.out.println("I am a vintage chair");
    }
}
class ModernChair extends Chair {
    @Override
    void printProduct() {
        System.out.println("I am a modern chair");
    }
}
class VintageSofa extends Sofa {
    @Override
    public void printProduct() {
        System.out.println("I am a vintage sofa");
    }
}
class ModernSofa extends Sofa{
    @Override
    void printProduct() {
        System.out.println("I am a modern sofa");
    }
}

//Abstract factory
interface FurnitureFactory {
    Sofa createSofa();
    Chair createChair();
}

//Concrete factories
class VintageFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }

    @Override
    public Chair createChair() {
        return new VintageChair();
    }
}
class ModernFactory implements FurnitureFactory {

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}

//Client
class Client {
    FurnitureFactory furnitureFactory;
    Client(FurnitureFactory factory) {
        furnitureFactory = factory;
    }

    public Sofa getSofa(){
        return furnitureFactory.createSofa();
    }

    public Chair getChair(){
        return furnitureFactory.createChair();
    }
}
public class Main {
    public static void main(String[] args) {
        Client modernClient = new Client(new ModernFactory());
        modernClient.getChair();
        modernClient.getSofa();

        Client vintageClient = new Client(new VintageFactory());
        vintageClient.getSofa();
        vintageClient.getChair();
    }
}
