package behavioural.memento;

public class EditorState {
    EditorState(String text){
        this.content = text;
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
