package behavioural.chainOfResponsibility;

public class HttpRequest {
    private String username;
    private String password;

    HttpRequest(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
