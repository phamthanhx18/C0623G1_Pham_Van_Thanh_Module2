package view;

import controller.OptionsController;

import java.util.Scanner;

public class PersonView {
    Scanner scanner = new Scanner(System.in);

    public void manager() {
        while (true) {
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa ");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Exit");
            System.out.println("Chon chuc nang:");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 4) {
                System.out.println("Goodbye!");
                break;
            }

            OptionsController optionsController = new OptionsController();
            optionsController.choseOption(option);
        }
    }
}