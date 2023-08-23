package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {

    void addProduct(Product product);

    List<Product> displayProduct();

    List<Product> searchProduct(String name);
}
