package view;

import model.Student;
import model.Teacher;

public class MainView {
    public void displayMainMenu() {
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--");
        System.out.println("1. Thêm mới giảng viên hoặc học sinh");
        System.out.println("2. Xóa giảng viên hoặc học sinh");
        System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
        System.out.println("4. Thoát");
        System.out.println("Mời chọn chức nang:");
    }

    public void displayTeacherList(Teacher[] teachers, int numOfTeachers) {
        if (numOfTeachers==0) {
            System.out.println("Hiện danh sách giáo viên đang trống");
        } else {
            System.out.println("Danh sách giáo viên:");
            for (int i = 0; i < numOfTeachers; i++) {
                System.out.println(teachers[i]);
            }
        }
    }

    public void displayStudentList(Student[] students, int numOfStudents) {
        if (numOfStudents==0) {
            System.out.println("Hiện danh sách học sinh đang trống");
        } else {
            System.out.println("Danh sách học sinh:");
            for (int i = 0; i < numOfStudents; i++) {
                System.out.println(students[i]);
            }
        }
    }

    public void displayInvalidInput() {
        System.out.println("Lựa chọn của bạn không hợp lệ");
    }

    public void displayExitMessage() {
        System.out.println("Đang thoát...");
    }
}