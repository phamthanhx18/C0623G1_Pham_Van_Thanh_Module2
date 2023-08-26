package controller;

import model.Person.Employee;
import service.IEmployeeService;
import service.impl.EmployeeServiceImpl;
import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeServiceImpl();

    public void editEmployee(String id, Employee employee) {
        employeeService.editEmployee(id, employee);
    }

    public List<Employee> searchEmployee(String name) {
        return employeeService.searchEmployee(name);
    }

    public void add(Employee employee) {
        employeeService.add(employee);
    }

    public List<Employee> getList() {
        return employeeService.getList();
    }

    public void del(String id) {
        employeeService.del(id);
    }
}
