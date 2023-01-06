package behavioural.observer;

public class ListnerDashboard implements Observer{
    @Override
    public void update() {
        System.out.println("updated on listner dashboard");
    }
}
