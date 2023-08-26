package repository;

import model.Book.Contract;

public interface IContactRepository extends IRepository<Contract>{
    void editContract(String id);

}
