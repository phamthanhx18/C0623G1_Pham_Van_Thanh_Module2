package controller;

import java.util.Scanner;
import service.ServiceMain;
import view.MainView;

public class MainController {
    public void run() {
        int option;
        do {
            ServiceMain serviceMain = new ServiceMain();
            MainView view = new MainView();
            Scanner sc = new Scanner(System.in);

            view.displayMainMenu();
            System.out.println("Mời chọn chức nang:");
            option = sc.nextInt();
            int choice;
            switch (option) {
                case 1:
                    System.out.println("Chọn: \n" +
                            "1. Thêm mới giáo viên \n"+
                            "2. Thêm mới học sinh");
                    choice = sc.nextInt();
                    sc.nextLine();
                    if (choice==1) {
                        serviceMain.addTeacher();
                    } else if (choice==2){
                        serviceMain.addStudent();
                    } else {
                        view.displayInvalidInput();
                    }
                    break;
                case 2:
                    System.out.println("Chọn: \n" +
                            "1. Xoá giáo viên \n"+
                            "2. Xoá học sinh");
                    choice = sc.nextInt();
                    sc.nextLine();
                    if (choice==1) {
                        serviceMain.removeTeacher();
                    } else if (choice==2){
                        serviceMain.removeStudent();
                    } else {
                        view.displayInvalidInput();
                    }
                    break;
                case 3:
                    System.out.println("Chọn: \n" +
                            "1. Xem danh sách giáo viên \n"+
                            "2. Xem danh sách học sinh");
                    choice = sc.nextInt();
                    sc.nextLine();
                    if (choice==1) {
                        serviceMain.viewTeachers();
                    } else if (choice==2){
                        serviceMain.viewStudents();
                    } else {
                        view.displayInvalidInput();
                    }
                    break;
                case 4:
                    view.displayExitMessage();
                    break;
                default:
                    view.displayInvalidInput();
                    break;
            }
        } while (option != 4);
    }
}
