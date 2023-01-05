package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> history = new ArrayList<>();
    public List<String> getHistory(){
        return this.history;
    }
    public void pushHistory(String text){
        history.add(text);
    }

    public Iterator getIterator(){
        return new ListIterator(this);
    }
}
