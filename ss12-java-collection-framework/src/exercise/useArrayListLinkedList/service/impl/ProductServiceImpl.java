package exercise.useArrayListLinkedList.service.impl;

import exercise.useArrayListLinkedList.model.Product;
import exercise.useArrayListLinkedList.repository.impl.ProductRepoImpl;
import exercise.useArrayListLinkedList.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    ProductRepoImpl productService = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public void removeProductById(int id) {
        productService.removeProductById(id);
    }

    @Override
    public void editProductbyId(int id, Product product) {
        productService.editProductbyId(id, product);
    }

    @Override
    public Product searchProduct(String name) {
        return productService.searchProduct(name);
    }

    @Override
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @Override
    public List<Product> sortListByPriceaAscending() {
        return productService.sortListByPriceaAscending();
    }

    @Override
    public List<Product> sortListByPriceaDecrease() {
        return productService.sortListByPriceaDecrease();
    }

    @Override
    public String toString() {
        return "List{" +
                "\n" + getProducts() +
                "\n}";
    }
}
