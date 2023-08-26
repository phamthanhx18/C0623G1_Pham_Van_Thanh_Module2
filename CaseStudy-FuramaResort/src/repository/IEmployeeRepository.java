package repository;

import model.Person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee>{

    void del(String id);

    void editEmployee(String id, Employee employee);
    List<Employee> searchEmployee(String name);
}
