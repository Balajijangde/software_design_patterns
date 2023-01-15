package structural.decorator;

public class CompressedStream implements Stream{
    private final Stream stream;

    public CompressedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String text) {
        String compressed = text.substring(0, 5);
        stream.write(compressed);
    }
}
