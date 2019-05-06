package service.impl;

import model.Blog;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import reponsitory.BlogReponsitory;
import service.BlogService;

public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogReponsitory blogReponsitory;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogReponsitory.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogReponsitory.findOne(id);
    }

    @Override
    public void save(Blog blog) {

        blogReponsitory.save(blog);
    }

    @Override
    public void remove(Long id) {

        blogReponsitory.delete(id);
    }

    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return blogReponsitory.findAllByCategory(category);
    }

    @Override
    public Page<Blog> findAllByNameContaining(String name, Pageable pageable) {
        return blogReponsitory.findAllByTitleContaining(name,pageable);
    }
}
