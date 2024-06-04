package revision.creational.builder;

/*
Its used to construct a complex object step by step
 */

interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public CarManual getResult(){
        return new CarManual(this.type, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator);
    }
}

class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult(){
        return new Car(this.type, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator);
    }


}

enum Engine {
    m100cc, m200cc
}

enum GPSNavigator {
    r100km, r200km
}

enum TripComputer {
    c10, c20
}

enum CarType {
    suv, hatchback, sedan
}

enum Transmission {
    manual, auto
}

class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
}

class CarManual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public CarManual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }
}

class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.sedan);
        builder.setEngine(Engine.m200cc);
        builder.setSeats(2);
        builder.setGPSNavigator(GPSNavigator.r200km);
        builder.setTripComputer(TripComputer.c20);
        builder.setTransmission(Transmission.auto);
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.hatchback);
        builder.setSeats(2);
        builder.setEngine(Engine.m100cc);
        builder.setTransmission(Transmission.manual);
        builder.setTripComputer(TripComputer.c10);
        builder.setGPSNavigator(GPSNavigator.r100km);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.suv);
        builder.setSeats(4);
        builder.setEngine(Engine.m200cc);
        builder.setTransmission(Transmission.manual);
        builder.setGPSNavigator(GPSNavigator.r200km);
    }
}

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();

        director.constructCityCar(carBuilder);
        Car cityCar = carBuilder.getResult();
    }
}
