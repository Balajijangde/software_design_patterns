package creational.singleton;

public class SingletonWithSynchronizedBlock {

    private SingletonWithSynchronizedBlock(){}

    private static SingletonWithSynchronizedBlock instance;

    public static SingletonWithSynchronizedBlock getInstance(){
        if(instance == null){
            synchronized (SingletonWithSynchronizedBlock.class){
                if(instance == null){
                    instance = new SingletonWithSynchronizedBlock();
                }
            }
        }
        return instance;
    }
}

//Its how we create singleton classes in industry, its much better than synchronized method approach