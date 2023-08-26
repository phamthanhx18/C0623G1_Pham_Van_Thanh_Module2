package repository.impl;

import model.Person.Customer;
import model.Person.Employee;
import repository.ICustomerRepository;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private final String pathFile = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\CaseStudy-FuramaResort\\src\\data\\data-customer.csv";
    private final String COMMA = ",";

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = getList();
        for (Customer data: customerList) {
            int index;
            if (data.getCodePerson().equals(id)){
                index = customerList.indexOf(data);
                customerList.set(index,customer);
            }
        }
    }

    @Override
    public List<Customer> searchCusomer(String name) {
        List<Customer> customerList = getList();
        List<Customer> customerSearch = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getFullName().contains(name)){
                customerSearch.add(customer);
            }
        }
        return customerSearch;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = getList();
        customerList.add(customer);
        FileUtils.writeFile(pathFile, convertToString(customerList));
    }

    @Override
    public List<Customer> getList() {
        return convertToE(FileUtils.readFile(pathFile));
    }

    @Override
    public void del(String id) {
        List<Customer> customerList = getList();
        customerList.removeIf(customer -> customer.getCodePerson().equals(id));
        FileUtils.writeFile(pathFile, convertToString(customerList));
    }

    @Override
    public List<String> convertToString(List<Customer> customerList) {
        List<String> strings = new ArrayList<>();
        for (Customer customer : customerList) {
            strings.add(
                    customer.getCodePerson() + COMMA +
                            customer.getFullName() + COMMA +
                            customer.getBirthday() + COMMA +
                            customer.getGender() + COMMA +
                            customer.getIdentityCard() + COMMA +
                            customer.getPhone() + COMMA +
                            customer.getEmail() + COMMA +
                            customer.getTypeCustomer() + COMMA +
                            customer.getLocation());
        }
        return strings;
    }

    @Override
    public List<Customer> convertToE(List<String> strings) {
        List<Customer> customerList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            customerList.add(new Customer(data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8]));
        }
        return customerList;
    }
}
