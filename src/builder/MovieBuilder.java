package builder;

import java.util.ArrayList;
import java.util.List;

public class MovieBuilder implements DocumentBuilder{
    private final List<String> slides = new ArrayList<>();

    @Override
    public void addSlides(String text) {
        slides.add(text);
    }

    public List<String> getMovie(){
        return this.slides;
    }
}
