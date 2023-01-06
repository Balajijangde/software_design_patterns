package behavioural.command;

public class HtmlDocument {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void makeBold(){
        this.content = "<i> "+this.content+" </i>";
    }
}
