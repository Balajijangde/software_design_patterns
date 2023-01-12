package behavioural.visitor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.addNode(new HeadingNode());
        document.addNode(new AnchorNode());

        document.execute(new HighlightOperation());
        document.execute(new PlaintextOperation());
    }
}
