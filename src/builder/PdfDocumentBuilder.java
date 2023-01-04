package builder;

import java.util.ArrayList;
import java.util.List;

public class PdfDocumentBuilder implements DocumentBuilder{

    private final List<String> slides = new ArrayList<>();

    @Override
    public void addSlides(String text) {
        slides.add(text);
    }

    public List<String> getPdfDocument(){
        return this.slides;
    }
}
