package structural.adapter;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new BlurFilter());

        imageView.apply(new CaramelFilter(new Caramel())); // normal way of using adapter
        imageView.apply(new CaramelAdapter()); // using inheritance model for adapter
    }
}
