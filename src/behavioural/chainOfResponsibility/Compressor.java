package behavioural.chainOfResponsibility;

public class Compressor extends Handler{
    public Compressor(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Compressing");
        return true;
    }
}
