package view;

import controller.FalicityController;

import java.util.Scanner;

public class PromotionView {
    private final Scanner scanner = new Scanner(System.in);
    private final FalicityController falicityController = new FalicityController();

    public void runMenuPromotionManagement() {
        int choicePromotion;
        do {
            System.out.println("---MenuPromotionManagement---");
            displayPromotionManagement();
            choicePromotion = Integer.parseInt(scanner.nextLine());
            switch (choicePromotion) {
                case 1:
                    System.out.println("Options1");
                    break;
                case 2:
                    System.out.println("Options2");
                    break;
                case 3:
                    break;
                default:
                    MainView.displayErrorChoice();
            }
        } while (choicePromotion != 3);
    }
    public void displayPromotionManagement() {
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");
    }
}
