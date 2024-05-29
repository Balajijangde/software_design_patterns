package revision.creational.singleton;

//When we want a class to be initialized only once, like config, db connection etc
public class Main {

    public static void main(String[] args) {
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        SynchronizedMethodSingleton synchronizedMethodSingleton = SynchronizedMethodSingleton.getInstance();
        SynchronizedBlockSingleton synchronizedBlockSingleton = SynchronizedBlockSingleton.getInstance();
    }
}

/*Eager initialized version of singleton class
Eager initialization -> if there are lots of singleton then startup of application will be slow due to all singleton initializations
Its thread safe because we are initializing in the beginning of application
* */
class EagerInitializedSingleton {

    //Restricting to a have a public constructor, so it can't be instantiated from outside
    private EagerInitializedSingleton(){}

    //Member property to hold one and only instance of singleton class
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //There should also be a public getInstance method to provide instance
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

/*
Lazy initialized version of singleton class
Lazy loading -> singleton class will be initialized only when getInstance will be called
not thread safe -> different threads might end up having different instance of LazyInitializedSingleton class
 */
class LazyInitializedSingleton {
    private LazyInitializedSingleton(){}

    private static LazyInitializedSingleton instance;

    public static LazyInitializedSingleton getInstance() {
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

/*
Synchronized method lazy initialized version of singleton class -> this approach is very costly because if lots of threads try to invoke getInstance method then each one will be called one after another due to lock
Thread safe -> every thread end up getting same instance of singleton class
 */
class SynchronizedMethodSingleton {
    private SynchronizedMethodSingleton() {}

    private static SynchronizedMethodSingleton instance;

    //since this method is synchronized, only one thread is able to call this method at a time, and another thread will wait for previous thread to unlock it first
    synchronized public static SynchronizedMethodSingleton getInstance() {
        if(instance == null){
            instance = new SynchronizedMethodSingleton();
        }
        return instance;
    }
}

/*
Synchronized block with lazy initialized version of singleton class -> this is the version we use on industry, also called double check locking
Thread safe -> every thread end up getting same instance of singleton class
 */
class SynchronizedBlockSingleton {
    private SynchronizedBlockSingleton() {}

    private static SynchronizedBlockSingleton instance;

    public static SynchronizedBlockSingleton getInstance() {
        if(instance == null){
            //we are only locking SynchronizedBlockSingleton class only when instance is null, which will happen only one, so its performance is good
            synchronized (SynchronizedBlockSingleton.class){
                if(instance == null){
                    instance = new SynchronizedBlockSingleton();
                }
            }
        }
        return instance;
    }
}
