package exercise.useArrayListLinkedList.view;
import exercise.useArrayListLinkedList.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner sc = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("---Chương trình quản lý sản phẩm---");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo id");
        System.out.println("3. Xoá sản phẩm theo id");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm");
        System.out.println("0. Thoát");
        System.out.println("Mời chọn chức nang:");
    }

    public Product inputInfoProduct(){
        System.out.println("Nhập ID sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());

        Product newProduct = new Product(id,name,price);
        return newProduct;
    }

    public Product inputEditProduct(){
        System.out.println("Nhập ID mới: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên mới: ");
        String name = sc.nextLine();

        System.out.println("Nhập giá mới: ");
        int price = Integer.parseInt(sc.nextLine());

        Product editProduct = new Product(id,name,price);
        return editProduct;
    }

    public void displayProduct(List<Product> products) {
        if (products.size()==0) {
            System.out.println("Danh sách trống");
        } else {
            System.out.println("Danh sách sản phẩm");
            for (Product product: products) {
                System.out.println(product);
            }
        }
    }

    public void displayProductSearch(Product product) {
        String result= "Product{" + "id=" + product.getId() + ", name='" + product.getName() + '\'' + ", price=" + product.getPrice() + '}';
        System.out.println("Tìm thấy: "+result);
    }

    public int optionsSortProduct(){
        System.out.println("Nhập định dạng cần sắp xếp: ");
        System.out.println("1. Sắp xếp tăng dần");
        System.out.println("2. Sắp xếp giảm dần");
        int optionSort = Integer.parseInt(sc.nextLine());
        return optionSort;
    }

    public int inputId(){
        System.out.println("Nhập ID sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        return id;
    }

    public int inputIdRemove(){
        System.out.println("Nhập ID sản phẩm cần xóa: ");
        int idRemove = Integer.parseInt(sc.nextLine());
        return idRemove;
    }

    public String inputNameSearch(){
        System.out.println("Nhập ID sản phẩm: ");
        String name = sc.nextLine();
        return name;
    }

    public void displayExitMesseger(){
        System.out.println("Đang thoát chương trình !");
    }

    public void choiceErrorMesseger(){
        System.out.println("Lựa chọn không hợp lệ");
    }
}
