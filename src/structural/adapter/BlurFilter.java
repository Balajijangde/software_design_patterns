package structural.adapter;

public class BlurFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("applying blur filter");
    }
}
