package structural.proxy;

public class RealEbook implements Ebook{
    private final String title;

    public RealEbook(String title) {
        this.title = title;
        load();
    }

    public void load(){
        System.out.println("loading "+title);
    }

    @Override
    public void show() {
        System.out.println("showing "+this.title);
    }

    @Override
    public String getFilename() {
        return title;
    }
}
