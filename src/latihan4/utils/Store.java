package latihan4.utils;

import java.util.ArrayList;
import java.util.List;
import latihan4.product.Product;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product findById(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }
}
