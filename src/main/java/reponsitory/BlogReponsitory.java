package reponsitory;

import model.Blog;
import model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogReponsitory extends PagingAndSortingRepository<Blog, Long>{
    Iterable<Blog> findAllByProvince(Category category);
    Page<Blog> findAllByFirstNameContaining(String name, Pageable pageable);

}
