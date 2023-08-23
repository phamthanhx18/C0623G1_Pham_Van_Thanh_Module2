package exercise.ProductsManagement.service.impl;

import exercise.ProductsManagement.model.Product;
import exercise.ProductsManagement.repository.impl.ProductRepoImpl;
import exercise.ProductsManagement.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final ProductRepoImpl productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.getProducts();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return productRepo.searchProduct(name);
    }
}
