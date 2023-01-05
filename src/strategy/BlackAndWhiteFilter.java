package strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Applying black and white filter on " + filename);
    }
}
