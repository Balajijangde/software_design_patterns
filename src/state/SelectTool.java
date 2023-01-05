package state;

public class SelectTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("mouse down in select tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("mouse up in select tool");
    }
}
