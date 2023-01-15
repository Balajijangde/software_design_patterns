package structural.composite;

public class Main {
    public static void main(String[] args) {
        Component textbox1 = new Textbox();
        Component button1 = new Button();
        Group group1 = new Group();
        group1.addComponent(textbox1);
        group1.addComponent(button1);
        Group group2 = new Group();
        group2.addComponent(group1);
        group2.addComponent(new Textbox());
        group2.render();
    }
}
