package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ListBox implements UIControl{
    private DialogBox dialogBox;
    private List<String> articles = new ArrayList<>();

    public ListBox(DialogBox dialogBox) {
        this.dialogBox = dialogBox;
    }

    public List<String> getArticles() {
        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
        dialogBox.change(this);
    }
}
