package controller;

import java.util.Scanner;

import service.PersonOptions;

public class OptionsController {
    public void choseOption(int option) {
        TeacherController teacherController = new TeacherController();
        PersonOptions personOptions = new PersonOptions(); // tạo đối tượng PersonOptions mới
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("1. To add teacher");
                System.out.println("2. To add student");
                int optionAdd = scanner.nextInt();
                scanner.nextLine(); // consume the remaining newline character
                if (optionAdd == 1) {
                    personOptions.addTeacherOptions();
                    System.out.println("Them giang vien thanh cong!");
                } else {
                    personOptions.addStudentOptions();
                    System.out.println("Them hoc sinh thanh cong!");
                }
                break;
            case 2:
                System.out.println("Nhap ma de xoa:");
                String code = scanner.nextLine();
                teacherController.deletePerson(code);
                break;
            case 3:
                personOptions.viewPersonArray(); // sử dụng đối tượng PersonOptions để hiển thị danh sách
                break;
            case 4:
                System.out.println("Exit thanh cong !");
                break;
            default:
                System.out.println("Khong hop le!");
                break;
        }
    }

}