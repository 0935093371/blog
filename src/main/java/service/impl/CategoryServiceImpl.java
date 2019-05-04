package service.impl;

import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import reponsitory.CategoryReponsitory;
import service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryReponsitory categoryReponsitory;

    @Override
    public Iterable<Category> findAll() {
        return categoryReponsitory.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryReponsitory.findOne(id);
    }

    @Override
    public void save(Category category) {
        categoryReponsitory.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryReponsitory.delete(id);
    }
}
