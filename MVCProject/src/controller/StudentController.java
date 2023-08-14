package controller;

import model.Student;
import service.IStudentService;
import service.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {
    private final IStudentService studentService = new StudentServiceImpl();

    public void createStudent(Student student) {
        this.studentService.createStudent(student);
    }

    public void removeStudent(int code) {
        this.studentService.removeStudent(code);
    }

    public List<Student> getStudents() {
        return this.studentService.getStudents();
    }
}
