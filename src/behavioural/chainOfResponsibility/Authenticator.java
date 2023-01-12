package behavioural.chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        return !(request.getUsername() == "admin" && request.getPassword() == "1234");
    }
}
