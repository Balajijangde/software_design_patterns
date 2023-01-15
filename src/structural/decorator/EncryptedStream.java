package structural.decorator;

public class EncryptedStream implements Stream{
    private final Stream stream;

    public EncryptedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String text) {
        String encrypted = "%#&**&786345%^(#*lndv^%*";
        stream.write(encrypted);
    }
}
