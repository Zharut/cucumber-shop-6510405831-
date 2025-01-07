package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price, int stock) {
        products.put(name, new Product(name, price, stock));
    }

    public Product getProduct(String name) {
        return products.get(name);
    }

    public void checkStock(String name, int amount) {
        Product product = products.get(name);
        if (product != null) {
            int stock = product.getStock();
            if (stock < amount) {
                throw new NotEnoughProductException("Not enough stock for product: " + name);
            }
        } else {
            System.out.println("Product not found.");
        }
    }
}
