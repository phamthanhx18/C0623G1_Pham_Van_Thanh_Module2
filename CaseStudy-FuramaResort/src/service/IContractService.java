package service;

import model.Book.Contract;

public interface IContractService extends IService<Contract> {
    void del(String id);
    void editContract(String id);
}
