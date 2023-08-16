package exercise.useArrayListLinkedList.repository;

import exercise.useArrayListLinkedList.model.Product;

import java.util.List;

public interface IProductRepo {
    void addProduct(Product product);

    void removeProductById(int id);

    void editProductbyId(int id, Product product);

    Product searchProduct(String name);

    List<Product> getProducts();

    List<Product> sortListByPriceaAscending();

    List<Product> sortListByPriceaDecrease();
}
