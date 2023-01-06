package creational.prototype;

public class Main {
    public static void main(String[] args){
        Circle manuallyCreatedCircle = new Circle();
        manuallyCreatedCircle.setRadius(8);

        ContextMenu context = new ContextMenu();
        Component clonedCircle = context.cloneComponent(manuallyCreatedCircle);
        clonedCircle.render();
    }

}
