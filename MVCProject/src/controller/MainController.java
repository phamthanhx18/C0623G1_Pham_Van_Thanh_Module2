package controller;

import java.util.Scanner;
import view.MainView;

public class MainController {
    public void run() {
        int option;
        MainView view = new MainView();
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        Scanner sc = new Scanner(System.in);
        do {
            view.displayMainMenu();
            option = Integer.parseInt(sc.nextLine());
            int choice;
            int remove;
            switch (option) {
                case 1:
                    view.objectAction();
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice==1) {
                        teacherController.createTeacher(view.inputInfoTeacher());
                    } else if (choice==2){
                        studentController.createStudent(view.inputInfoStudent());
                    } else {
                        view.displayInvalidInput();
                    }
                    break;
                case 2:
                    view.objectAction();
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice==1) {
                        remove = view.codeTeacherRemove();
                        if (view.confirmDelete()) {
                            teacherController.removeTeacher(remove);
                        }
                        break;
                    } else if (choice==2){
                        remove = view.codeStudentRemove();
                        if (view.confirmDelete()) {
                            studentController.removeStudent(remove);
                        }
                    } else {
                        view.displayInvalidInput();
                    }
                    break;
                case 3:
                    view.objectAction();
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice==1) {
                        view.displayTeacherList(teacherController.getTeachers());
                    } else if (choice==2){
                        view.displayStudentList(studentController.getStudents());
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
