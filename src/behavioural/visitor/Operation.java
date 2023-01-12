package behavioural.visitor;

public interface Operation {
    void apply(HeadingNode node);
    void apply(AnchorNode node);
}
