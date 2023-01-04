package factory;

public class SharpViewController extends Controller{
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
