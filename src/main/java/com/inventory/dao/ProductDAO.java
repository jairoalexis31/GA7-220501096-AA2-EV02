package main.java.com.inventory.dao;

import main.java.com.inventory.model.Product;
import java.util.List;

public interface ProductDAO {
    void insertProduct(Product product);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(int productId);
    Product getProductById(int productId);
}
