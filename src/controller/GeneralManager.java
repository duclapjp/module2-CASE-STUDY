package controller;

import java.util.List;

public interface GeneralManager<T> {
    List<T> showAll();
    void add(T t);
    void edit(int index,T t);
    void delete(int index);
    void check(String code);
}
