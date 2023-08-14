package repository.impl;

import model.Student;
import model.Teacher;
import repository.ITeacherRepo;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepoImpl implements ITeacherRepo {
    private final List<Teacher> teachers = new ArrayList<>();

    @Override
    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    @Override
    public void createTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    @Override
    public void removeTeacher(int code) {
        for (Teacher teacher : this.teachers) {
            if (teacher.getCode() == code) {
                this.teachers.remove(teacher);
                return;
            }
        }
    }
}
