package abstractFactory;

public class FormCreator {
    public void renderForm(WidgetFactory factory){
        factory.createTextbox().render();
        factory.createButton().render();
    }
}
