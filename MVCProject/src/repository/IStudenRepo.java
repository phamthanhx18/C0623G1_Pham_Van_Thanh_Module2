package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudenRepo {

    List<Student> getStudents();

    void createStudent(Student student);

    void removeStudent(int code);

}
