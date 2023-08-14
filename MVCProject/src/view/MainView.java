package view;

import controller.MainController;
import model.Student;
import model.Teacher;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private final Scanner sc = new Scanner(System.in);
    public void displayMainMenu() {
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--");
        System.out.println("1. Thêm mới giảng viên hoặc học sinh");
        System.out.println("2. Xóa giảng viên hoặc học sinh");
        System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
        System.out.println("4. Thoát");
        System.out.println("Mời chọn chức nang:");
    }

    public void objectAction(){
        System.out.println("Chọn: \n" +
                "1. Giáo viên \n"+
                "2. Học sinh");
    }

    public Teacher inputInfoTeacher() {
        System.out.println("Nhập mã của giáo viên: ");
        int code = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên của giáo viên: ");
        String name = sc.nextLine();

        System.out.println("Nhập ngày sinh của giáo viên: ");
        String birthdate = sc.nextLine();

        System.out.println("Nhập giới tính của giáo viên: ");
        String gender = sc.nextLine();

        System.out.println("Nhập chuyên môn: ");
        String level = sc.nextLine();

        Teacher newTeacher = new Teacher(code, name, birthdate, gender, level);
        return newTeacher;
    }

    public Student inputInfoStudent() {
        System.out.println("Nhập mã của học sinh: ");
        int code = Integer.parseInt(sc.nextLine());

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
        return newStudent;
    }

    public int codeStudentRemove(){
        System.out.println("Nhập mã của học sinh cần xoá: ");
        int code = Integer.parseInt(sc.nextLine());
        return code;
    }

    public int codeTeacherRemove(){
        System.out.println("Nhập mã của giáo viên cần xoá: ");
        int code = Integer.parseInt(sc.nextLine());
        return code;
    }

    public boolean confirmDelete() {
        System.out.println("Bạn có chắc chắn muốn xoá không? (Nhập 'yes' để xác nhận, 'no' để huỷ ");
        String confirm = sc.nextLine();
        if (confirm.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public void displayTeacherList(List<Teacher> teachers) {
        if (teachers.size()==0) {
            System.out.println("Danh sách trống");
        } else {
            for (Teacher teacher: teachers) {
                System.out.println(teacher);
            }
        }
    }

    public void displayStudentList(List<Student> students) {
        if (students.size()==0) {
            System.out.println("Danh sách trống");
        } else {
            for (Student student: students) {
                System.out.println(student);
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