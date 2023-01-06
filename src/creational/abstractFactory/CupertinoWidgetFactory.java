package creational.abstractFactory;

public class CupertinoWidgetFactory implements WidgetFactory{
    @Override
    public Widget createButton() {
        return new CupertinoButton();
    }

    @Override
    public Widget createTextbox() {
        return new CupertinoTextbox();
    }
}
