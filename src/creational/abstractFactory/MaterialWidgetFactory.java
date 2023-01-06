package creational.abstractFactory;

public class MaterialWidgetFactory implements WidgetFactory{
    @Override
    public Widget createButton() {
        return new MaterialButton();
    }

    @Override
    public Widget createTextbox() {
        return new MaterialTextbox();
    }
}
