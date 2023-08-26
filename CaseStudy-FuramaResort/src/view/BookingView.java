package view;

import controller.FalicityController;

import java.util.Scanner;

public class BookingView {
    private final Scanner scanner = new Scanner(System.in);
    private final FalicityController falicityController = new FalicityController();

    public void displayBookingManagerment() {
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");
    }

    public void runMenuBookingManagement() {
        int choiceBooking;
        do {
            System.out.println("---MenuBookingManagement---");
            displayBookingManagerment();
            choiceBooking = Integer.parseInt(scanner.nextLine());
            switch (choiceBooking) {
                case 1:
                    System.out.println("Options1");
                    break;
                case 2:
                    System.out.println("Options2");
                    break;
                case 3:
                    System.out.println("Options3");
                    break;
                case 4:
                    System.out.println("Options4");
                    break;
                case 5:
                    System.out.println("Options5");
                    break;
                case 6:
                    break;
                default:
                    MainView.displayErrorChoice();
            }
        } while (choiceBooking != 5);
    }

}
