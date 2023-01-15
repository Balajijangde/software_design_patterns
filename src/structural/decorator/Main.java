package structural.decorator;

public class Main {
    public static void main(String[] args) {
        saveData(
                new CompressedStream(
                        new EncryptedStream(
                                new CloudStream()
                        )
                )
        ); //Similar to this we can create more classes implementing Stream interface
    }

    private static void saveData(Stream stream){
        stream.write("normal text");
    }
}
