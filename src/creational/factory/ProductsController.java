package creational.factory;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpViewController{
    public void listAllProducts(){
        //Get all products from DB
        Map<String, Object> products = new HashMap<>();
        super.render("template.html", products);
    }
}
