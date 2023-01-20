package structural.proxy;

public class Main {
    public static void main(String[] args) {
        EbookService ebookService = new EbookService();
        ebookService.addEbook(new EbookProxy("a"));
        ebookService.addEbook(new EbookProxy("b"));
        ebookService.addEbook(new EbookProxy("c"));

        ebookService.getBook("a");
        ebookService.getBook("a");

    }
}
