package behavioural.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler compressor = new Compressor(null);
        Handler logger = new Logger(compressor);
        Handler authenticator = new Authenticator(logger);
        WebServer webServer = new WebServer(authenticator);
        HttpRequest request = new HttpRequest("admin", "1234");
        webServer.handle(request);
    }
}
