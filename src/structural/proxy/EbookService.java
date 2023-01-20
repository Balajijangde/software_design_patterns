package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class EbookService {
    private Map<String, Ebook> ebooks = new HashMap<>();
    void addEbook(Ebook ebook){
        ebooks.put(ebook.getFilename(), ebook);
    }

    void getBook(String title){
        ebooks.get(title).show();
    }
}
