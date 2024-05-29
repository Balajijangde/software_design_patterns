package creational.singleton;

public class SingletonWithSynchronizedMethod {

    //Making constructor private so no-one can call it
    private SingletonWithSynchronizedMethod(){}

    private static SingletonWithSynchronizedMethod instance;

    //synchronized method will only let 1 thread access this function at a time
    synchronized public static SingletonWithSynchronizedMethod getInstance() {
        if (instance == null) {
            instance = new SingletonWithSynchronizedMethod();
        }
        return instance;
    }
}
//since this synchronized method technique is very costly, we don't use it industry
