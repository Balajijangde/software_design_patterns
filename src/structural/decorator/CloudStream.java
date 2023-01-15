package structural.decorator;

public class CloudStream implements Stream{
    @Override
    public void write(String text) {
        System.out.println("Saving '"+text+"'");
    }
}
