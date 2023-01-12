package behavioural.mediator;

public class Button implements UIControl{
    private DialogBox dialogBox;

    public Button(DialogBox dialogBox) {
        this.dialogBox = dialogBox;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    private boolean isActive = false;
}
