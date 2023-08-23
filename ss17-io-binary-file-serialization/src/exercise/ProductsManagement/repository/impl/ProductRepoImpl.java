package exercise.ProductsManagement.repository.impl;

import exercise.ProductsManagement.model.Product;
import exercise.ProductsManagement.repository.IProductRepo;
import exercise.ProductsManagement.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {
    public static final String MATH = ",";
    private final String pathFileData = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\ss17-io-binary-file-serialization\\src\\exercise\\ProductsManagement\\data\\data.csv";


    @Override
    public void addProduct(Product product) {
        List<Product> products= this.getProducts();
        products.add(product);
        FileUtils.writeFile(pathFileData,convertToStringList(products));
    }

    @Override
    public List<Product> getProducts() {
        return convertToProductList(FileUtils.readFile(pathFileData));
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products= this.getProducts();
        List<Product> productSearch = new ArrayList<>();
        for(Product product: products) {
            if (product.getName().matches("(.*)"+name+"(.*)")){
                productSearch.add(product);
            }
        }
        return productSearch;
    }
    public List<String> convertToStringList(List<Product> products) {
        List<String> stringList = new ArrayList<>();
        for (Product product: products) {
            stringList.add(product.getId()
                    +MATH+product.getName()
                    +MATH+product.getPrice()
                    +MATH+product.getProducer()
                    +MATH+product.getDescription());
        }
        return stringList;
    }
    public List<Product> convertToProductList(List<String> strings) {
        List<Product> products = new ArrayList<>();
        for (String string: strings) {
            String[] arrayProduct = string.split(MATH);
            products.add(new Product(Integer.parseInt(arrayProduct[0]),arrayProduct[1],Integer.parseInt(arrayProduct[2]),arrayProduct[3],arrayProduct[4]));
        }
        return products;
    }
}
