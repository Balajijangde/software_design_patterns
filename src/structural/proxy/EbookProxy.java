package structural.proxy;

public class EbookProxy implements Ebook{
    private final String title;
    private RealEbook ebook;

    public EbookProxy(String title) {
        this.title = title;
    }

    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(title);
        ebook.show();
    }

    @Override
    public String getFilename() {
        return title;
    }
}
