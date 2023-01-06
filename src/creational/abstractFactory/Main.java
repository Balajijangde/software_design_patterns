package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        FormCreator creator = new FormCreator();
        creator.renderForm(new MaterialWidgetFactory());
        creator.renderForm(new CupertinoWidgetFactory());
    }
}
