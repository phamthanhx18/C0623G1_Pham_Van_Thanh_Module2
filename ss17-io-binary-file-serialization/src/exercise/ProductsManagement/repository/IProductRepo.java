package exercise.ProductsManagement.repository;

import exercise.ProductsManagement.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {
    void addProduct(Product product);
    List<Product> getProducts();
    List<Product> searchProduct(String name);
}
