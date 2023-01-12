package behavioural.mediator;

public class TextBox implements UIControl{
    private DialogBox dialogBox;

    public TextBox(DialogBox dialogBox) {
        this.dialogBox = dialogBox;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        dialogBox.change(this);
    }

    private String content;

}
