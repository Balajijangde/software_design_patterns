package behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.pushHistory("a");
        browserHistory.pushHistory("b");
        browserHistory.pushHistory("c");

        Iterator iterator = browserHistory.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
