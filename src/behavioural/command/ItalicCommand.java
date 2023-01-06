package behavioural.command;

public class ItalicCommand implements UndoableCommand{
    private String previousContent;
    private HtmlDocument htmlDocument;
    private History history;

    public ItalicCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
        previousContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.addHistory(this);
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(previousContent);
    }
}
