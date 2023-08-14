package repository;

import model.Teacher;

import java.util.List;

public interface ITeacherRepo {
    List<Teacher> getTeachers();

    void createTeacher(Teacher teacher);

    void removeTeacher(int code);

}
