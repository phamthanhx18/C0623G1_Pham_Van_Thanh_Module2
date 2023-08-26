package service.impl;

import model.Person.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final ICustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public void editCustomer(String id, Customer customer) {
        customerRepository.editCustomer(id,customer);
    }

    @Override
    public List<Customer> searchCusomer(String name) {
        return customerRepository.searchCusomer(name);
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public List<Customer> getList() {
        return customerRepository.getList();
    }

    @Override
    public void del(String id) {
        customerRepository.del(id);
    }
}
