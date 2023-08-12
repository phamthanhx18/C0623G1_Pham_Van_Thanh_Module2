package service;

import controller.StudentController;
import controller.TeacherController;
import model.Person;
import model.Student;
import model.Teacher;

import java.util.Arrays;
import java.util.Scanner;

public class PersonOptions {
    Scanner scanner = new Scanner(System.in);
    TeacherController teacherController = new TeacherController();
    StudentController studentController = new StudentController();
    Person[] personArray = new Person[100]; // sử dụng mảng để lưu trữ các đối tượng mới được thêm vào

    public PersonOptions() {
        // Tạo ra một giảng viên và một sinh viên mẫu
        Teacher teacher = new Teacher("T001", "HaiTT", "2000-01-01", "Male", "Java");
//        teacherController.addTeacher(teacher, personArray);
        personArray[0] = teacher;

        Student student = new Student("S001", "Thanh", "2000-01-01", "Male", "C0623G1", 10);
//        studentController.addStudent(student, personArray);
        personArray[1] = student;
    }

    public void addTeacherOptions() {
        System.out.println("Enter code:");
        String code = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter birthdate:");
        String birthdate = scanner.nextLine();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter expertise:");
        String expertise = scanner.nextLine();
        Teacher teacher2 = new Teacher(code, name, birthdate, gender, expertise);
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i] == null) {
                personArray[i] = teacher2;
                break;
            }
        }
    }

    public void addStudentOptions() {
        System.out.println("Enter code:");
        String code = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter birthdate:");
        String birthdate = scanner.nextLine();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter class:");
        String classes = scanner.nextLine();
        System.out.println("Enter score:");
        int score = scanner.nextInt();
        scanner.nextLine();
        Student student1 = new Student(code, name, birthdate, gender, classes, score);
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i] == null) {
                personArray[i] = student1;
                break;
            }
        }
    }

    public void viewPersonArray() {
        System.out.println("Danh sách:");
        System.out.println(Arrays.toString(personArray));
    }
}