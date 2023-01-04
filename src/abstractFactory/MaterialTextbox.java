package abstractFactory;

public class MaterialTextbox implements Textbox{
    @Override
    public void render() {
        System.out.println("rendering material textbox");
    }
}
