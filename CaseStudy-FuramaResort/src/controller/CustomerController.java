package controller;

import model.Person.Customer;
import service.ICustomerService;
import service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private final ICustomerService customerService = new CustomerServiceImpl();
    public void editCustomer(String id, Customer customer) {
        customerService.editCustomer(id,customer);
    }

    public List<Customer> searchCusomer(String name) {
        return customerService.searchCusomer(name);
    }

    public void add(Customer customer) {
        customerService.add(customer);
    }

    public List<Customer> getList() {
        return customerService.getList();
    }

    public void del(String id) {
        customerService.del(id);
    }
}
