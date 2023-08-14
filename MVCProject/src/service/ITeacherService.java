package service;

import model.Teacher;

import java.util.List;

public interface ITeacherService {
    void createTeacher(Teacher teacher);

    void removeTeacher(int code);

    List<Teacher> getTeachers();
}
