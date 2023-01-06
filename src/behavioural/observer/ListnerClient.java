package behavioural.observer;

public class ListnerClient implements Observer{
    @Override
    public void update() {
        System.out.println("value updated on listener client");
    }
}
