package behavioural.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new PencilTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new SelectTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
