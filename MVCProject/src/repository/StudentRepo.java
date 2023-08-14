package repository;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo implements IStudenRepo {

    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student("1","Thanh","1/1/2001","Male","C026G1",99));
        studentList.add(new Student("2","Thanh","1/1/2001","Male","C026G1",99));
        studentList.add(new Student("3","Thanh","1/1/2001","Male","C026G1",99));
    }
    @Override
    public List<Student> getAllStudent() {
        return studentList;
    }

    @Override
    public void addStudent() {

    }

    @Override
    public void removeStudent() {

    }
}
