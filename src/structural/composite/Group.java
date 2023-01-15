package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{

    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void render() {
        for(Component comp : components){
            comp.render();
        }
    }
}
