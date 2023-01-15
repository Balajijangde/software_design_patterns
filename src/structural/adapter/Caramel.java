package structural.adapter;

public class Caramel {
    public void init(){} // Its mandatory to call this method for using filter
    public void applyFilter(Image image){
        System.out.println("applying caramel filter");
    }
}
