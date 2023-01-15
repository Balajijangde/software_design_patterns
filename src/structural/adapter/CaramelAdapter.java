package structural.adapter;

// Use inheritance for implementing adapter

public class CaramelAdapter extends Caramel implements Filter{
    @Override
    public void apply(Image image) {
        init();
        applyFilter(image);
    }
}
