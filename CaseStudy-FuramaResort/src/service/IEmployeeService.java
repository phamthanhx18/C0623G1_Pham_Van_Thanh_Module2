package service;

import model.Person.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee> {
    void del(String id);

    void editEmployee(String id, Employee employee);
    List<Employee> searchEmployee(String name);
}
