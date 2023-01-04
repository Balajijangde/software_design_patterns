package builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private final List<String> slides = new ArrayList<>();

    public List<String> getSlides(){
        return slides;
    }

    public void addSlides(String text){
        slides.add(text);
    }

    public void export(DocumentBuilder documentBuilder){
        for(String slide : slides){
            documentBuilder.addSlides(slide);
        }
    }
}
