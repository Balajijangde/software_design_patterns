package creational.factory;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        ViewEngine viewEngine = createViewEngine();
        String content = viewEngine.render("template.html", context);
        System.out.println(content);
    }

    //main creational.factory method which creates view engine
    protected ViewEngine createViewEngine(){
        return new MatchaViewEngine();
    }
}
