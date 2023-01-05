package iterator;

import java.util.List;

public class ListIterator implements Iterator{

    private List<String> history;
    private int index = 0;

    ListIterator(BrowserHistory browserHistory){
        this.history = browserHistory.getHistory();
    }

    @Override
    public boolean hasNext() {
        return index < history.size();
    }

    @Override
    public String current() {
        return this.history.get(index);
    }

    @Override
    public void next() {
        this.index++;
    }
}
