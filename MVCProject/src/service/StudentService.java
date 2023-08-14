package service;

import model.Student;
import repository.IStudenRepo;
import repository.StudentRepo;

public class StudentService implements IService{
    private IStudenRepo studenRepo = new StudentRepo();
    @Override
    public void view() {
       for (Student student : studenRepo.getAllStudent()) {
           System.out.println(student);
       }
    }

    @Override
    public void del() {

    }

    @Override
    public void add() {

    }
}
