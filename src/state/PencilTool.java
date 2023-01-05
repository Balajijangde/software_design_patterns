package state;

public class PencilTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("mouse down on pencil tool");
    }

    @Override
    public void mouseUp() {
        System.out.println("mouse up on pencil tool");
    }
}
