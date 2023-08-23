package exercise.ProductsManagement.controller;

import exercise.ProductsManagement.model.Product;
import exercise.ProductsManagement.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final ProductServiceImpl productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        productService.addProduct(product);
    }
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    public List<Product> searchProduct(String name) {
        return productService.searchProduct(name);
    }
}
