package behavioural.command;


import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private final Deque<UndoableCommand> history = new ArrayDeque<>();
    public int getHistorySize(){
        return history.size();
    }

    public void addHistory(UndoableCommand command){
        history.add(command);
    }
    public UndoableCommand popHistory(){ return history.pop();}
}
