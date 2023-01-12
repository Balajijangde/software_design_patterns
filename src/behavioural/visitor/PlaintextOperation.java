package behavioural.visitor;

public class PlaintextOperation implements Operation{
    @Override
    public void apply(HeadingNode node) {
        System.out.println("plaintext-heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("plaintext-anchor");
    }
}
