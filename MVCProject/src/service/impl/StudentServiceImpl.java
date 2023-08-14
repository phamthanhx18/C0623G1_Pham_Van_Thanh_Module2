package service.impl;

import model.Student;
import repository.IStudenRepo;
import repository.impl.StudentRepoImpl;
import service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private final IStudenRepo studenRepo = new StudentRepoImpl();


    @Override
    public void createStudent(Student student) {
        this.studenRepo.createStudent(student);
    }

    @Override
    public void removeStudent(int code) {
        this.studenRepo.removeStudent(code);
    }

    @Override
    public List<Student> getStudents() {
        return this.studenRepo.getStudents();
    }
}
