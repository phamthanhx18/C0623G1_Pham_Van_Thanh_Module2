package view;

import controller.CustomerController;
import model.Person.Customer;
import utils.RegexUtils;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final Scanner scanner = new Scanner(System.in);
    private final RegexUtils regexUtils = new RegexUtils();
    private final CustomerController customerController = new CustomerController();
    public void runMenuCustomerManagement() {
        int choiceCustomer;
        do {
            displayCustomerManagement();
            choiceCustomer = Integer.parseInt(scanner.nextLine());
            switch (choiceCustomer) {
                case 1:
                    displayListCustomer(customerController.getList());
                    MainView.displayMessegeSucces();
                    break;
                case 2:
                    customerController.add(inputCustomer());
                    MainView.displayMessegeSucces();
                    break;
                case 3:
                    customerController.editCustomer(inputIdCustomer(),inputCustomer());
                    MainView.displayMessegeSucces();
                    break;
                case 4:
                    customerController.del(inputIdCustomer());
                    MainView.displayMessegeSucces();
                    break;
                case 5:
                    displayListCustomer(customerController.searchCusomer(inputNameCustomer()));
                    break;
                case 6:
                    break;
                default:
                    MainView.displayErrorChoice();
            }
        } while (choiceCustomer != 6);
    }

    public void displayCustomerManagement() {
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Delete customer\n" +
                "5. Search by name customer\n" +
                "6. Return main menu");
    }

    public Customer inputCustomer() {
        String id;
        do {
            System.out.println("Nhap ID Customer (Ex: KH-YYYY)");
            id = scanner.nextLine();
        } while (!regexUtils.validateIdCustomer(id));

        String fullName;
        do {
            System.out.println("Nhap fullName Customer (Ex: Pham Van Thanh)");
            fullName = scanner.nextLine();
        } while (!regexUtils.validateName(fullName));

        String birthday;
        do {
            System.out.println("Nhap birthday Customer (EX: 18-12-2000)");
            birthday = scanner.nextLine();
        } while (!regexUtils.validateBirthday(birthday));

        String gender;
        do {
            System.out.println("Nhap gender Customer");
            gender = scanner.nextLine();
        } while (!regexUtils.validateGender(gender));

        String identityCard;
        do {
            System.out.println("Nhap identityCard Customer");
            identityCard = scanner.nextLine();
        } while (!regexUtils.validateIdentityCard(identityCard));

        String phone;
        do {
            System.out.println("Nhap phone Customer");
            phone = scanner.nextLine();
        } while (!regexUtils.validatePhoneVietNam(phone));

        String email;
        do {
            System.out.println("Nhap email Customer");
            email = scanner.nextLine();
        } while (!regexUtils.validateEmail(email));

        String customerType;
        do {
            System.out.println("Nhap Lever cua Customer (Diamond, Platinum, Gold, Silver, Member)");
            customerType = scanner.nextLine();
        } while (!regexUtils.validateType(customerType));

        String location;
        do {
            System.out.println("Nhap Dia chi Customer");
            location = scanner.nextLine();
        } while (!regexUtils.validateLocation(location));

        return new Customer(id,fullName,birthday,gender,identityCard,phone,email,customerType,location);
    }

    public String inputIdCustomer(){
        String string;
        do {
            System.out.println("Nhap ID");
            string = scanner.nextLine();
        } while (!regexUtils.validateIdCustomer(string));
        return string;
    }

    public String inputNameCustomer(){
        String string;
        do {
            System.out.println("Nhap Ten");
            string = scanner.nextLine();
        } while (!regexUtils.validateOnlyText(string));
        return string;
    }

    public void displayListCustomer(List<Customer> customers){
        if (customers.isEmpty()){
            System.out.println("Khong co ket qua");
        } else {
            for (Customer customer: customers) {
                System.out.println(customer);
            }
        }
    }

}
