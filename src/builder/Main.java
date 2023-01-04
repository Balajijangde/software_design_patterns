package builder;

public class Main {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlides("slide one");
        presentation.addSlides("slide two");

        PdfDocumentBuilder pdfDocumentBuilder = new PdfDocumentBuilder();
        presentation.export(pdfDocumentBuilder);
        System.out.println(pdfDocumentBuilder.getPdfDocument());

        MovieBuilder movieBuilder = new MovieBuilder();
        presentation.export(movieBuilder);
        System.out.println(movieBuilder.getMovie());
    }
}
