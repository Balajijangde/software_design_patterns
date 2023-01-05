package strategy;

public class BlurFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("applying blur filter " + filename);
    }
}
