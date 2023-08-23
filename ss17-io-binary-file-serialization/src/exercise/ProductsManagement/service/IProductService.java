package exercise.ProductsManagement.service;
import exercise.ProductsManagement.model.Product;
import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    List<Product> getProducts();
    List<Product> searchProduct(String name);
}
