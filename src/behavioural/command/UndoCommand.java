package behavioural.command;

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }


    @Override
    public void execute() {
        if(history.getHistorySize() > 0)
            history.popHistory().unexecute();
        else
            System.out.println("No actions available");
    }
}
