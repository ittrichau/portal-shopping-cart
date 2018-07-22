package portal.shopping.portalshoppingproduct.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import portal.shopping.portalshoppingcart.entity.Category;
import portal.shopping.portalshoppingcart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findByCategories(Category category);

	
	List<Product> findByCategoriesId(Long categoryId);
}
