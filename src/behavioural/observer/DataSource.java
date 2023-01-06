package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateAll() {
        for(Observer obs : observers){
            obs.update();
        }
    }
}
