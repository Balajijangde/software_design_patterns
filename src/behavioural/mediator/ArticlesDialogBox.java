package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ArticlesDialogBox extends DialogBox{

    private ListBox articlesList = new ListBox(this);
    private TextBox textBox = new TextBox(this);
    private Button button = new Button(this);

    public void simulateInteraction(){
        List<String> list = new ArrayList<>();
        list.add("Article 1");
        articlesList.setArticles(list);
        textBox.setContent("");
        System.out.println("button status " + button.isActive());
    }

    @Override
    protected void change(UIControl control) {
        if(control == articlesList){
            //an article has been selected
            this.textBox.setContent("Article 1");
            this.button.setActive(true);
        }else if(control == textBox){
            //empty textbox and disable button
            String content = this.textBox.getContent();
            boolean isEmpty = content != null && content.isEmpty();
            this.button.setActive(!isEmpty);
        }
    }
}
