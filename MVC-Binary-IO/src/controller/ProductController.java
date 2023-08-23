package controller;

import model.Product;
import service.IProductService;
import service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();


    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public List<Product> displayProduct() {
        return this.productService.displayProduct();
    }

    public List<Product> searchProduct(String name) {
        return this.productService.searchProduct(name);
    }
}
