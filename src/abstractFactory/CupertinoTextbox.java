package abstractFactory;

public class CupertinoTextbox implements Textbox{
    @Override
    public void render() {
        System.out.println("rendering cupertino textbox");
    }
}
