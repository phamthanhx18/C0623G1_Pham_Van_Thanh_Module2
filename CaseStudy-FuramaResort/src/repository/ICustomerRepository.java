package repository;

import model.Person.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer>{

    void del(String id);
    void editCustomer(String id, Customer customer);
    List<Customer> searchCusomer(String name);

    List<String> convertToString(List<Customer> e);
    List<Customer> convertToE(List<String> strings);
}
