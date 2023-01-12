package behavioural.chainOfResponsibility;

public abstract class Handler {
    private final Handler next;

    public Handler(Handler handler) {
        this.next = handler;
    }

    public void handle(HttpRequest request){
        if(doHandle(request))
            return;
        if(next != null)
            next.handle(request);
    }

    protected abstract boolean doHandle(HttpRequest request);
}
