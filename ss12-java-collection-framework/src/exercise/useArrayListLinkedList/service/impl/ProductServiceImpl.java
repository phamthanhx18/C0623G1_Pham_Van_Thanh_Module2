package exercise.useArrayListLinkedList.service.impl;

import exercise.useArrayListLinkedList.model.Product;
import exercise.useArrayListLinkedList.repository.impl.ProductRepoImpl;
import exercise.useArrayListLinkedList.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final ProductRepoImpl productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public void removeProductById(int id) {
        productRepo.removeProductById(id);
    }

    @Override
    public void editProductbyId(int id, Product product) {
        productRepo.editProductbyId(id, product);
    }

    @Override
    public Product searchProduct(String name) {
        return productRepo.searchProduct(name);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.getProducts();
    }

    @Override
    public List<Product> sortListByPriceaAscending() {
        return productRepo.sortListByPriceaAscending();
    }

    @Override
    public List<Product> sortListByPriceaDecrease() {
        return productRepo.sortListByPriceaDecrease();
    }

    @Override
    public String toString() {
        return "List{" +
                "\n" + getProducts() +
                "\n}";
    }
}
