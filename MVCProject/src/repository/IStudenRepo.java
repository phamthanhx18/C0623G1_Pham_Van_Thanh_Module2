package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudenRepo {
    List<Student> getAllStudent();
    void addStudent();
    void removeStudent();
}
