package reponsitory;

import model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryReponsitory extends PagingAndSortingRepository<Category, Long> {
}
