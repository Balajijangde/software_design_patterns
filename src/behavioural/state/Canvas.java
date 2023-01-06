package behavioural.state;

public class Canvas {
    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    private Tool currentTool;

    public void mouseDown(){
        this.currentTool.mouseDown();
    }

    public void mouseUp(){
        this.currentTool.mouseUp();
    }

}
