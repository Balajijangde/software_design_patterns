package creational.factory;

import java.util.Map;

public class SharpViewEngine implements ViewEngine{
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "rendering using sharp view engine";
    }
}
