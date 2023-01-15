package structural.adapter;

public class CaramelFilter implements Filter{
    private final Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init(); //Imagine its mandatory to call inti method before using this Caramel filter
        caramel.applyFilter(image);
    }
}
