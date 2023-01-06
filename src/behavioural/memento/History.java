package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorState> states = new ArrayList<>();

    public void pushState(EditorState state){
        states.add(state);
    }

    public EditorState popState(){
        int lastIndex = this.states.size() - 1;
        EditorState state = this.states.get(lastIndex);
        states.remove(lastIndex);
        return state;
    }
}
