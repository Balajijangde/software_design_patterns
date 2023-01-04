package memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History editorHistory = new History();

        editor.setContent("first content");
        editorHistory.pushState(new EditorState(editor.getContent()));

        editor.setContent("second content");
        editorHistory.pushState(new EditorState(editor.getContent()));

        editor.setContent("third content");

        System.out.println(editor.getContent());

        editor.restoreState(editorHistory.popState());

        System.out.println(editor.getContent());

        editor.restoreState(editorHistory.popState());

        System.out.println(editor.getContent());
    }
}
