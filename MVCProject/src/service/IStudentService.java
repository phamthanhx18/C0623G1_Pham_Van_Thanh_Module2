package service;

import model.Student;

import java.util.List;

public interface IStudentService {

    void createStudent(Student student);

    void removeStudent(int code);

    List<Student> getStudents();
}
