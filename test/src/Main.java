import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String path = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\test\\src\\file.scv";
        List<Product> products = new ArrayList<>();
        Product product = new Product(1,"1",1555,"12","122");
        Product product1 = new Product(2,"1",1555,"12","122");
        Product product2 = new Product(3,"1",1555,"12","122");
        products.add(product);
        products.add(product1);
        products.add(product2);

        FileUtils.writeFile(path,products);
        List<Product> productList =  FileUtils.readFile(path);
        System.out.println(productList);
    }
}