package service;

import model.Product;

import java.util.List;

public interface IProductService {

    public void addProduct(Product product);

    public List<Product> displayProduct();

    public List<Product> searchProduct(String name);
}
