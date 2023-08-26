package repository.impl;

import model.Person.Employee;
import repository.IEmployeeRepository;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

    private final String pathFile = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\CaseStudy-FuramaResort\\src\\data\\data-employee.csv";
    private final String COMMA = ",";


    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employeeList = getList();
        for (Employee data: employeeList) {
            int index;
            if (data.getCodePerson().equals(id)){
                index = employeeList.indexOf(data);
                employeeList.set(index,employee);
            }
        }
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        List<Employee> employeeList = getList();
        List<Employee> employeesSearch = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getFullName().contains(name)){
                employeesSearch.add(employee);
            }
        }
        return employeesSearch;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = getList();
        employeeList.add(employee);
        FileUtils.writeFile(pathFile, convertToString(employeeList));
    }

    @Override
    public List<Employee> getList() {
        return convertToE(FileUtils.readFile(pathFile));
    }


    @Override
    public void del(String id) {
        List<Employee> employeeList = getList();
        employeeList.removeIf(employee -> employee.getCodePerson().equals(id));
        FileUtils.writeFile(pathFile, convertToString(employeeList));
    }

    @Override
    public List<String> convertToString(List<Employee> employeeList) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employeeList) {
            strings.add(
                    employee.getCodePerson() + COMMA +
                            employee.getFullName() + COMMA +
                            employee.getBirthday() + COMMA +
                            employee.getGender() + COMMA +
                            employee.getIdentityCard() + COMMA +
                            employee.getPhone() + COMMA +
                            employee.getEmail() + COMMA +
                            employee.getLevel() + COMMA +
                            employee.getLocation() + COMMA +
                            employee.getAmount());
        }
        return strings;
    }


    @Override
    public List<Employee> convertToE(List<String> strings) {
        List<Employee> employeeList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            employeeList.add(new Employee(data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8],
                    data[9]));
        }
        return employeeList;
    }
}
