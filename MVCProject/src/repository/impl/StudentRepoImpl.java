package repository.impl;

import model.Student;
import repository.IStudenRepo;

import java.util.ArrayList;
import java.util.List;

public class StudentRepoImpl implements IStudenRepo {

    private final List<Student> students = new ArrayList<>();
    @Override
    public List<Student> getStudents() {
        return this.students;
    }

    @Override
    public void createStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void removeStudent(int code) {
        for (Student student : this.students) {
            if (student.getCode() == code) {
                this.students.remove(student);
                return;
            }
        }
    }
}
