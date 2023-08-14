package service;

import java.util.Scanner;

import model.Student;
import model.Teacher;
import view.MainView;

public class ServiceMain {
    private Scanner sc;
    private Teacher[] teachers;
    private Student[] students;
    private int numOfTeachers;
    private int numOfStudents;

    public ServiceMain() {
        sc = new Scanner(System.in);
        teachers = new Teacher[10];
        students = new Student[10];
        numOfTeachers = 0;
        numOfStudents = 0;
    }

    public void addTeacher() {
        System.out.println("Nhập mã của giáo viên: ");
        String code = sc.nextLine();

        System.out.println("Nhập tên của giáo viên: ");
        String name = sc.nextLine();

        System.out.println("Nhập ngày sinh của giáo viên: ");
        String birthdate = sc.nextLine();

        System.out.println("Nhập giới tính của giáo viên: ");
        String gender = sc.nextLine();

        System.out.println("Nhập chuyên môn: ");
        String level = sc.nextLine();

        Teacher newTeacher = new Teacher(code, name, birthdate, gender, level);
        teachers[numOfTeachers] = newTeacher;
        numOfTeachers++;
        System.out.println("Thêm thành công");
    }

    public void addStudent() {
        System.out.println("Nhập mã của học sinh: ");
        String code = sc.nextLine();

        System.out.println("Nhập tên của học sinh: ");
        String name = sc.nextLine();

        System.out.println("Nhập ngày sinh của học sinh: ");
        String birthdate = sc.nextLine();

        System.out.println("Nhập giới tính của học sinh: ");
        String gender = sc.nextLine();

        System.out.println("Nhập lớp của học sinh: ");
        String classes = sc.nextLine();

        System.out.println("Nhập điểm của học sinh: ");
        int score = sc.nextInt();

        Student newStudent = new Student(code, name, birthdate, gender, classes, score);
        students[numOfStudents] = newStudent;
        numOfStudents++;
        System.out.println("Thêm thành công");
    }

    public void removeTeacher() {
        if (numOfTeachers == 0) {
            System.out.println("Danh sách trống nên không thể xoá");
        } else {
            System.out.println("Nhập mã giáo viên cần xoá : ");
            String code = sc.nextLine();

            for (int i = 0; i < numOfTeachers; i++) {
                if (teachers[i].getCode().equals(code)) {
                    System.out.println("Bạn có chắc chắn xoá! \n(Nhập 'yes' để Xoá, 'no' Quay trở lại)");
                    String confirm = sc.nextLine();
                    if (confirm.equals("yes")) {
                        teachers[i] = null;
                        for (int j = i; j < numOfTeachers - 1; j++) {
                            teachers[j] = teachers[j + 1];
                        }
                        teachers[numOfTeachers - 1] = null;
                        numOfTeachers--;
                        System.out.println("Đã xoá teacher có mã " + code);
                    }
                    break;
                } else if (i == numOfTeachers - 1) {
                    System.out.println("Không tìm thấy teacher có mã " + code);
                }
            }
        }
    }

    public void removeStudent() {
        if (numOfStudents == 0) {
            System.out.println("Danh sách trống nên không thể xoá");
        } else {
            System.out.println("Nhập mã học sinh cần xoá : ");
            String code = sc.nextLine();

            for (int i = 0; i < numOfStudents; i++) {
                if (students[i].getCode().equals(code)) {
                    System.out.println("Bạn có chắc chắn xoá! \n(Nhập 'yes' để Xoá, 'no' Quay trở lại)");
                    String confirm = sc.nextLine();
                    if (confirm.equals("yes")) {
                        students[i] = null;
                        for (int j = i; j < numOfStudents - 1; j++) {
                            students[j] = students[j + 1];
                        }
                        students[numOfStudents - 1] = null;
                        numOfStudents--;
                        System.out.println("Đã xoá student có mã " + code);
                    }
                    break;
                } else if (i == numOfStudents - 1) {
                    System.out.println("Không tìm thấy student có mã " + code);
                }
            }
        }
    }

    public void viewTeachers() {
        MainView view = new MainView();
        view.displayTeacherList(teachers, numOfTeachers);
    }

    public void viewStudents() {
        MainView view = new MainView();
        view.displayStudentList(students, numOfStudents);
    }
}
