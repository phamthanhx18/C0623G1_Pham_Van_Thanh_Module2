package service;

import model.Person.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer>{
    void del(String id);
    void editCustomer(String id, Customer customer);
    List<Customer> searchCusomer(String name);
}
