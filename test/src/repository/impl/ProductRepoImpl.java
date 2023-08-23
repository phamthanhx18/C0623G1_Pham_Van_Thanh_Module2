package repository.impl;

import model.Product;
import repository.IProductRepo;
import utils.UtilsFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {
    private final String PATH = "C:\\Users\\Admin\\Documents\\GitHub\\C0623G1_Pham_Van_Thanh_Module2\\test\\src\\product.txt";

    @Override
    public void addProduct(Product product) {
        List<Product> productList = this.displayProduct();
        productList.add(product);
        UtilsFile.writeFile(PATH, productList);
    }

    @Override
    public List<Product> displayProduct() {
        return UtilsFile.readFile(PATH);
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products = this.displayProduct();
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().startsWith(name)) {
                result.add(product);
            }
        }
        return result;
    }
}
