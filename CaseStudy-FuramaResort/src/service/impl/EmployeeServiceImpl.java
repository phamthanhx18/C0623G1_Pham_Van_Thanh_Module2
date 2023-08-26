package service.impl;

import model.Person.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepositoryImpl;
import service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public void editEmployee(String id, Employee employee) {
        employeeRepository.editEmployee(id, employee);
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        return employeeRepository.searchEmployee(name);
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public List<Employee> getList() {
        return employeeRepository.getList();
    }

    @Override
    public void del(String id) {
        employeeRepository.del(id);
    }
}
