package strategy;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println("compressing using png compressor " + filename);
    }
}
