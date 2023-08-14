package controller;

import model.Teacher;
import service.ITeacherService;
import service.impl.TeacherServiceImpl;

import java.util.List;

public class TeacherController {
    private final ITeacherService teacherService = new TeacherServiceImpl();

    public void createTeacher(Teacher teacher) {
        this.teacherService.createTeacher(teacher);
    }

    public void removeTeacher(int code) {
        this.teacherService.removeTeacher(code);
    }

    public List<Teacher> getTeachers() {
        return this.teacherService.getTeachers();
    }
}
