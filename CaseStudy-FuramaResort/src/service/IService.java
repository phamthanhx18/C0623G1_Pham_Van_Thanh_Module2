package service;

import java.util.List;

public interface IService<E> {
    void add(E e);
    List<E> getList();
}
