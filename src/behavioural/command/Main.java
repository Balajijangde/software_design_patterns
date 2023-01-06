package behavioural.command;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        History history = new History();
        document.setContent("some content");
        ItalicCommand italicCommand = new ItalicCommand(document, history);
        italicCommand.execute();
        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}
