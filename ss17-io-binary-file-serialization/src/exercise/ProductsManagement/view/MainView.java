package exercise.ProductsManagement.view;

import exercise.ProductsManagement.controller.ProductController;
import exercise.ProductsManagement.model.Product;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private final ProductController productController = new ProductController();
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("--- QUAN LY SAN PHAM---");
        System.out.println("1. Them san pham");
        System.out.println("2. Hien thi san pham");
        System.out.println("3. Tim kiem san pham");
        System.out.println("0. Exit");
        System.out.println("Moi chon chuc nang");
    }

    public void runProgram() {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productController.addProduct(inputProduct());
                    break;
                case 2:
                    viewProduct(productController.getProducts());
                    break;
                case 3:
                    List<Product> productsSearch = productController.searchProduct(inputNameProduct());
                    viewProduct(productsSearch);
                    break;
                case 0:
                    displayMessegerExit();
                    break;
                default:
                    displayMessergerErrorOptionInput();
            }
        } while (choice != 0);
    }

    public Product inputProduct(){
        Product product = new Product();

        System.out.println("Nhap ID Product:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();

        System.out.println("Nhap gia san pham");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap nha san xuat");
        String producer = scanner.nextLine();

        System.out.println("Nhap mo ta cua san pham");
        String description = scanner.nextLine();

        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setProducer(producer);
        product.setDescription(description);

        return product;
    }
    public void viewProduct(List<Product> products){
        for (Product product: products) {
            System.out.println(product);
        }
    }
    public String inputNameProduct(){
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        return name;
    }

    public void displayMessergerErrorOptionInput(){
        System.out.println("Lua chon cua ban khong hop le");
    }

    public void displayMessegerExit(){
        System.out.println("Dang thoat chuong trinh");
    }
}
