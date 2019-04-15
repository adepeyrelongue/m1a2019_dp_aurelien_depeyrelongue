package factory;
import products.Products;
import java.util.HashMap;

public class ProductsFactory {
    private static HashMap<String, Products> registry = new HashMap<String,Products>();
    public static void registerProduct(String name,Products p){
        registry.put(name,p);
    }
    public static Products createProduct(String name){
        return registry.get(name);
    }
}
