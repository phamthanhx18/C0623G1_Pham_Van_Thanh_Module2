package view;

import java.util.Scanner;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);

    public void runProgammer() {
        int choice;
        do {
            displayMainMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeView employeeView = new EmployeeView();
                    employeeView.runMenuEmployeeManagement();
                    break;
                case 2:
                    CustomerView customerView = new CustomerView();
                    customerView.runMenuCustomerManagement();
                    break;
                case 3:
                    FacilityView facilityView = new FacilityView();
                    facilityView.runMenuFacilityManagement();
                    break;
                case 4:
                    BookingView bookingView = new BookingView();
                    bookingView.runMenuBookingManagement();
                    break;
                case 5:
                    PromotionView promotionView = new PromotionView();
                    promotionView.runMenuPromotionManagement();
                    break;
                case 6:
                    break;
                default:
                    displayErrorChoice();
            }
        } while (choice != 6);
    }

    public void displayMainMenu() {
        System.out.println("---FURUMA RESOT---");
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
    }

    public static void displayErrorChoice() {
        System.out.println("Lua chon khong hop le !");
    }


}
