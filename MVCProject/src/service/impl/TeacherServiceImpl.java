package service.impl;

import model.Teacher;
import repository.ITeacherRepo;
import repository.impl.TeacherRepoImpl;
import service.ITeacherService;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService {
    private final ITeacherRepo teacherRepo = new TeacherRepoImpl();

    @Override
    public void createTeacher(Teacher teacher) {
        this.teacherRepo.createTeacher(teacher);
    }

    @Override
    public void removeTeacher(int code) {
        this.teacherRepo.removeTeacher(code);
    }

    @Override
    public List<Teacher> getTeachers() {
        return this.teacherRepo.getTeachers();
    }
}
