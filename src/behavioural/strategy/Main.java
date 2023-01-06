package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        storage.store("random");
    }
}
