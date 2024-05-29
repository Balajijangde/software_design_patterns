package revision.creational.factory;
/*
It provides interface for creating objects in a superclass, allowing subclasses to alter the type of objects that will be crated, it is useful when the
exact types of objects to be created may vary or need to be determined at runtime.
When to use it:
1. If you have complex object creation process or if the process may vary based on conditions.
2. When we want to abstract away the specific implementation details of the concrete classes from the client code.
3. If app needs to create different variations of a product or if new types of products may be introduced
 */

//Problem statement
abstract class PVehicle {
    public abstract void printVehicle();
}

class PTwoWheeler extends PVehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class PFourWheeler extends PVehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

class PClient {
    private PVehicle pVehicle;

    public PClient(int type) {
        if (type == 1) {
            pVehicle = new PTwoWheeler();
        } else if (type == 2) {
            pVehicle = new PFourWheeler();
        } else {
            pVehicle = null;
        }
    }

    public void cleanup() {
        if (pVehicle != null) {
            pVehicle = null;
        }
    }

    public PVehicle getVehicle() {
        return pVehicle;
    }
}
/*
Tight coupling -> Client directly created concrete classes, which is tight coupling and makes code hard to maintain and extend
SRP -> Client class should not be responsible for creating concrete product classes
Scalability -> Adding new product will need to modify Client class
 */
public class Problem {
}
