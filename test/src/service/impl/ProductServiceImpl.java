package service.impl;

import model.Product;
import repository.IProductRepo;
import repository.impl.ProductRepoImpl;
import service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    private final IProductRepo productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public List<Product> displayProduct() {
        return productRepo.displayProduct();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return productRepo.searchProduct(name);
    }
}
