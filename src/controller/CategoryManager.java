package controller;

import molder.Category;
import java.util.List;

public class CategoryManager implements GeneralManager<Category> {
    private List<Category> categoryList;
    @Override
    public List<Category> showAll() {
        return categoryList;
    }

    @Override
    public void add(Category category) {
        categoryList.add(category);
    }

    @Override
    public void edit(int index, Category category) {
categoryList.set(index,category);
    }

    @Override
    public void delete(int index) {
categoryList.remove(index);
    }

    @Override
    public void check(String code) {

    }

}
